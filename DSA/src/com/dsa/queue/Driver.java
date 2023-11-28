package com.dsa.queue;

public class Driver {

	public static void main(String[] args) {
		QueueRun q=new QueueRunner(3);
		q.addQ(20);
		q.addQ(24);
		q.addQ(23);
		q.addQ(23);
		System.out.println(q.delteQ());
		System.out.println(q.delteQ());
		System.out.println(q.delteQ());
	}

}
