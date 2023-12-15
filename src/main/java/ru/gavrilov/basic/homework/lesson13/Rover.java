package ru.gavrilov.basic.homework.lesson13;

public class Rover implements Transport {
    private String title;
    boolean driver;
    private int fuel = 100;

    public Rover(String title) {
        this.title = title;
    }

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

    @Override
    public boolean drive(Terrain terrain, String driverName, int distance) {
        if (fuel == 0) {
            System.out.println("there is no fuel in the " + title);
            return false;
        }
        if (distance * 2 > fuel) {
            System.out.println("fuel is out " + title + " need to refuel");
            System.out.println(title + " drove " + (fuel / 2) + " km through the " + terrain.getName());
            fuel = 0;
            return false;
        }

        fuel -= distance * 2;
        System.out.println(driverName + " on " + title + " drove through the " + terrain.getName() + " " + distance + " km");
        System.out.println("fuel in the rover " + fuel + "L");
        return true;
    }
}
