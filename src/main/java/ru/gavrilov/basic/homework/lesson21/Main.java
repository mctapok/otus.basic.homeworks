package ru.gavrilov.basic.homework.lesson21;

public class Main {
    public static void main(String[] args) {
        //100_000_000
        double[] array = new double[100_000_000];
        System.out.println("Начало работы одного потока");
        long start = System.currentTimeMillis();
        for (int i = 0; i < array.length; i++) {
            array[i] = 1.14 * Math.cos(i) * Math.sin(i * 0.2) * Math.cos(i / 1.2);
        }
        System.out.print("Время работы 1 поток ");
        stopWatch(start);


        MultiThreading multiThreading = new MultiThreading(array, 12);

        System.out.printf("Начало работы %d потоков \n", multiThreading.getNumberOfThreads());
        try {
            start = System.currentTimeMillis();
            multiThreading.start();
            stopWatch(start);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public static void stopWatch(long start) {
        long time = System.currentTimeMillis() - start;
        System.out.println(time / 1000f + " s");
    }
}
