package com.codecool.car_race.vehicle;
import com.codecool.car_race.Race;
import com.codecool.car_race.Util;

// Concrete Product Car

public class Car implements VehicleInterface{
    private String name;
    private int speed;
    String typeOfVehicle = "Car";


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

    @Override
    public void setDistanceTraveled(int speed) {
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
