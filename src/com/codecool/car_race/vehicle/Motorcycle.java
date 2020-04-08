package com.codecool.car_race.vehicle;

import com.codecool.car_race.Util;

public class Motorcycle extends Vehicle{
    private int name;
    private int speed;
    private static int numberOfMotorcycles = 0;

    {
        numberOfMotorcycles += 1;
    }

    public Motorcycle() {
        super();
        this.name = numberOfMotorcycles;
        this.speed = 100;
    }

    public int getName() {
        return this.name;
    }

    public int getSpeed() {
        return this.speed;
    }


    @Override
    public void prepareForLap() {

    }

    @Override
    public void moveForAnHour() {

    }


}
