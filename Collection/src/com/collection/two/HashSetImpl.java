package com.collection.two;

import java.util.Iterator;

public class HashSetImpl {
	Object[] arr;
	int count = 0;
	

	public void add(int n) {
		count++;
		arr[count] = n;
	}
	

	public void add(String s) {
		arr[count] = o;
		count++;
	}

	public void remove(Object o) {
		for(int i=0;i<arr.length;i++) {
			if(o.equals(arr[i])) {
				int count=i;
				while(count!=arr.length) {
					arr[i+1]=arr[i];
					count++;
				}
			}
		}
	}

}
