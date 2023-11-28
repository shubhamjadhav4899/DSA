package com.multiThreading.exampl3;

public class TestDemo extends Thread {

	public static void main(String[] args) {
		Prime p=new Prime();
		
		Thread t=new Thread() {
			public void run() {
				p.findPrimeAndMultiple();
				

			}
		};
		t.setPriority(MIN_PRIORITY);
		t.start();
		
		Thread t2=new Thread() {
			public void run() {
				p.findPrime();
				t.setName("prime");
			}
		};
		t2.setPriority(MAX_PRIORITY);
		t2.start();
		
	}

}
