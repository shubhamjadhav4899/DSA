package com.multiThreading.one;

public class DisplayOddEvenNumber {
	Thread t=new Thread();
	public synchronized void printEven() throws InterruptedException {
		for(int i=2;i<100;i++) {
			if(i%2==0) {
				System.out.println("Even"+i);
				notify();
			}
			else {
				try {
					wait();
				} catch (InterruptedException e) {
					Thread.currentThread().interrupt();
				}
			}
		}
	}
	public synchronized void printOdd()throws Exception {
		for(int i=1;i<100;i++) {
			if(i%2==1) {
				System.out.println(i);
				notify();
			}
			else {
				try {
					wait();
				} catch (InterruptedException e) {
					Thread.currentThread().interrupt();
				}
			}
		}
	}
	
}
