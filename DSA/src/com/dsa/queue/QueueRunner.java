package com.dsa.queue;

public class QueueRunner implements QueueRun{
	int[] arr;
	int rear,front;
	int count;
	public QueueRunner(int n) {
		arr=new int[n];
		rear=-1;
		front=-1;
		count=0;
	}

	@Override
	public boolean isEmpty() {
		if(front<arr.length)
			return true;
		else
			return false;
	}

	@Override
	public boolean isFulll() {
		if(rear==arr.length-1) {
			return true;
		}
		else
			return false;
	}

	@Override
	public void addQ(int n) {
		++count;
		try {
			if(isFulll()) {
				System.err.println("Not added the element "+n+" At No "+count);
				count--;
				throw new StackIsFullException("The Memory of the stack is full");
			}else {
				++rear;
				arr[rear]=n;
				System.out.println("Added Succesfuly...");
			}
		} catch (StackIsFullException e) {
			System.err.println(e);
		}
		
		
		
	}

	@Override
	public int delteQ() {
		try {
			--count;
			++front;
			if(isEmpty())
				return arr[front];
			else {
				throw new StackIsEmptyException("The Memory is empty Nothing to remove.");
				
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return 0;
	}

}
