package com.multiThreading.three;

public class ThreadPrintA extends Thread {

	PrintABC printABC;
	
	public ThreadPrintA(PrintABC printABC) {
		this.printABC = printABC;
	}

	@Override
	public void run() {
		printABC.printA();
		
	}
}
