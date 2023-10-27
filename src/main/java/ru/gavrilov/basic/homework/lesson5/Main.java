package ru.gavrilov.basic.homework.lesson5;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    /*
    Реализуйте метод, принимающий в качестве аргументов целое число
     и строку, и печатающий в консоль строку указанное количество раз----
    -Реализуйте метод, принимающий в качестве аргумента целочисленный
     массив, суммирующий все элементы, значение которых больше 5, и печатающий полученную сумму в консоль.----
    -Реализуйте метод, принимающий в качестве аргументов целое число
     и ссылку на целочисленный массив, метод должен заполниться каждую ячейку массива указанным числом.----
    -Реализуйте метод, принимающий в качестве аргументов целое число
     и ссылку на целочисленный массив, увеличивающий каждый элемент которого на указанное число.----
    -Реализуйте метод, принимающий в качестве аргумента целочисленный
     массив, и печатающий в консоль сумма элементов какой из половин массива больше.----
     Домашнее задание сдается через Pull Request*/
    public static void main(String[] args) {

        String string = "включили отопление! мы не погибли!";

        int[] array = {6, 2, 5, 4, 6, 7, 8, 4, 2, 7, 3, 6, 8, 1, 1};
        int[] array1 = {3, 5, 7, 1, 8, 1, 2, 5};
        int[] array2 = {1, 9};
        int[] array3 = {2, 2, 4};
        int[] array4 = {1, 1, 1, 1, 1, 5};
        int[] array5 = {5, 3, 4, -2};
        int[] array6 = {7, 2, 2, 2};
        int[] array7 = {2, 2, 2, 2};
        int[] emptyArr = new int[7];

//        textConsolePrinter(3, string);
//        System.out.println();
//        arraySum(array1);
//        System.out.println();
//        fillingEmptyArr(5, emptyArr);
//        System.out.println();
//        arrayIncrease(1, array6);
//        System.out.println();
//        comparingHalfArray(array1);

//        summingArrays(array4, array2, array3);
//        equalsPoint(array5);
//        orderElements(array6);
//        reverseArray(array);

    }

    public static void textConsolePrinter(int i, String str) {
        for (int j = 0; j < i; j++) {
            System.out.println(str);
        }
        System.out.println("Весь текст отпечатан");
    }

    public static void arraySum(int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > 5) {
                sum += array[i];
            }
        }
        System.out.println("сумма чисел > 5 в массиве = " + sum);
    }

    public static void fillingEmptyArr(int num, int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = num;
        }
        System.out.println("массив " + array + " заполнен");
        System.out.println(Arrays.toString(array));
    }

    public static void arrayIncrease(int num, int[] arrayLink) {
        System.out.println("исходный массив " + Arrays.toString(arrayLink));
        for (int i = 0; i < arrayLink.length; i++) {
            arrayLink[i] += num;
        }
        System.out.println("каждый элемент массива увеличен на " + num);
        System.out.println("обновленный массив " + Arrays.toString(arrayLink));
    }

    public static void comparingHalfArray(int[] arrayLink) {
        int firstSum = 0;
        int secondSum = 0;

        System.out.println("массив " + Arrays.toString(arrayLink));
        System.out.println("длинна массива " + arrayLink.length);

        if (arrayLink.length % 2 == 1) {
            System.out.println("!внимание! массив нечетной длинны, данные могут быть некорректны");
        }
        for (int i = 0; i < arrayLink.length; i++) {
            if (i < arrayLink.length / 2) {
                firstSum += arrayLink[i];
            } else {
                secondSum += arrayLink[i];
            }
        }
        if (firstSum > secondSum) {
            System.out.println("первая половина массива больше = " + firstSum);
        } else if (firstSum < secondSum) {
            System.out.println("вторая половина массива больше = " + secondSum);
        } else {
            System.out.println("обе половины массива равны " + secondSum);
        }
    }

    /*
    Домашнее задание * (Усложненное)
        Реализуйте метод, принимающий на вход набор целочисленных массивов, и получающий новый
        массив равный сумме входящих;
        Пример:
        { 1, 2, 3 }
        { 2, 2 }
        { 1, 1, 1, 1, 1}
        = { 4, 5, 4, 1, 1 }
        ● Реализуйте метод, проверяющий что есть “точка” в массиве, в которой сумма левой и правой части
        равны. “Точка находится между элементами”;
        Пример: { 1, 1, 1, 1, 1, | 5 }, { 5, | 3, 4, -2 }, { 7, 2, 2, 2 }, { 9, 4 }
        ● Реализуйте метод, проверяющий что все элементы массива идут в порядке убывания или
        возрастания (по выбору пользователя)
        ● Реализуйте метод, “переворачивающий” входящий массив
        Пример: { 1 2 3 4 } => { 4 3 2 1 }
        */
//    int[] array2 = {1, 9};
//    int[] array3 = {2, 2, 4};
//    int[] array4 = {1, 1, 1, 1, 1, 5};
    public static void summingArrays(int[]... args) {
        int[] arraySum = new int[1];
        for (int i = 0; i < args.length; i++) {
            for (int j = 0; j < args[i].length; j++) {
                if (j < arraySum.length) {
                    arraySum[j] += args[i][j];
                } else {
                    arraySum = increaseArray(arraySum);
                    arraySum[j] += args[i][j];
                }
            }
        }
        System.out.println(Arrays.toString(arraySum));
    }

    public static int[] increaseArray(int[] oldArray) {
        int[] newArray = new int[oldArray.length + 1];
        for (int i = 0; i < oldArray.length; i++) {
            newArray[i] = oldArray[i];
        }
        return newArray;
    }

    public static void equalsPoint(int[] array) {
        int rightSum = 0;
        int leftSum = 0;
        for (int i = 0; i < array.length; i++) {
            rightSum += array[i];
        }
        for (int i = 0; i < array.length; i++) {
            if (leftSum == rightSum) {
                System.out.println("точка находится между " + array[i - 1] + " " + array[i]);
                return;
            }
            rightSum -= array[i];
            leftSum += array[i];
        }
    }

    public static void orderElements(int[] array) {
        //5 line less
        Scanner scanner = new Scanner(System.in);
        System.out.println("Выберите режим: ");
        System.out.println("1 по возрастанию ");
        System.out.println("2 по убыванию");

        int userInput = scanner.nextInt();
        boolean incorrect = false;

        System.out.println("заданный массив " + Arrays.toString(array));

        for (int i = 0; i < array.length - 1; i++) {
            if (userInput == 1) {
                if (array[i + 1] < array[i]) {
                    incorrect = true;
                    System.out.println("element = " + array[i] + " at index " + i + " > " + "element = " + array[i + 1] + " at index " + (i + 1));
                }
            } else {
                if (array[i + 1] > array[i]) {
                    incorrect = true;
                    System.out.println("element = " + array[i] + " at index " + i + " < " + "element = " + array[i + 1] + " at index " + (i + 1));
                }
            }
        }
        if (!incorrect) {
            System.out.println("все элементы идут в заданном порядке");
        }
    }
//        if (userInput == 1) {
//            for (int i = 0; i < array.length - 1; i++) {
//                if (array[i + 1] < array[i]) {
//                    incorrect = true;
//                    System.out.println("element " + array[i] + " at index " + i + " > " + "element " + array[i + 1] + " at index  " + (i + 1));
//                }
//            }
//            if (!incorrect) {
//                System.out.println("все элементы идут в порядке возрастания");
//            }
//
//        } else {
//            for (int i = 0; i < array.length - 1; i++) {
//                if (array[i + 1] > array[i]) {
//                    incorrect = true;
//                    System.out.println("element " + array[i] + " at index " + i + " < " + "element " + array[i + 1] + " at index  " + (i + 1));
//                }
//            }
//            if (!incorrect) {
//                System.out.println("все элементы идут в порядке убывания");
//            }
//        }

    //    }
    //{3, 5, 7, 1, 8, 1, 2};
    public static void reverseArray(int[] array) {
        System.out.println("source array");
        System.out.println(Arrays.toString(array));
        int end = array.length - 1;
        int tmp;
        for (int i = 0; i < end; i++) {
            tmp = array[i];
            array[i] = array[end];
            array[end] = tmp;
            end--;
        }
        System.out.println("reversed array");
        System.out.println(Arrays.toString(array));
    }
}


