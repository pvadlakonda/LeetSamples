package com.design.parkinglot;

// ── Vehicle ──────────────────────────────────────────────────────────────────

public abstract class Vehicle {
    private final String licensePlate;
    private final SpotSize requiredSize;

    protected Vehicle(String licensePlate, SpotSize requiredSize) {
        this.licensePlate = licensePlate;
        this.requiredSize = requiredSize;
    }

    public String getLicensePlate() { return licensePlate; }
    public SpotSize getRequiredSize() { return requiredSize; }
}
