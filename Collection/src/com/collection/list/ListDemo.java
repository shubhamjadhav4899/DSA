package com.collection.list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class ListDemo {
	public static void main(String[] args) {
		/*
		 * int[] evenNumber; int[] oddList; List<String> al=new ArrayList<String>();
		 */
		int[] arr= {22,33,4,55,6,443};
		Arrays.sort(arr);
		for(int n:arr)
			System.out.println(n);
		ArrayList al=new ArrayList();
		al.add(1);
		al.add("cat");
		al.add("cat");
		al.add('a');
		al.add(null);
		ArrayList al2=new ArrayList();
		al2.add("cat");
		al2.add("abc");
//		al.retainAll(al2);
//		al2.retainAll(al);
		Iterator itr=al.iterator();
		Iterator itr1=al2.iterator();
		

		while(itr.hasNext())
			System.out.println(itr.next());
		while(itr1.hasNext())
			System.out.println(itr1.next());
	}


}
