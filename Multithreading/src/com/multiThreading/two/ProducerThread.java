package com.multiThreading.two;

public class ProducerThread extends Thread {
	
	SharedBuffer s;
	public ProducerThread(SharedBuffer s) {
		this.s=s;
	}
	@Override
	public void run() {
		s.addTicket(1);
	}
	
	
	
	
}
