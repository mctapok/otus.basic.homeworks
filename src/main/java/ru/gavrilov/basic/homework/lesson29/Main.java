package ru.gavrilov.basic.homework.lesson29;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {
    static final Object mon = new Object();
    static char currentChar = 'C';
    public static void main(String[] args) {
        ExecutorService threadPull = Executors.newFixedThreadPool(4);
        for (int i = 0; i < 5; i++) {
            threadPull.execute(() -> {
                printC();
            });
            threadPull.execute(() -> {
                printA();
            });
            threadPull.execute(() -> {
                printB();
            });
        }
        threadPull.shutdown();
    }

    public static char printA() {
        synchronized (mon) {
            try {
                while (currentChar != 'C') {
                    mon.wait();
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.print("A");
            mon.notifyAll();
            return currentChar = 'A';
        }
    }

    public static char printB() {
        synchronized (mon) {
            try {
                while (currentChar != 'A') {
                    mon.wait();
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.print("B");
            mon.notifyAll();
            return currentChar = 'B';
        }
    }

    public static char printC() {
        synchronized (mon) {
            try {
                while (currentChar != 'B') {
                    mon.wait();
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.print("C ");
            mon.notifyAll();
            return currentChar = 'C';
        }
    }
    }
