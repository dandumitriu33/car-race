package com.codecool.car_race;

import com.codecool.car_race.vehicle.*;

public class Main {

    /**
     * Creates all the vehicles that will be part of this race.
     */
    private static void createVehicles(Race race) {
        VehicleFactory vehicleFactory = new VehicleFactory();
        for (int i=0; i<10; i++) {
            Vehicle vehicle1 = vehicleFactory.createVehicle("CAR");
            race.addRacer(vehicle1);
            Vehicle vehicle2 = vehicleFactory.createVehicle("TRUCK");
            race.addRacer(vehicle2);
            Vehicle vehicle3 = vehicleFactory.createVehicle("MOTORCYCLE");
            race.addRacer(vehicle3);
        }
//        for (int i=0; i<10; i++) {
//            Car tempCar = new Car();
//            race.addRacer(tempCar);
//            Truck tempTruck = new Truck();
//            race.addRacer(tempTruck);
//            Motorcycle tempMotorcycle = new Motorcycle();
//            race.addRacer(tempMotorcycle);
//        }
    }

    /**
     * Entry point of our program. Creates one race instance and
     * uses that.
     * <p>
     *
     * @param args commandline arguments passed to the program.
     *             It is unused.
     */
    public static void main(String[] args) {
        Race race = new Race();
        createVehicles(race);

        race.simulateRace(50);
        race.printRaceResults();

    }
}
