package ru.gavrilov.basic.homework.lesson10;

public class Box {
    private final int size;
    private String color;
    private boolean isOpen;
    private boolean isEmpty = true;
    private String item;

    public Box(int size, String color) {
        this.size = size;
        this.color = color;
    }

    public void setColor(String color) {
        this.color = color;
        System.out.println("вы покрасили коробку в " + this.color);
    }

    public void openBox() {
        if (isOpen) {
            System.out.println("Коробка уже открыта");
            return;
        }
        isOpen = true;
        System.out.println("Вы открыли коробку");
    }

    public void closeBox() {
        if (!isOpen) {
            System.out.println("Коробка уже закрыта");
            return;
        }
        isOpen = false;
        System.out.println("Вы закрыли коробку");
    }

    public void putInBox(String item) {
        if (isEmpty) {
            System.out.println("Вы положили в коробку " + item);
            this.item = item;
            isEmpty = false;
        } else {
            System.out.println("В коробке нет места, там уже лежит " + this.item);
        }
    }

    public void clearBox() {
        if (!isOpen) {
            System.out.println("Вы попытались убрать предмет из коробки не открыв ее");
            System.out.println("Сначало надо открыть коробку");
            return;
        }
        isEmpty = true;
        System.out.println("Вы убрали предмет из коробки");
    }

    public void boxInfo() {
        System.out.println("Коробка размером " + size + " цвета " + color);
        if (isOpen) {
            System.out.println("открыта");
        } else {
            System.out.println("закрыта");
        }
        if (isEmpty) {
            System.out.println("в ней ничего нет");
        } else {
            System.out.println("в ней лежит " + item);
        }
        System.out.println();
    }
}
