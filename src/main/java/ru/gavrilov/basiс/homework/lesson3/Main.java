package ru.gavrilov.basiс.homework.lesson3;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*
         * int a,b,c, initValue, data
         * boolean increment
         *
         * randomizer()
         * booleanRandomizer()
         *
         * compareNumbers(randomNumbers[0],randomNumbers[1])
         * addOrSubtractAndPrint(randomNumbers[3],randomNumbers[4], increment)
         *
         * */

        int[] numArray = randomizer();
        boolean increment = boolRandomizer();
        System.out.println(increment);
        System.out.println(Arrays.toString(numArray));

        String userInput;
        Scanner scanner = new Scanner(System.in);
        //text block unsupported in 11
        System.out.println("Выберите опцию: ");
        System.out.println("1: greetings()");
        System.out.println("2: checkSign()");
        System.out.println("3: selectColor()");
        System.out.println("4: compareNumbers()");
        System.out.println("5: addOrSubtractAndPrint()");
        System.out.print("Введите число от 1 до 5: ");
        userInput = scanner.nextLine();

        switch (userInput) {
            case "1":
                greetings();
                break;
            case "2":
                checkSign(numArray[0], numArray[1], numArray[2]);
                break;
            case "3":
                selectColor(numArray[3]);
                break;
            case "4":
                compareNumbers(numArray[0], numArray[1]);
                break;
            case "5":
                addOrSubtractAndPrint(numArray[4], numArray[5], increment);
                break;
            default:
                throw new IllegalArgumentException("Попробуйте еще раз");
        }
    }

    public static int[] randomizer() {
        int[] array = new int[6];
        for (int i = 0; i < array.length; i++) {
            array[i] = -10 + (int) (Math.random() * 40 + 1);
        }
        return array;
    }

    public static boolean boolRandomizer() {
        return Math.random() > 0.5;
    }

    public static void greetings() {
        System.out.println("Hello");
        System.out.println("World");
        System.out.println("from");
        System.out.println("Java");
    }

    public static void checkSign(int a, int b, int c) {
        int sum = a + b + c;
        System.out.println(a + " + " + b + " + " + c + " = " + sum);
        if (sum >= 0) {
            System.out.println("Сумма положительная");
        } else {
            System.out.println("Сумма отрицательная");
        }
    }

    public static void selectColor(int data) {
        if (data <= 10) {
            System.out.println("Красный");
        } else if (data <= 20) {
            System.out.println("Желтый");
        } else {
            System.out.println("Зеленый");
        }
    }

    public static void compareNumbers(int a, int b) {
        if (a >= b) {
            System.out.println("a >= b");
        } else {
            System.out.println("a < b");
        }
    }

    public static void addOrSubtractAndPrint(int initValue, int delta, boolean increment) {
        if (increment) {
            int inc = initValue + delta;
            System.out.printf("%d + %d = %d", initValue, delta, inc);
        } else {
            int dec = initValue - delta;
            System.out.printf("%d - %d = %d", initValue, delta, dec);
        }
    }
}
