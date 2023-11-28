package com.dsa.stack;

public class App {

	public static void demoLackOfErrorHandling() {
		StackIntf s = new StackUsingArray(2);
		s.push(1);
		s.push(10);
		s.push(100);

		System.out.println("Popped - " + s.pop());
		System.out.println("Popped - " + s.pop());
		System.out.println("Popped - " + s.pop());
	}

	public static void correctUseOfStack() {
		StackIntf s = new StackUsingArray(10);
		s.push(1);
		s.push(10);
		s.push(100);
		int result;
		try {
			while (!s.isEmpty()) {
				System.out.println("Popped - " + s.pop());
				result=s.pop();
				if(result==-1) {
					throw new StackIsEmptyException("Stak is empty");
				}
			}
			
		} catch (StackIsEmptyException e) {
			System.out.println(e);
		}
	}

	public static void main(String[] args) {
		correctUseOfStack();
		//demoLackOfErrorHandling();
	}

}
