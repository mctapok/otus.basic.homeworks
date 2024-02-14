package ru.gavrilov.basic.homework.lesson13;

public class Human {
    private String name;
    private Transport currentTransport;

    public Human(String name) {
        this.name = name;
    }

    public void getOnTransport(Transport transport) {
        if (currentTransport != null) {
            System.out.println(name + " already get on " + transport.getName());
            return;
        }
        if (transport.getDriver()) {
            System.out.println(transport.getName() + " already has a driver " + name + " can't get on " + transport.getName());
            return;
        }
        transport.setDriver(true);
        this.currentTransport = transport;
        System.out.println(name + " get on " + currentTransport.getName());
    }

    public boolean move(Terrain terrain, int distance) {
        if (currentTransport != null) {
            return currentTransport.drive(terrain, this.name, distance);
        }
        walk(terrain, distance);
        return true;
    }

    public void leaveTransport() {
        if (currentTransport != null) {
            System.out.println(name + " leave " + currentTransport.getName());
            currentTransport.setDriver(false);
            currentTransport = null;
            return;
        }
        System.out.println(name + " has no transport");
    }

    public boolean walk(Terrain terrain, int distance) {
        System.out.println(name + " walk " + distance + "km through the " + terrain.getName());
        return true;
    }
}
