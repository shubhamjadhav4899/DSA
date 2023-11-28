package com.multiThreading.three;

public class ThreadPrintB extends Thread {
	PrintABC printABC;
	
	public ThreadPrintB(PrintABC printABC) {
		this.printABC = printABC;
	}

	@Override
	public void run() {
		printABC.printB();
	}

}
