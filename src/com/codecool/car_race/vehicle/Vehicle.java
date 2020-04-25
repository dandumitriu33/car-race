package com.codecool.car_race.vehicle;

public interface Vehicle {

    public void prepareForLap();

    public void moveForAnHour();

    public void setDistanceTraveled(int speed);

    public String getTypeOfVehicle();

    public String getName();

    public int getDistanceTraveled();
}
