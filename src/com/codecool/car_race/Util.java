package com.codecool.car_race;

import java.util.Random;

public class Util {

    public static int randomNumberFromRange(int min, int max) {
        Random r = new Random();
        int randomNumber = r.nextInt((max - min) + 1) + min;
        return randomNumber;
    }

}
