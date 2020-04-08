package com.codecool.car_race.vehicle;

import com.codecool.car_race.Util;
import com.codecool.car_race.Weather;

public class Motorcycle extends Vehicle{
    private int name;
    private int speed;
    private boolean speedAdjusted = false;
    private static int numberOfMotorcycles = 0;

    {
        numberOfMotorcycles += 1;
    }

    public Motorcycle() {
        super();
        this.name = numberOfMotorcycles;
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
        if (Weather.getIsRaining() && speedAdjusted==false) {
            int speedReduction = Util.randomNumberFromRange(5, 50);
            this.speed = 100 - speedReduction;
            speedAdjusted = true;
        }
    }

    @Override
    public void moveForAnHour() {
        this.prepareForLap();
        this.setDistanceTraveled(this.speed);
    }


}
