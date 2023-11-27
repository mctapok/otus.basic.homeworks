package ru.gavrilov.basic.homework.lesson13;

public enum Terrain {
    DEEP_FOREST("black forest"), SWAMP("stinky swamp"), PLAIN("green plain");

    private String name;

    public String getName() {
        return name;
    }

    Terrain(String name) {
        this.name = name;
    }
}
