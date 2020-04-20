package com.codecool.car_race;
import com.codecool.car_race.vehicle.Vehicle;



import java.util.ArrayList;

public class Race {
    private static boolean isThereABrokenTruck;
    private ArrayList<Vehicle> racers = new ArrayList<>();

    public Race() {

    }

    public void addRacer(Vehicle racer) {
        this.racers.add(racer);
    }

    public ArrayList<Vehicle> getRacers() {
        return this.racers;
    }

    public void simulateRace(int laps) {
        final int CHANCE_OF_RAIN = 30;
        int rainDecision = Util.randomNumberFromRange(1, 100);
        if (rainDecision <= CHANCE_OF_RAIN) Weather.setRaining(true);
        System.out.println("chance of rain: " + rainDecision);
        for (int i=0; i<laps; i++) {
            for (int j=0; j<racers.size(); j++) {
                racers.get(j).moveForAnHour();
            }
        }

    }

    public void printRaceResults() {
        ArrayList<Vehicle> all = this.racers;
        for (int i=0; i<all.size(); i++) {
            System.out.println(all.get(i).getClass() + " " + all.get(i).getName() + " " + all.get(i).getDistanceTraveled());
        }
    }

    public static void setIsThereABrokenTruck(boolean brokenTruck) {
        isThereABrokenTruck = brokenTruck;
    }

    public static boolean getIsThereABrokenTruck() {
        return isThereABrokenTruck;
    }

}
