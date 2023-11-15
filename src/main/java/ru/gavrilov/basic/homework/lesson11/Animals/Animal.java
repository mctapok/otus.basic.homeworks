package ru.gavrilov.basic.homework.lesson11.Animals;

public abstract class Animal {
    String name;
    float runSpeed;
    int stamina;
    float swimSpeed;
    int fullStamina;
    int swimRatio;

    public float run(int distance) {
        if (distance > stamina) {
            System.out.println(name + " не справился с дистанцией потратив всю выносливость\n");
            stamina = 0;
            return -1;
        }
        float time = distance / runSpeed;
        stamina -= distance;
        System.out.println(name + " пробежал " + distance + "м за " + String.format("%.1f", time) + "c\n");
        return time;
    }

    public void rest() {
        System.out.println(name + " отдохнул и востановил " + (fullStamina - stamina) + " единиц выносливости\n");
        stamina = fullStamina;
    }

    public float swim(int distance) {
        if (distance > stamina) {
            System.out.println(name + " не смог проплыть " + distance + "м\n");
            stamina = 0;
            return -1;
        }
        float time = distance / swimSpeed;
        stamina = stamina - (distance * swimRatio);
        System.out.println(name + " проплыл " + distance + "м" + " за " + String.format("%.1f", time) + "c\n");
        return time;
    }

    ;

    public void info() {
        System.out.println(name + "\nвыносливость: " + stamina + "\nскорость бега (м/с): " + runSpeed + "\nскорость плавания (м/с): " + swimSpeed + "\n");
    }
}
