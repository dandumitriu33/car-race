package com.codecool.car_race.vehicle;

// Concrete Factory

public class TruckFactory implements VehicleFactory{

    public Truck createVehicle() {
        Truck vehicle = new Truck();
        return vehicle;
    }
}
