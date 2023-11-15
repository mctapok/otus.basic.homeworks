package ru.gavrilov.basic.homework.lesson11.Animals;

public class Dog extends Animal {
    public Dog(String name, int stamina, float runSpeed, float swimSpeed) {
        this.name = name;
        this.stamina = stamina;
        this.runSpeed = runSpeed;
//        this.fullStamina = stamina;
        this.swimSpeed = swimSpeed;
        this.swimRatio = 2;

    }

//    @Override
//    public float swim(int distance) {
//        if (distance > stamina / 2) {
//            System.out.println(name + " не смог проплыть " + distance + "м\n");
//            stamina = 0;
//            return -1;
//        }
//        float time = distance / swimSpeed;
//        stamina = (stamina / 2) - distance;
//        System.out.println(name + " проплыл " + distance + "м" + " за " + String.format("%.1f", time) + "c\n");
//        return time;
//    }
}
