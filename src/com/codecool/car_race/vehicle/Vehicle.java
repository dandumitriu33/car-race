package com.codecool.car_race.vehicle;

public abstract class Vehicle {
    private int distanceTraveled;

    public Vehicle() {
        this.distanceTraveled = 0;
    }

    public abstract void prepareForLap();

    public abstract void moveForAnHour();


    public int getDistanceTraveled() {
        return this.distanceTraveled;
    }

    public void setDistanceTraveled(){
        this.distanceTraveled += 5;
    }




}
