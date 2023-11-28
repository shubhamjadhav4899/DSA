package linkedList.example_1;

public class LikedListimpl implements linkedList {
	private Node head;
	private Node tail;
	
	//Adding without tracking the tail.
	@Override
	public void addRear(int n) {
		Node node=new Node();
		node.setData(n);
		Node current =head;
		
		if(current==null) {
			head=node;
			
			return;
		}
		while(current.getNext()!=null) {
			current=current.getNext();
			
		}
		
		
		current.setNext(node);
	}
	
	public void print() {
		Node current=head;
		while(current!=null) {
			System.out.println(current.getData());
			current=current.getNext();
		}
	}
	
	
	//Deleting first Node
	@Override
	public void deleteFirstNode() {
		if(isEmpty()) {
			return;
		}
		head=head.getNext();
		
		
	}
	
	//Deleting Last Node
	public void deleteLastNode() {
		if(isEmpty()) {
			return;
		}
		Node current=head;
		Node previous=null;
		while(current!=null) {
			previous=current;
			current=current.getNext();
			if(current==null) {
					previous.setNext(null);
					return;
			}
		}
		
	}
	public boolean isEmpty() {
		return head==null;
	}

	@Override
	public void add(int n) {
		Node node=new Node();
		node.setData(n);
		node.setNext(null);
		if(isEmpty()) {
			head=node;
			tail=node;
			return;
		}
		
		tail.setNext(node);
		tail=node;
	}

	
	//Find middle node of the list
	@Override
	public int findMiddleNode() {
		int count=0;
		Node current = head;
		Node middle=head;
		if(isEmpty()) {
			return -1;
		}
		while(current!=null) {
			count++;
			current=current.getNext();
		}
		if(count%2!=0) {
			int node=count/2;
			int temp=0;
			while(temp<node) {
				temp++;
				middle=middle.getNext();
				
			}
		}
		return middle.getData();
	}
}