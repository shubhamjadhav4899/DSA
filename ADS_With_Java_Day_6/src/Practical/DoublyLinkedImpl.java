package Practical;

public class DoublyLinkedImpl implements DoublyLinked {
	
	private Node head;
	private Node tail;
	
	
	public DoublyLinkedImpl() {
		head=null;
		tail=null;
	}

	//Adding element at last without sorting
	@Override
	public void addAtEnd(int num) {
		Node node=new Node();
		node.setData(num);
		node.setNext(null);
		node.setPrvious(null);
		
		if(head==null) {
			head=node;
			tail=node;
		}
		tail.setNext(node);
		node.setPrvious(tail);
		tail=node;
		
	}

	@Override
	public void deleteFirst() {
		Node current=head;
		if(head==null)
			return;
		head=head.getNext();
		if(head==null)
			tail=null;
		else
			head.setPrvious(null);
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
	public void InsertInSort(int num) {
		Node node=new Node();
		node.setData(num);
		node.setNext(null);
		node.setPrvious(null);
		Node current=head;
		if(head==null) {
			head=node;
			tail=node;
		}
		while(current!=null) {
			if(current.getData()>num) {
				break;
			}
			current=current.getNext();
		}
		if(current==head) {
			head.setPrvious(node);
			node.setNext(head);
			head=node;
			return;
		}
		if(current==null) {
			current.setNext(node);
			node.setPrvious(current);
			tail=node;
			return;
		}
		node.setNext(current);
		node.setPrvious(current.getPrvious());
		node.setNext(current.getPrvious());
		current.setPrvious(node);
		
	}

}
