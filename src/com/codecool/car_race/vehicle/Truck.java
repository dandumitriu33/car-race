package com.codecool.car_race.vehicle;
import com.codecool.car_race.Race;
import com.codecool.car_race.Util;

// Concrete Product Truck

public class Truck implements VehicleInterface{
    private int name;
    private int speed;
    private final int BREAK_CHANCE = 5;
    private int breakdownTurnsLeft = 0;
    private String typeOfVehicle;
    private int distanceTraveled;

    public Truck() {
        super();
        this.name = Util.randomNumberFromRange(0, 1000);
        this.speed = 100;
        this.typeOfVehicle = "Truck";
        this.distanceTraveled = 0;
    }

    public String getName() {
        return String.valueOf(this.name);
    }

    @Override
    public String getTypeOfVehicle() {
        return typeOfVehicle;
    }

    public int getSpeed() {
        return this.speed;
    }

    @Override
    public void prepareForLap() {
        int decideBreakDown = Util.randomNumberFromRange(1, 100);
        if (decideBreakDown <= BREAK_CHANCE) {
            breakdownTurnsLeft = 2;
        }
        if (this.breakdownTurnsLeft>0) {
            speed=0;
            this.breakdownTurnsLeft--;
            Race.setIsThereABrokenTruck(true);
        }
        else {
            speed = 100;
        }
    }

    @Override
    public void moveForAnHour() {
        this.prepareForLap();
        this.setDistanceTraveled(speed);
    }

    @Override
    public void setDistanceTraveled(int speed) {
        distanceTraveled += speed;
    }


}
