package ru.gavrilov.basic.homework.lesson13;

public interface Transport {
    boolean drive(Terrain terrain, String driverName, int distance);

    void setDriver(boolean driver);

    String getName();

    boolean getDriver();
}
