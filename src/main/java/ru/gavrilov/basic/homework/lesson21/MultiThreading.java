package ru.gavrilov.basic.homework.lesson21;

import java.util.ArrayList;
import java.util.List;

public class MultiThreading {

    private double[] array;

    private int numberOfThreads;

    public int getNumberOfThreads() {
        return numberOfThreads;
    }

    public MultiThreading(double[] array, int numberOfThreads) {
        this.array = array;
        this.numberOfThreads = numberOfThreads;
    }

    public void start() throws InterruptedException {
        List<Thread> threadList = new ArrayList<>();

        for (int i = 0; i < numberOfThreads; i++) {
            int startInd = i * (array.length / numberOfThreads);
            int endInd = (i + 1) * (array.length / numberOfThreads);
            threadList.add(new Thread(() -> {
                for (int j = startInd; j < endInd; j++) {
                    array[j] = 1.14 * Math.cos(j) * Math.sin(j * 0.2) * Math.cos(j / 1.2);
                }
            }));
            threadList.get(i).start();
        }
//        for (Thread t : threadList) {
//            t.start();
//        }
        for (Thread t : threadList) {
            try {
                t.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.print("время работы " + numberOfThreads + " потоков ");
    }
}
