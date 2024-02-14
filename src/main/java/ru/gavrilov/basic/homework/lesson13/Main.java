package ru.gavrilov.basic.homework.lesson13;

public class Main {
    public static void main(String[] args) {
        Human human = new Human("Bob");
        Human human2 = new Human("Jack");

        Transport[] transport = {
                new Rover("Buggie"),
                new Bicycle("kama"),
                new Car("impala"),
                new Horse("plotva")
        };

        human.getOnTransport(transport[3]);
        human.move(Terrain.DEEP_FOREST, 20);
        human.leaveTransport();
        human.move(Terrain.PLAIN, 12);
        human.getOnTransport(transport[2]);
        human2.getOnTransport(transport[3]);
        human.move(Terrain.DEEP_FOREST, 23);
        human.move(Terrain.SWAMP, 11);
        human.move(Terrain.PLAIN, 12);
        human2.move(Terrain.SWAMP, 2);
        human2.move(Terrain.DEEP_FOREST, 1);
        human2.move(Terrain.SWAMP, 4);
        human2.move(Terrain.PLAIN, 55);
        human.leaveTransport();
        human.move(Terrain.DEEP_FOREST, 1);
        human.getOnTransport(transport[2]);
        human.move(Terrain.PLAIN, 20);
        human.leaveTransport();
        human.leaveTransport();
        human.move(Terrain.DEEP_FOREST, 1);
    }
}
