package com.design.parkinglot;

import java.time.Instant;
import java.util.UUID;

public class Ticket {
    private final String ticketId;
    private final String spotId;
    private final int    floorNumber;
    private final String licensePlate;
    private final Instant entryTime;

    public Ticket(String spotId, int floorNumber, String licensePlate) {
        this.ticketId    = UUID.randomUUID().toString();
        this.spotId      = spotId;
        this.floorNumber = floorNumber;
        this.licensePlate = licensePlate;
        this.entryTime   = Instant.now();
    }

    public String getTicketId()    { return ticketId; }
    public String getSpotId()      { return spotId; }
    public int getFloorNumber()    { return floorNumber; }
    public Instant getEntryTime()  { return entryTime; }
}
