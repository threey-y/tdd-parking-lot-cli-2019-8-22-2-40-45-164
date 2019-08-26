package com.oocl.cultivation;

import java.util.HashMap;
import java.util.Map;

public class ParkingBoy {

    private final ParkingLot parkingLot;
    private String lastErrorMessage;
    private Map<ParkingTicket, Car> cars = new HashMap<>();

    public ParkingBoy(ParkingLot parkingLot) {
        this.parkingLot = parkingLot;
    }

    public ParkingTicket park(Car car) {
        ParkingTicket ticket = parkingLot.park(car);
        cars.put(ticket,car);
        return ticket;
    }

    public Car fetch(ParkingTicket ticket) {
        Car car = new Car();
        car = cars.get(ticket);
        return car;
    }

    public String getLastErrorMessage() {
        return lastErrorMessage;
    }
}
