package com.codecool.car_race;

import com.codecool.car_race.vehicle.*;

public class Main {

    /**
     * Creates all the vehicles that will be part of this race.
     */
    private static void createVehicles(Race race) {
        VehicleBuilder builder = new VehicleBuilder();
        VehicleFactory vehicleFactory = new TruckFactory();
        race.addRacer(builder.buildVehicle(vehicleFactory));


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
