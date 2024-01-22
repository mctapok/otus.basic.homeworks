package ru.gavrilov.basic.homework.lesson27;

public class Main {
    public static void main(String[] args) {
        Apple apple = new Apple(100);
        Apple apple1 = new Apple(80);
        Apple apple2 = new Apple(90);
        Orange orange = new Orange(115);
        Orange orange1 = new Orange(95);
        Box<Apple> appleBox = new Box<>();
        Box<Orange> orangeBox = new Box<>();
        Box<Orange> orangeBox1 = new Box<>();
        Box<Fruit> fruitBox = new Box<>();

        appleBox.addFruit(apple, apple1, apple2, apple);
        orangeBox.addFruit(orange, orange1, orange1);
        fruitBox.addFruit(apple, orange1, apple2);
        System.out.println(appleBox.weightCalculate());
        System.out.println(orangeBox.weightCalculate());
        System.out.println(appleBox.compareBox(orangeBox));
        appleBox.weightCalculate();
        System.out.println(orangeBox + " | " + orangeBox1);
        orangeBox.transfer(orangeBox1);
        orangeBox1.transfer(orangeBox1);
        System.out.println(orangeBox + " | " + orangeBox1);
        System.out.println(appleBox + " | " + fruitBox);
        appleBox.transfer(fruitBox);
        System.out.println(appleBox + " | " + fruitBox);
    }
}
