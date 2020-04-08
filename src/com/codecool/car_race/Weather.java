package com.codecool.car_race;

public class Weather {
    private static boolean isRaining = false;

    public static void setRaining(boolean raining) {
        isRaining = raining;
    }

    public static boolean getIsRaining() {
        return isRaining;
    }

}
