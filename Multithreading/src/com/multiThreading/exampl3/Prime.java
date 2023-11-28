package com.multiThreading.exampl3;

public class Prime {
	
	public void findPrimeAndMultiple() {
		for(int i=1;i<=1000;i++) {
			if(i%2==0 || i%3==0)
				continue;
			else {
				if(i%7==0) {
					System.out.println(i);
				}
				else
					continue;
			}
			
		}
	}
	
	public void findPrime() {
		for(int i=1;i<=1000;i++) {
			if(i%2!=0 && i%3!=0 && i%i==0)
				System.out.println(i+"fp");
			else 
				continue;
		}
	}

}
