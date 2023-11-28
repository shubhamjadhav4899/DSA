package question.two;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class PrimeThread extends Thread {
	private List al=new ArrayList();
	DisplayThread t=new DisplayThread();
	public void run(){
		try {
			int count=0;
			for(int i=2;i<=1000;i++) {
				if(isPrime(i)) {
					t.addPrimeList(i);
					count++;
					
				}
			}
			System.out.println("Prime Added ...");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public boolean isPrime(int n) {
		int count=0;
		for(int i=2;i<n;i++) {
			if(n%i==0)
				count++;
		}
		if(count==0) {
			return true;
		}
		return false;
	}
}
