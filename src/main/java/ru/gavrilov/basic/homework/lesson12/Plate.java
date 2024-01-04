package ru.gavrilov.basic.homework.lesson12;

public class Plate {
    private int volume;
    private int currentFood;

    public Plate(int volume) {
        this.volume = volume;
        this.currentFood = volume;
    }

    public void addFood(int addFood) {
        if (currentFood == volume) {
            System.out.println("can't add food, max food in the plate");
            return;
        }
        if (currentFood + addFood > volume) {
            System.out.println("add " + addFood + " food");
            System.out.println("too much for this plate, " + (addFood - (volume - currentFood)) + " pieces did not fit");
            currentFood = volume;
            return;
        }
        System.out.println("add " + addFood + " food");
        currentFood += addFood;
    }

    public boolean decreaseFood(int amount) {
        if (currentFood - amount >= 0) {
            currentFood -= amount;
            return true;
        }
        System.out.println("can't feed a cat, not enough food");
        return false;
    }

    public void info() {
        System.out.println(currentFood + " food left in the plate");
    }
//    public int decreaseFood(int amount){
//        if(currentFood-amount < 0) currentFood = 0;
//        return currentFood;
//    }
}
