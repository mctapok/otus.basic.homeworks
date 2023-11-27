package ru.gavrilov.basic.homework.lesson14;

public class Main {
    public static void main(String[] args) {
        String[][] array = {
                {"1", "2", "1", "2"},
                {"1", "2", "1", "2"},
                {"1", "2", "1", "2"},
                {"1", "0", "2", "3"},
        };
        sumArr(array);
    }

    public static void checkArraySize(String[][] array) {
        for (int i = 0; i < array.length; i++) {
            if (array.length != 4) {
//                throw new AppArraySizeException("bad array: column length != 4; column length = " + array.length);
                throw new AppArraySizeException();
            }
        }
        for (int i = 0; i < array.length; i++) {
            String[] strings = array[i];
            for (int j = 0; j < strings.length; j++) {
                if (array[j].length != 4)
                    throw new AppArraySizeException();
//                    throw new AppArraySizeException("bad array: line length != 4; " + "line " + (j + 1));
            }
        }
        System.out.println("array accepted");
    }

    public static int sumArr(String[][] arr) {
        int sum = 0;
        checkArraySize(arr);
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                try {
                    sum += Integer.parseInt(arr[i][j]);
                } catch (RuntimeException e) {
                    throw new AppArrayDataException("line " + (i + 1) + " column " + (j + 1));
                }
            }
        }
        System.out.println("array sum = " + sum);
        return sum;
    }

    //    public static int sumArr(String[][] arr) throws AppArrayDataException {
//        int sum = 0;
//        for (int i = 0; i < arr.length; i++) {
//            for (int j = 0; j < arr[i].length; j++) {
//                try {
//                    sum += Integer.parseInt(arr[i][j]);
//                } catch (RuntimeException e) {
//                    throw new AppArrayDataException("line " + (i + 1) + " column " + (j + 1));
//                }
//            }
//        }
//        System.out.println("array sum = " + sum);
//        return sum;
//    }

}
