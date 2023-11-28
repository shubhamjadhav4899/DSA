package com.collection.two;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Two {

	public static void main(String[] args)throws Exception {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String s=br.readLine();
		
		HashSetImpl hs=new HashSetImpl();
		hs.add(2);
//		LinkedHashSet ls=new LinkedHashSet();
////		int n=Integer.parseInt(s);
//		ls.add(s);
//		ls.add("ss");
//		ls.add(1);
//		ls.add("pp");
//		ls.add('A');
//		ls.add(3.33);
//		ls.remove(1);
//		ls.remove(3.33);
//		System.out.println(ls.size());
		Iterator itr=hs.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}

	}

}
