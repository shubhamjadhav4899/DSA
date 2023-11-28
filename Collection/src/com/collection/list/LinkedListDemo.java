package com.collection.list;

import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListDemo {

	public static void main(String[] args) {
		//generic must be followed
		LinkedList<String> ls = new LinkedList();
		ls.add("sss");
	/*	ls.add(1);
		ls.add('d');*/
		ls.add("ppp");
		ls.add("sss");
		//sort the data of same type
//		Collections.sort(ls);
//		Collections.swap(ls, 0, 1);
//		Collections.shuffle(ls);
		Iterator itr=ls.iterator();
		while(itr.hasNext())
			System.out.println(itr.next());

	}

}
