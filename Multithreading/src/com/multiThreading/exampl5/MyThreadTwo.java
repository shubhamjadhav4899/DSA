package com.multiThreading.exampl5;

public class MyThreadTwo extends Thread {
	Table t;

	public MyThreadTwo(Table t) {
		this.t = t;
	}

	@Override
	public void run() {
		t.printTable(10);
	}
	
	
}
