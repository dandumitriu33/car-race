package com.codecool.car_race.vehicle;

import com.codecool.car_race.Util;

import java.util.Random;

public class Car extends Vehicle {
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

    public int getSpeed() {
        return this.speed;
    }

    @Override
    public void prepareForLap() {

    }

    @Override
    public void moveForAnHour() {

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
