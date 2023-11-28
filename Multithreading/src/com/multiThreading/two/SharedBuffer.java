package com.multiThreading.two;

public class SharedBuffer {
	private int availableTicket;
	private int bookTicket;

	public SharedBuffer(int availableTicket) {
		this.availableTicket = availableTicket;
	}

	public synchronized void bookTicket(int ticket) {

		try {
			bookTicket = ticket;
			if (availableTicket < ticket) {
				wait();
				System.out.println("GOing to book ticket");
				availableTicket -= ticket;
			}
		} catch (Exception e) {
			System.err.println(e);
		}

	}

	public synchronized void addTicket(int ticket) {
		availableTicket += ticket;

		System.out.println("Ticket Added Sucssesfully");

		if (bookTicket <= availableTicket) {
			notify();
		} else {
			try {
				if (availableTicket == 0 && ticket == 0) {
					throw new TickeetOutOfStockException("Running out of stock.");
				}
				if (bookTicket > availableTicket) {
					System.out.println("Available Ticket is " + availableTicket);
					throw new HighDemandException("we area Running High demand .Sorry For the inconvinience !");
				}
			} catch (Exception e) {
				System.err.println(e);
			}

		}

	}

	public synchronized int getAvailableTicket() {
		return availableTicket;
	}

}
