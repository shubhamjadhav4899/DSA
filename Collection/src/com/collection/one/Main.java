package com.collection.one;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		List<Integer> numberList=new ArrayList<Integer>();
		
		numberList.add(10);
		numberList.add(20);
		numberList.add(30);
		numberList.remove(0);
		
		Iterator itr=numberList.iterator();
		
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}

}
