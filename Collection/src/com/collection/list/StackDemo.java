package com.collection.list;
import java.util.*;

public class StackDemo {

	public static void main(String[] args) {
		Stack s=new Stack();
		s.push("sss");
		s.push("sss");
		s.push(1);
		s.push('a');
		s.push("jjj");
		System.out.println(s);
//		System.out.println(s.pop());
		System.out.println(s.peek());
		System.out.println(s.empty());
		System.out.println(s.search('a'));
	}

}
