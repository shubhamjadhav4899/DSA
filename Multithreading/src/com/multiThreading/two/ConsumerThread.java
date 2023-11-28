package com.multiThreading.two;

public class ConsumerThread extends Thread{
	SharedBuffer s;

	public ConsumerThread(SharedBuffer s) {
		this.s = s;
	}

	@Override
	public void run() {
		s.bookTicket(4);
	}
	
	
	
}
