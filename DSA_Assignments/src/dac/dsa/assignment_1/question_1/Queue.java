package dac.dsa.assignment_1.question_1;

public class Queue implements LinkedList {
	private Node tail;
	private Node head;
	
	public Queue() {
		tail=null;
		head=null;
		
	}

	@Override
	public void insert(int n) {
		Node newNode=new Node();
		newNode.setData(n);
		newNode.setNext(null);
		if(head==null) {
			head=newNode;
			tail=newNode;
			return;
		}
		tail.setNext(newNode);
		tail=newNode;
	}

	@Override
	public int pop() {
		if(head==null)
			return -1;
		Node Current=head;
		head=head.getNext();
		return Current.getData();
	}

	@Override
	public void print() {
		Node current=head;
		while(current!=null) {
			
			System.out.println(current.getData());
			current=current.getNext();
		}
	}

	@Override
	public void remove(int n) {
		if(head==null)
			return;
		if(head.getData()==n) {
			head=head.getNext();
			return;
		}
		if(tail.getData()==n) {
			head=head.getNext();
			return;
		}
		Node current=head.getNext();
		while(current!=null) {
			if(current.getData()==n) {
				
			}
		}
		
	}

}