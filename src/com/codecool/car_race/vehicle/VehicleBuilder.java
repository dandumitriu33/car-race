package com.codecool.car_race.vehicle;

public class VehicleBuilder {

    public void buildVehicle(VehicleFactory vehicleFactory) {
        Vehicle vehicle = vehicleFactory.createVehicle();
    }

}
