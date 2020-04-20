package com.codecool.car_race.vehicle;

// Abstract Product

public interface VehicleInterface {

    public void prepareForLap();

    public void moveForAnHour();

    public void setDistanceTraveled(int speed);

    public String getTypeOfVehicle();
}
