package com.codecool.car_race.vehicle;

// vehicle factory

public class VehicleFactory {

    public Vehicle createVehicle(String vehicleType) {
        if (vehicleType==null) {
            return null;
        }
        if (vehicleType.equalsIgnoreCase("CAR")){
            return new Car();
        }
        else if (vehicleType.equalsIgnoreCase("TRUCK")) {
            return new Truck();
        }
        else if (vehicleType.equalsIgnoreCase("MOTORCYCLE")) {
            return new Motorcycle();
        }
        return null;
    }


}
