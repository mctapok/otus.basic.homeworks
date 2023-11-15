package ru.gavrilov.basic.homework.lesson12;

public class Cat {
    private final String name;
    private int appetite;
    private boolean fill;

    public Cat(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
    }

    public void eat(Plate plate) {
        System.out.println(name + " went to the plate");
        if (plate.decreaseFood(appetite)) {
            System.out.println(name + " eat");
            fill = true;
        }
    }

    public void info(){
        if (fill){
            System.out.println(name + "'s full");
        }else {
            System.out.println(name + " still hungry");
        }
    }
}
