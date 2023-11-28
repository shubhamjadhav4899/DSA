package com.multiThreading.three;

public class ThreadPrintcC extends Thread {
	PrintABC printABC;
	
	
	public ThreadPrintcC(PrintABC printABC) {
		this.printABC = printABC;
	}


	@Override
	public void run() {
		printABC.printC();
	}

}
