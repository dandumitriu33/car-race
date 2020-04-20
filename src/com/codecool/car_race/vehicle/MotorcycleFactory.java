package com.codecool.car_race.vehicle;

// Concrete Factory

public class MotorcycleFactory implements VehicleFactory {

    public Truck createVehicle() {
        Motorcycle vehicle = new Motorcycle();
        return vehicle;
    }
}
