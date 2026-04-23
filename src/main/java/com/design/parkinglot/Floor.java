package com.design.parkinglot;

import java.util.EnumMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.concurrent.atomic.AtomicInteger;

public class Floor {
    private final int floorNumber;
    private final List<ParkingSpot> spots;

    // Per-size available counts — updated atomically so callers can check
    // without scanning all spots. AtomicInteger handles concurrent increments
    // from multiple entry lanes on the same floor.
    private final Map<SpotSize, AtomicInteger> availableCounts;

    public Floor(int floorNumber, List<ParkingSpot> spots) {
        this.floorNumber = floorNumber;
        this.spots       = spots;

        availableCounts = new EnumMap<>(SpotSize.class);
        for (SpotSize s : SpotSize.values()) {
            long count = spots.stream()
                    .filter(sp -> sp.getSize() == s)
                    .count();
            availableCounts.put(s, new AtomicInteger((int) count));
        }
    }

    public Optional<ParkingSpot> findAndPark(Vehicle vehicle) {
        for (ParkingSpot spot : spots) {
            if (spot.park(vehicle)) {
                // Decrement the count for the spot's actual size
                availableCounts.get(spot.getSize()).decrementAndGet();
                return Optional.of(spot);
            }
        }
        return Optional.empty();
    }

    public void release(ParkingSpot spot) {
        spot.vacate();
        availableCounts.get(spot.getSize()).incrementAndGet();
    }

    public int getAvailableCount(SpotSize size) {
        // A motorcycle (SMALL) can use SMALL, MEDIUM, or LARGE spots
        return availableCounts.entrySet().stream()
                .filter(e -> e.getKey().ordinal() >= size.ordinal())
                .mapToInt(e -> e.getValue().get())
                .sum();
    }

    public int getTotalAvailable() {
        return availableCounts.values().stream()
                .mapToInt(AtomicInteger::get)
                .sum();
    }

    public int getFloorNumber() { return floorNumber; }
}