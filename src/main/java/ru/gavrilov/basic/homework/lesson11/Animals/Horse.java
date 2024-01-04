package ru.gavrilov.basic.homework.lesson11.Animals;

public class Horse extends Animal {

    public Horse(String name, int stamina, float runSpeed, float swimSpeed) {
        this.name = name;
        this.stamina = stamina;
        this.runSpeed = runSpeed;
//        this.fullStamina = stamina;
        this.swimSpeed = swimSpeed;
        this.swimRatio = 4;
    }

//    @Override
//    public float swim(int distance) {
//        if (distance > stamina / 4) {
//            System.out.println(name + " не смог проплыть " + distance + "м\n");
//            stamina = 0;
//            return -1;
//        }
//        float time = distance / swimSpeed;
//        stamina = (stamina / 4) - distance;
//        System.out.println(name + " проплыл " + distance + "м" + " за " + String.format("%.1f", time) + "c\n");
//        return time;
//    }
}
