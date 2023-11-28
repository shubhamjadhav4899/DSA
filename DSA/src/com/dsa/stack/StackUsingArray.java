package com.dsa.stack;


public class StackUsingArray implements StackIntf {
	private int[] stack;
	private int top;

	public StackUsingArray(int n) {
		stack = new int[n];
		top = -1;
	}

	@Override
	public void push(int element) {
		if (isFull()) {
			try {
				throw new StackIsFull("Memory of the stack is full...");
			} catch (Exception e) {
				System.out.println(e);
			}
		}
		++top;
		stack[top] = element;
		return;

		
	}

	@Override
	public int pop() {
		if (isEmpty())
			// TODO: Not the right way - we should throw exception.
			return -1;
		
		
		int result = stack[top];
		--top;
		return result;
		
	}

	@Override
	public boolean isEmpty() {
		if (top == -1)
			return true;
		return false;
	}

	@Override
	public boolean isFull() {
		if (top == stack.length - 1)
			return true;
		return false;
	}
}
