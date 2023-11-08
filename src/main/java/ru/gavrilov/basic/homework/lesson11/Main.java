package ru.gavrilov.basic.homework.lesson11;

import ru.gavrilov.basic.homework.lesson11.Animals.Cat;
import ru.gavrilov.basic.homework.lesson11.Animals.Dog;
import ru.gavrilov.basic.homework.lesson11.Animals.Horse;

public class Main {
    public static void main(String[] args) {
        Horse horse = new Horse("Plotva", 1000, 16.2f, 0.7f);
        Dog dog = new Dog("Barbos", 800,12.7f, 0.9f);
        Cat cat = new Cat("Matroskin", 500, 3.6f);

        horse.info();
        horse.run(400);
        horse.swim(20);
        horse.info();
        horse.run(130);
//        horse.rest();
        horse.info();
        dog.info();
        dog.run(400);
        dog.swim(20);
        dog.run(50);
        dog.info();
        cat.info();
        cat.run(600);
        cat.swim(20);
        cat.info();
    }
}