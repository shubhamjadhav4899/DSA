package com.multiThreading.two;

import java.io.IOException;

public class Driver extends Thread {

	public static void main(String[] args) throws IOException {
		SharedBuffer s=new SharedBuffer(10);
		ProducerThread p=new ProducerThread(s);
		ConsumerThread c=new ConsumerThread(s);
		GetTicket g=new GetTicket(s);
		c.start();
		p.start();
		g.start();
	}

}
