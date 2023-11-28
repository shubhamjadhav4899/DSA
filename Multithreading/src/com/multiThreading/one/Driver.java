package com.multiThreading.one;

public class Driver extends Thread {

	public static void main(String[] args) {
		DisplayOddEvenNumber display=new DisplayOddEvenNumber();
		new Thread() {
			public void run() {
				try {
					display.printOdd();
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}.start();
		new Thread() {
			public void run() {
				try {
					display.printEven();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}.start();
		

	}

}
