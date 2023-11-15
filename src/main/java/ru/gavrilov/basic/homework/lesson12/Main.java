package ru.gavrilov.basic.homework.lesson12;

public class Main {
    public static void main(String[] args) {
        Plate plate = new Plate(10);

        Cat[] cats = {new Cat("Markiz", 4),
                new Cat("Liza", 2),
                new Cat("Barsik", 3),
                new Cat("Murzik", 2),
        };

        for (Cat cat :
                cats) {
            cat.eat(plate);
            cat.info();
        }

        plate.info();
        plate.addFood(4);
        cats[3].eat(plate);
        cats[3].info();
        plate.info();
        plate.addFood(7);
        plate.info();
        plate.addFood(1);
        plate.info();

    }
}
