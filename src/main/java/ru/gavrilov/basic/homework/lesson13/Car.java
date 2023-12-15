package ru.gavrilov.basic.homework.lesson13;

public class Car implements Transport {
    private String title;
    private boolean driver;
    private int fuel = 60;

    public Car(String title) {
        this.title = title;
    }

    @Override
    public boolean drive(Terrain terrain, String driverName, int distance) {
        if (fuel == 0) {
            System.out.println("there is no fuel in the " + title);
            return false;
        }
        if (terrain.equals(Terrain.SWAMP) || terrain.equals(Terrain.DEEP_FOREST)) {
            System.out.println(title + " will not be able to pass here");
            return false;
        }

        if (distance > fuel) {
            System.out.println("fuel is out " + title + " need to refuel");
            System.out.println(title + " drove " + fuel + " km through the " + terrain.getName());
            fuel = 0;
            return false;
        }

        fuel -= distance;
        System.out.println(driverName + " on " + title + " drove through the " + terrain.getName() + " " + distance + " km");
        System.out.println("fuel in the car " + fuel + "L");
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
