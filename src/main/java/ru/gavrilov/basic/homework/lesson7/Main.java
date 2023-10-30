package ru.gavrilov.basic.homework.lesson7;

public class Main {

    //    Реализовать метод sumOfPositiveElements(..), принимающий
//    в качестве аргумента целочисленный двумерный массив,
//    метод должен посчитать и вернуть сумму всех элементов массива, которые больше 0;
//    Реализовать метод, который принимает
//    в качестве аргумента int size и печатает в консоль квадрат
//    из символов * со сторонами соответствующей длины;
//    Реализовать метод, принимающий в качестве аргумента
//    двумерный целочисленный массив, и зануляющий его диагональные
//    элементы (можете выбрать любую из диагоналей, или занулить обе);
//    Реализовать метод findMax(int[][] array) который должен
//    найти и вернуть максимальный элемент массива;
//    Реализуйте метод, который считает сумму элементов
//    второй строки двумерного массива, если второй строки не существует,
//    то в качестве результата необходимо вернуть -1

    public static void main(String[] args) {
        int[][] array = {
                {1, -4, 5, 7, -1},
                null,
                {3, 6, -22, 65, 1},
                {1, 4, 3, 6},
                {5, -7, 3, 21, 8},
        };
        int[][] arr1 = {
                {1, 2, 3},
                {3, 2, 1},
                {2, 1, 3},
        };
        int[][] arr2 = {
                {73, 53, 31},
                {39, 43, 45},
                {28, 16, 56},
        };
        System.out.println(sumOfPositiveElements(arr1));
        printSquare(5);
        zeroDiag(arr1);
        printArray(arr1);
        System.out.println(findMax(arr2));
        System.out.println(secondLineSum(array));
    }


    public static int sumOfPositiveElements(int[][] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j] > 0) {
                    sum += array[i][j];
                }
            }
        }
        return sum;
    }

    public static void printSquare(int size) {
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print(" * ");
            }
            System.out.println();
        }
    }

    public static void printArray(int[][] array) {
        for (int[] row : array) {
            for (int num : row) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }

    public static void zeroDiag(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            array[i][i] = 0;
        }
//        for (int i = 0; i < array.length; i++) {
//            for (int j = 0; j < array[i].length; j++) {
//                if (i == j) {
//                    array[i][j] = 0;
//                }
//                System.out.print(array[i][j] + " ");
//            }
//            System.out.println();
//        }
    }

    public static int findMax(int[][] array) {
        int max = array[0][0];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j] > max) {
                    max = array[i][j];
                }
            }
        }
        return max;
    }

    public static int secondLineSum(int[][] array) {
        int sum = 0;
        if (array[1] != null) {
            for (int j = 0; j < array[1].length; j++) {
                sum += array[1][j];
            }
        } else {
            System.out.println("второй строки несуществует");
            return -1;
        }
        System.out.print("second line sum: ");
        return sum;
    }
}

