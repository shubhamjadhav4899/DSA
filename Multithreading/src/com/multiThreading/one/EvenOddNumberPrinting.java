package com.multiThreading.one;

class NumberPrinter {

    public void printOdd() {
       for(int i=1;i<10;i++) {
            if (i % 2 != 0) {
                System.out.println(Thread.currentThread().getName() + ": " + i);
                try {
					Thread.sleep(500);
				} catch (Exception e) {
					System.out.println(e);
				}
            }
        }
    }

    public void printEven() {
    	for(int i=1;i<10;i++)  {
            if (i % 2 == 0) {
                System.out.println(Thread.currentThread().getName() + ": " + i);
                try {
					Thread.sleep(500);
				} catch (Exception e) {
					System.out.println(e);
				}
            }
        }
    }
}

class OddNumberPrinter implements Runnable {
    private NumberPrinter numberPrinter;

    public OddNumberPrinter(NumberPrinter numberPrinter) {
        this.numberPrinter = numberPrinter;
    }

    @Override
    public void run() {
        numberPrinter.printOdd();
    }
}

class EvenNumberPrinter implements Runnable {
    private NumberPrinter numberPrinter;

    public EvenNumberPrinter(NumberPrinter numberPrinter) {
        this.numberPrinter = numberPrinter;
    }

    @Override
    public void run() {
        numberPrinter.printEven();
    }
}

public class EvenOddNumberPrinting {

    public static void main(String[] args) {
        NumberPrinter numberPrinter = new NumberPrinter();

        Thread oddThread = new Thread(new OddNumberPrinter(numberPrinter), "OddThread");
        Thread evenThread = new Thread(new EvenNumberPrinter(numberPrinter), "EvenThread");

        oddThread.start();
        evenThread.start();
    }
}
