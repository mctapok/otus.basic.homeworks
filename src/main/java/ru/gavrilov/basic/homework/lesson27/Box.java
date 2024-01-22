package ru.gavrilov.basic.homework.lesson27;

import java.util.ArrayList;
import java.util.List;

public class Box<T extends Fruit> {
    private List<T> fruits;

    public Box() {
        this.fruits = new ArrayList<>();
    }

    public void addFruit(T... fruit) {
        T[] fruitsArr = fruit;
        for (T f : fruitsArr) {
            fruits.add(f);
        }
    }

    public int weightCalculate() {
        int weight = 0;
        for (T fruit : fruits) {
            weight += fruit.getWeight();
        }
//        System.out.printf("%s weight: %dgm", name, weight);
        return weight;
    }

    public boolean compareBox(Box<?> anotherBox) {
        return this.weightCalculate() == anotherBox.weightCalculate();
//        return Math.abs(this.weightCalculate() - anotherBox.weightCalculate()) < 0.001;
    }

    public void transfer(Box<? super T> anotherBox){
        if (anotherBox.equals(this)){
            System.out.println("Нельзя пересыпать в эту же коробку");
            return;
        }
        anotherBox.fruits.addAll(this.fruits);
        this.fruits.clear();
    }

    @Override
    public String toString() {
        StringBuilder s = new StringBuilder("Fruits in "+ this.getClass().getSimpleName() + ": ");
        for (T fruit : fruits) {
            s.append(fruit.getClass().getSimpleName()).append(" ");
        }
        return String.valueOf(s);
    }
}
