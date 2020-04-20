package com.codecool.car_race.vehicle;

// Concrete Factory

public class CarFactory implements VehicleFactory{

    public Truck createVehicle() {
        Car vehicle = new Car();
        return vehicle;
    }
}
