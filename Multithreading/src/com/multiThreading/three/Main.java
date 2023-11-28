package com.multiThreading.three;

public class Main {
    private static final Object lock = new Object();
    private static int count = 0;

    public static void main(String[] args) {
        Thread threadA = new Thread(() -> print("A", 0));
        Thread threadB = new Thread(() -> print("B", 1));
        Thread threadC = new Thread(() -> print("C", 2));

        threadA.start();
        threadB.start();
        threadC.start();
    }

    private static void print(String letter, int index) {
        synchronized(lock) {
            try {
                for (int i = 0; i < 2; i++) {
                    while (count % 3 != index) {
                        lock.wait();
                    }
                    System.out.print(letter);
                    count++;
                    lock.notifyAll();
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
