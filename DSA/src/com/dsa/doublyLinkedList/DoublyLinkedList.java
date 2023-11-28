package com.dsa.doublyLinkedList;

public interface DoublyLinkedList {
	void addAtFront(int n);
	
	void printForward();
	
	void printBackward();
	
	void addRear(int n);
	
	int deleteFirst();
	
	void insert(int n);
	
	void delete(int n);
	
	void deleteOneOrMoreLike(int n);
}
