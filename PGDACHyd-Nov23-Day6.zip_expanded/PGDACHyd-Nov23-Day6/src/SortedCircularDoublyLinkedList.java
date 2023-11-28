
public class SortedCircularDoublyLinkedList implements SortedList {
	private Node head;

	public SortedCircularDoublyLinkedList() {
		// Create a dummy node - for empty circular list.
		head = new Node();
		head.setNext(head); // head.next = head;
		head.setPrevious(head); // head.previous = head;
	}

	@Override
	public void insert(int element) {
		// 1. Create new node
		Node newNode = new Node(element);

		// 3. Traverse the list to find node before which to insert.
		Node current = head.getNext(); // current = head.next;
		while (current != head) {
			if (current.getData() > element) {
				break;
			}
			current = current.getNext();
		}

		// 6. Add newNode before current node.
		newNode.setNext(current); // newNode.next = current;
		newNode.setPrevious(current.getPrevious()); // newNode.previous = current.previous;
		current.getPrevious().setNext(newNode); // current.previous.next = newNode;
		current.setPrevious(newNode); // current.previous = newNode;
	}

	@Override
	public void printForward() {
		Node current = head.getNext(); // current = head.next;

		while (current != head) {
			System.out.println(current.getData());
			current = current.getNext();
		}
	}

	@Override
	public void printBackward() {
		Node current = head.getPrevious(); // current = head.previous;

		while (current != head) {
			System.out.println(current.getData());
			current = current.getPrevious();
		}
	}

}
