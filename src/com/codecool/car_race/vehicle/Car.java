package com.codecool.car_race.vehicle;
import com.codecool.car_race.Race;
import com.codecool.car_race.Util;
import com.codecool.car_race.Weather;

import java.util.Random;

public class Car extends Vehicle implements CarInterface{
    private String name;
    private int speed;

    public Car(){
        super();
        this.name = randomizeCarName();
        this.speed = Util.randomNumberFromRange(80, 110);
    }

    public String getName() {
        return this.name;
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
        if (Race.getIsThereABrokenTruck()) {
            this.speed = 75;
        }
    }

    @Override
    public void moveForAnHour() {
        this.prepareForLap();
        this.setDistanceTraveled(speed);
    }

    private String randomizeCarName() {
        String[] brand = {"Volkswagen", "Ford", "Dacia", "Ferrari", "Toyota", "Renault"};
        String[] model = {"Vagabond", "Fang", "Guardian", "Silver", "Lioness", "Capital",
                            "Vulture", "Bullet", "Tarragon", "Formula"};
        String name = "";
        int randomNumber = Util.randomNumberFromRange(0, brand.length-1);
        name += brand[randomNumber];
        randomNumber = Util.randomNumberFromRange(0, model.length-1);
        name += " " + model[randomNumber];
        return name;
    }




}
