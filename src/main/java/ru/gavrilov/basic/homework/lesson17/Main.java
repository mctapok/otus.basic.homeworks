package ru.gavrilov.basic.homework.lesson17;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        MyLinkedList<String> myLinkedList = new MyLinkedList<>();
        MyQueue<String> myQueue = new MyQueue<>();
        MyStack<String> myStack = new MyStack<>();
//
//        Random random = new Random();
//        int[] array = new int[11];
//        for (int i = 0; i < array.length; i++) {
//            array[i] = random.nextInt(100);
//        }
//        printArr(array);
//        recMergeSort(array, new int[array.length], 0, array.length - 1);
//        printArr(array);
//
//        myLinkedList.addFirst("1");
//        myLinkedList.addFirst("2");
//        myLinkedList.addFirst("3");
//        myLinkedList.addFirst("4");
//        myLinkedList.show();
//        myLinkedList.remove(0);
//        myLinkedList.show();
//        myLinkedList.remove(1);
//        myLinkedList.show();
//        myLinkedList.remove(2);
//        myLinkedList.show();
//        myLinkedList.remove(1);
//        myLinkedList.show();
//        myLinkedList.remove(0);
//        myLinkedList.show();
//        myLinkedList.get(3);
//        myLinkedList.show();
//        myLinkedList.getLast();
//        myLinkedList.getFirst();
//        myLinkedList.add(1, "33");
//        myLinkedList.show();
//        myLinkedList.getSize();
//        myLinkedList.remove(8);
//        myLinkedList.show();
//        myLinkedList.remove(0);
//
//        myLinkedList.remove(2);
//        myLinkedList.show();

//        myLinkedList.getSize();
//
        myQueue.offer("1");
        myQueue.offer("2");
        myQueue.offer("3");
        myQueue.show();
        myQueue.poll();
        myQueue.show();
        myQueue.poll();
        myQueue.show();
        myQueue.poll();
        myQueue.show();
        myQueue.poll();

//
//        System.out.println();
//
//        myStack.push("1");
//        myStack.push("2");
//        myStack.push("3");
//        myStack.show();
//        myStack.pop();
//        myStack.show();
//        myStack.pop();
//        myStack.show();
//
    }

    private static void recMergeSort(int[] arr, int[] tmp, int lowerBound, int upperBound) {
        if (lowerBound == upperBound) return;

        int mid = (lowerBound + upperBound) / 2;
        recMergeSort(arr, tmp, lowerBound, mid);
        recMergeSort(arr, tmp, mid + 1, upperBound);
        merge(arr, tmp, lowerBound, mid + 1, upperBound);

    }

    private static void merge(int[] arr, int[] tmp, int lowPtr, int highPtr, int upperBound) {
        int j = 0;
        int lowerBound = lowPtr;
        int middle = highPtr - 1;
        int nItems = upperBound - lowerBound + 1;
        while (lowPtr <= middle && highPtr <= upperBound) {
            if (arr[lowPtr] < arr[highPtr]) {
                tmp[j++] = arr[lowPtr++];
            } else {
                tmp[j++] = arr[highPtr++];
            }
        }
        while (lowPtr <= middle) {
            tmp[j++] = arr[lowPtr++];
        }
        while (highPtr <= upperBound) {
            tmp[j++] = arr[highPtr++];
        }
        for (j = 0; j < nItems; j++) {
            arr[lowerBound + j] = tmp[j];
        }
    }

    public static void printArr(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "|");
        }
        System.out.println();
    }
}
