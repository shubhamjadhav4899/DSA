package com.multiThreading.two;

public class GetTicket extends Thread {
	@Override
	public void run() {
		s.getAvailableTicket();
	}

	SharedBuffer s;

	public GetTicket(SharedBuffer s) {
		this.s = s;
	}
	

}
