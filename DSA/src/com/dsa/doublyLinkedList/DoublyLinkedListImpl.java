package com.dsa.doublyLinkedList;

public class DoublyLinkedListImpl implements DoublyLinkedList {
	private Node head;
	private Node tail;
	public DoublyLinkedListImpl() {
		head=null;
		tail=null;
	}
	
	//Adding element at front
	@Override
	public void addAtFront(int n) {
		Node newNode=new Node();
		newNode.setData(n);
		newNode.setPrevious(null);
		if(head==null) {
			head=newNode;
			tail=newNode;
		}else {
			head.setPrevious(newNode);
			newNode.setNext(head);
			head=newNode;
			
		}
		
	}

	@Override
	public void printForward() {
		Node current=head;
		if(current==null)
			return;
		while(current!=null) {
			System.out.print(current.getData());
			if(current.getNext()!=null)
				System.out.print(" , ");
			current=current.getNext();
		}
		
	}

	@Override
	public void printBackward() {
		Node last=tail;
		if(last==null)
			return;
		while(last!=null) {
			System.out.print(last.getData());
			if(last.getPrevious()!=null)
				System.out.print(" , ");
			last=last.getPrevious();
			
		}
		
	}

	@Override
	public void addRear(int n) {
		Node newNode =new Node();
		newNode.setData(n);
		newNode.setPrevious(null);
		if(head==null) {
			head=newNode;
			tail=newNode;
		}
		else {
			newNode.setPrevious(tail);
			tail.setNext(newNode);
			tail=newNode;
		}
	}

	@Override
	public int deleteFirst() {
		Node current=head;
		head.setPrevious(null);
		head=head.getNext();
		return current.getData();

	}

	@Override
	public void insert(int n) {
		Node newNode=new Node();
		newNode.setData(n);
		newNode.setNext(null);
		newNode.setPrevious(null);
	
		if(head==null) {
			head=newNode;
			tail=newNode;
			return;
		}
		Node current=head;
		while(current!=null) {
			if(current.getData()>n)
				break;
			current=current.getNext();
		}
		if(current==head) {
			head.setPrevious(newNode);
			newNode.setNext(head);
			head=newNode;
			return;
		}
		if(current==null) {
			tail.setNext(newNode);
			newNode.setPrevious(tail);
			tail=newNode;
			return;
		}
		newNode.setNext(current);
		newNode.setPrevious(current.getPrevious());
		current.getPrevious().setNext(newNode);
		current.setPrevious(newNode);
		
	}

	@Override
	public void delete(int n) {
		Node current=head;
		if(current==null)
			return;
		while(current!=null) {
			if(current.getData()==n)
				break;
			current=current.getNext();
		}
		if(current==null)
			return;
		if(current==head) {
			head=head=head.getNext();
			current.getNext().setPrevious(null);
			current.setNext(null);
			return;
		}
		if(current==tail) {
			tail=tail.getPrevious();
			current.getPrevious().setNext(null);
			current.setPrevious(null);
			return;
		}
		current.getPrevious().setNext(current.getNext());
		current.getNext().setPrevious(current.getPrevious());
		
		
	}

	@Override
	public void deleteOneOrMoreLike(int n) {
	    Node current = head;
	    while (current != null) {
	        if (current.getData() == n) {
	            if (current == null)
	                return;
	            if (current == head) {
	                head = head.getNext();
	                if (head != null) {
	                    head.getPrevious().setNext(null);
	                    current.setNext(null);
	                }
	            }
	            if (current == tail) {
	                tail = tail.getPrevious();
	                if (tail != null) {
	                    tail.getNext().setPrevious(null);
	                    current.setPrevious(null);
	                }
	            } else {
	                if (current.getPrevious() != null) {
	                    current.getPrevious().setNext(current.getNext());
	                }
	                if (current.getNext() != null) {
	                    current.getNext().setPrevious(current.getPrevious());
	                }
	            }
	        } else {
	            current = current.getNext();
	        }
	    }
	}

	
}
