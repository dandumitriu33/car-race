package com.codecool.car_race.vehicle;

import com.codecool.car_race.Race;
import com.codecool.car_race.Util;

public class Truck extends Vehicle {
    private int name;
    private int speed;
    private final int BREAK_CHANCE = 5;
    private int breakdownTurnsLeft = 0;

    public Truck() {
        super();
        this.name = Util.randomNumberFromRange(0, 1000);
        this.speed = 100;
    }

    public String getName() {
        return String.valueOf(this.name);
    }

    public int getSpeed() {
        return this.speed;
    }


    @Override
    public void prepareForLap() {
        if (this.breakdownTurnsLeft>0) {
            speed=0;
            this.breakdownTurnsLeft--;
            Race.setIsThereABrokenTruck(true);
        }
    }

    @Override
    public void moveForAnHour() {
        this.prepareForLap();
        this.setDistanceTraveled(speed);
    }



}
