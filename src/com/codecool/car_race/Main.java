package com.codecool.car_race;


import com.codecool.car_race.vehicle.Car;
import com.codecool.car_race.vehicle.Motorcycle;
import com.codecool.car_race.vehicle.Truck;
import com.codecool.car_race.vehicle.Vehicle;

import java.util.ArrayList;

public class Main {

    /**
     * Creates all the vehicles that will be part of this race.
     */
    private static void createVehicles(Race race) {
        for (int i=0; i<10; i++) {
            Car tempCar = new Car();
            race.addRacer(tempCar);
            Truck tempTruck = new Truck();
            race.addRacer(tempTruck);
            Motorcycle tempMotorcycle = new Motorcycle();
            race.addRacer(tempMotorcycle);
        }
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
//
//        race.simulateRace();
//        race.printRaceResults();


        Car brrr = new Car();
        System.out.println("name: " + brrr.getName());
        System.out.println("distance traveled: " + brrr.getDistanceTraveled());
        brrr.setDistanceTraveled();
        System.out.println("distance traveled: " + brrr.getDistanceTraveled());
        System.out.println("speed: " + brrr.getSpeed());

        Truck jimmy = new Truck();
        System.out.println("Truck name: " + jimmy.getName());
        System.out.println("Truck speed: " + jimmy.getSpeed());

        Motorcycle greg = new Motorcycle();
        Motorcycle joe = new Motorcycle();
        System.out.println("Motorcycle name: " + joe.getName());
        System.out.println("Motorcycle speed: " + joe.getSpeed());

        ArrayList<Vehicle> all = race.getRacers();
        for (int i=0; i<all.size(); i++) {
            System.out.println(all.get(i).getClass());
        }
    }
}
