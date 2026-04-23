package com.design.parkinglot;

import java.math.BigDecimal;
import java.time.Instant;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.concurrent.ConcurrentHashMap;

public class ParkingLot {
    private static ParkingLot instance;               // Singleton

    private final String name;
    private final List<Floor> floors;
    private final Map<String, Ticket>      activeTickets;  // ticketId → Ticket
    private final Map<String, ParkingSpot> activeSpots;    // ticketId → Spot

    private ParkingLot(String name, List<Floor> floors) {
        this.name          = name;
        this.floors        = floors;
        this.activeTickets = new ConcurrentHashMap<>();
        this.activeSpots   = new ConcurrentHashMap<>();
    }

    public static synchronized ParkingLot getInstance(String name, List<Floor> floors) {
        if (instance == null) instance = new ParkingLot(name, floors);
        return instance;
    }

    public Optional<Ticket> parkVehicle(Vehicle vehicle) {
        for (Floor floor : floors) {
            Optional<ParkingSpot> spot = floor.findAndPark(vehicle);
            if (spot.isPresent()) {
                ParkingSpot ps = spot.get();
                Ticket ticket  = new Ticket(ps.getSpotId(),
                        floor.getFloorNumber(),
                        vehicle.getLicensePlate());
                activeTickets.put(ticket.getTicketId(), ticket);
                activeSpots.put(ticket.getTicketId(), ps);
                return Optional.of(ticket);
            }
        }
        return Optional.empty();    // lot is full
    }

    public Optional<BigDecimal> exitVehicle(String ticketId) {
        Ticket ticket = activeTickets.remove(ticketId);
        if (ticket == null) return Optional.empty();

        ParkingSpot spot = activeSpots.remove(ticketId);
        Floor floor      = floors.get(ticket.getFloorNumber());
        floor.release(spot);

        BigDecimal fee = BigDecimal.valueOf(5.0);
        return Optional.of(fee);
    }

    public int getTotalAvailableSpots() {
        return floors.stream().mapToInt(Floor::getTotalAvailable).sum();
    }

    public int getAvailableSpots(SpotSize size) {
        return floors.stream()
                .mapToInt(f -> f.getAvailableCount(size))
                .sum();
    }

    public Map<Integer, Integer> getAvailableByFloor() {
        Map<Integer, Integer> result = new LinkedHashMap<>();
        for (Floor f : floors) {
            result.put(f.getFloorNumber(), f.getTotalAvailable());
        }
        return result;
    }

    public boolean isFull() {
        return getTotalAvailableSpots() == 0;
    }
}