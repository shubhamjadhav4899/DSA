
public class SortedDoublyLinkedList implements SortedList {
	private Node head;
	private Node tail;

	public SortedDoublyLinkedList() {
		head = null;
		tail = null;
	}

	@Override
	public void insert(int element) {
		// 1. Create new node
		Node newNode = new Node(element);

		// 2. If list is empty?
		if (head == null) {
			head = newNode;
			tail = newNode;
			return;
		}

		// 3. Traverse the list to find node before which to insert.
		Node current = head;
		while (current != null) {
			if (current.getData() > element) {
				break;
			}
			current = current.getNext();
		}

		// 4. If adding before first node?
		if (current == head) {
			head.setPrevious(newNode); // head.previous = newNode;
			newNode.setNext(head); // newNode.next = head;
			head = newNode;
			return;
		}

		// 5. If adding after last node?
		if (current == null) {
			tail.setNext(newNode); // tail.next = newNode;
			newNode.setPrevious(tail); // newNode.previous = tail;
			tail = newNode;
			return;
		}

		// 6. Add newNode before current node.
		newNode.setNext(current); // newNode.next = current;
		newNode.setPrevious(current.getPrevious()); // newNode.previous = current.previous;
		current.getPrevious().setNext(newNode); // current.previous.next = newNode;
		current.setPrevious(newNode); // current.previous = newNode;
	}

	@Override
	public void printForward() {
		Node current = head;

		while (current != null) {
			System.out.println(current.getData());
			current = current.getNext();
		}
	}

	@Override
	public void printBackward() {
		Node current = tail;

		while (current != null) {
			System.out.println(current.getData());
			current = current.getPrevious();
		}
	}

}
