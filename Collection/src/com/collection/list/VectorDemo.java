package com.collection.list;
import java.util.*;
public class VectorDemo {

	public static void main(String[] args) {
		Vector v=new Vector();
		Stack s=new Stack();
		 	
		v.add("sss");
		v.add("sss");
		v.add("sss");
		v.add("sss");
		v.add("sss");
		v.add("sss");
		v.add("sss");
		v.add("sss");
		v.add("sss");
		v.add("sss");
		v.add("sss");
		v.add(1);
		v.add('a');
		System.out.println(v.capacity());
		System.out.println(v);
		System.out.println(v.contains('s'));
		System.out.println(v.containsAll(s));
		System.out.println(v.elements());
	}

}
