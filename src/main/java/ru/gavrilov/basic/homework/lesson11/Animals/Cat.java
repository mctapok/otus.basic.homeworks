package ru.gavrilov.basic.homework.lesson11.Animals;


public class Cat extends Animal {

    public Cat(String name, int stamina, float runSpeed) {
        this.name = name;
        this.stamina = stamina;
        this.runSpeed = runSpeed;
//        this.fullStamina = stamina;
   }

    @Override
    public float swim(int distance) {
        System.out.println(name + " не умеет плавать\n");
        return -1;
    }
}
