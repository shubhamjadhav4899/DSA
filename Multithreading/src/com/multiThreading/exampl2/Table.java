package com.multiThreading.exampl2;

public class Table {
	public synchronized void printTable(int n) throws Exception {
		for(int i=1;i<=10;i++) {
			System.out.println(n+" * "+i+" = "+n*i);
			Thread.sleep(500);
		}
	}
}
