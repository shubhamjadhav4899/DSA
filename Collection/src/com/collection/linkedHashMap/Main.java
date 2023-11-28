package com.collection.linkedHashMap;
import java.util.LinkedHashMap;
public class Main {
	public static void main(String[] args) {
		LinkedHashMap<String, Integer> num1 = new LinkedHashMap<String, Integer>();
//		using put
		num1.put("one", 1);
		num1.put("two", 2);
		num1.put("three", 3);
//		using put if absent
		num1.putIfAbsent("eleven", 11);

		System.out.println(num1);

//		Way to add the list 
//		LinkedHashMap<String, Integer> num2=new LinkedHashMap<>(num1);
		LinkedHashMap<String, Integer> num2 = new LinkedHashMap<>();
//		using put all
		num2.putAll(num1);
		num2.put("FIve", 5);
		num2.put("two", 2);
		System.out.println(num2);

//		Removing the value
		boolean isremove = num2.remove("FIve", 5);
		// getting value key/Mapping
		System.out.println("Key:Value" + num2.entrySet());
//		//only key
		System.out.println("Keys " + num2.keySet());
//		Values only
		System.out.println("Values " + num2.values());
		System.out.println("removed status " + isremove);
	}
}
