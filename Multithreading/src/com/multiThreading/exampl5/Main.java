package com.multiThreading.exampl5;

public class Main {

	public static void main(String[] args) {
		Table t=new Table();
		MyThreadOne m=new MyThreadOne(t);
		MyThreadTwo n=new MyThreadTwo(t);
		
		m.start();
		n.start();
	}

}
