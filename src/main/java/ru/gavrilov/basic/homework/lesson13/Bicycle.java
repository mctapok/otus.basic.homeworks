package ru.gavrilov.basic.homework.lesson13;

public class Bicycle implements Transport {
    private String title;
    private boolean driver;

    public Bicycle(String title) {
        this.title = title;
    }

    @Override
    public boolean drive(Terrain terrain, String driverName, int distance) {
        if (terrain.equals(Terrain.SWAMP)) {
            System.out.println(title + " will not ba able to pass here");
            return false;
        }

        System.out.println(driverName + " on " + title + " drove through the " + terrain.getName() + " " + distance + " km");
        return true;
    }

    @Override
    public void setDriver(boolean driver) {
        this.driver = driver;
    }

    @Override
    public String getName() {
        return title;
    }

    @Override
    public boolean getDriver() {
        return driver;
    }
}
