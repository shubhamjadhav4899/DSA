package question.two;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public  class FibonnaciThread extends Thread {
	List ls=new ArrayList();
	DisplayThread t=new DisplayThread();
	public void run() {
		try {
			int temp=0;
			int count=0;
		
			int i=1;
			while(temp<1000) {
				int result=i+temp;
				count++;
				if(count<1)
					i++;
				else {
					i=temp;
				}
				t.addFibb(temp);
				temp=result;
				
			}
			
			/*
			 * Iterator itr=ls.iterator(); while(itr.hasNext()) {
			 * System.out.println(itr.next()); }
			 */
			System.out.println("Fibb Added ...");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
