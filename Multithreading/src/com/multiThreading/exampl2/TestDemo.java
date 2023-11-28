package com.multiThreading.exampl2;

public class TestDemo extends Thread {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Table t=new Table();
		
		new Thread() {
			public void run() {
				try {
					t.printTable(11);
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}.start();
		new Thread() {
			public void run() {
				try {
					t.printTable(22);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		}.start();
		new Thread() {
			public void run() {
				try {
					t.printTable(33);
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}.start();

	}

}
