package ru.gavrilov.basic.homework.lesson13;

public class Horse implements Transport {
    private String name;
    private boolean driver;
    private int stamina = 500;

    public Horse(String name) {
        this.name = name;
    }

    @Override
    public boolean drive(Terrain terrain, String driverName, int distance) {
        if (terrain.equals(Terrain.SWAMP)) {
            System.out.println(name + " will not be able to pass here");
            return false;
        }

        if (stamina == 0) {
            System.out.println(name + " is exhausted, need to rest");
            return false;
        }

        if (distance * 5 > stamina) {
            System.out.println("stamina is out " + name + " need to rest");
            System.out.println(name + " drove  " + stamina / 5 + " km through the " + terrain.getName());
            stamina = 0;
            return false;
        }

        stamina -= distance * 5;
        System.out.println(driverName + " on " + name + " drove through the " + terrain.getName() + " " + distance + " km");
        System.out.println(name + " stamina is " + stamina);
        return true;
    }

    @Override
    public void setDriver(boolean driver) {
        this.driver = driver;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public boolean getDriver() {
        return driver;
    }
}
