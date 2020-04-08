package com.codecool.car_race;

import com.codecool.car_race.vehicle.Vehicle;

import java.util.ArrayList;

public class Race {
    private int laps;
    private ArrayList<Vehicle> racers = new ArrayList<>();

    public Race() {

    }

    public void setLaps(int laps) {
        this.laps = laps;
    }

    public int getLaps() {
        return this.laps;
    }


    public void addRacer(Vehicle racer) {
        this.racers.add(racer);
    }

    public ArrayList<Vehicle> getRacers() {
        return this.racers;
    }

}
