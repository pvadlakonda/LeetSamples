package com.design.parkinglot;

public class ParkingSpot {
    private final String spotId;
    private final SpotSize size;
    private Vehicle parkedVehicle;        // null = available

    public ParkingSpot(String spotId, SpotSize size) {
        this.spotId = spotId;
        this.size   = size;
    }

    public synchronized boolean isAvailable() {
        return parkedVehicle == null;
    }

    // A SMALL spot fits SMALL only; MEDIUM fits SMALL + MEDIUM; LARGE fits all
    public synchronized boolean canFit(Vehicle v) {
        return isAvailable() && size.ordinal() >= v.getRequiredSize().ordinal();
    }

    public synchronized boolean park(Vehicle v) {
        if (!canFit(v)) return false;
        parkedVehicle = v;
        return true;
    }

    public synchronized Vehicle vacate() {
        Vehicle v   = parkedVehicle;
        parkedVehicle = null;
        return v;
    }

    public String getSpotId()   { return spotId; }
    public SpotSize getSize()   { return size; }
}