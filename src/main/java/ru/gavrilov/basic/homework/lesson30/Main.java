package ru.gavrilov.basic.homework.lesson30;

public class Main {
    public  int[] copyArr(int[] arr) {
        int lastOneInArrayInd = -1;

        for (int i = arr.length - 1; i > 0; i--) {
            if (arr[i] == 1) {
                lastOneInArrayInd = i;
                break;
            }
        }
        if (lastOneInArrayInd == -1) {
            throw new RuntimeException("1 not found");
        }

        int[] newArray = new int[arr.length - 1 - lastOneInArrayInd];
        int k = 0;
        for (int i = lastOneInArrayInd + 1; i < arr.length; i++) {
            newArray[k] = arr[i];
            k++;
        }
        return newArray;
    }

    public boolean validArray(int[] arr) {
        boolean hasOne = false;
        boolean hasTwo = false;
        for (int i : arr) {
            if (i != 1 && i != 2) {
                return false;
            }
            if (i == 1) {
                hasOne = true;
            }
            if (i == 2) {
                hasTwo = true;
            }
        }
        return hasOne && hasTwo;
    }
}