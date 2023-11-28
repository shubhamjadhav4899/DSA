
public class DoublyLinkedList implements DoublyList {
	private Node head;
	private Node tail;

	public DoublyLinkedList() {
		head = null;
		tail = null;
	}

	@Override
	public void addAtFront(int element) {
		Node newNode = new Node(element);

		if (head == null) {
			tail = newNode;
		} else {
			head.setPrevious(newNode);
		}
		newNode.setNext(head);
		head = newNode;
	}

	@Override
	public void addAtEnd(int element) {
		Node newNode = new Node(element);

		if (head == null) {
			head = newNode;
			tail = newNode;
			return;
		}

		tail.setNext(newNode);
		newNode.setPrevious(tail);
		tail = newNode;
	}

	@Override
	public int deleteFirstNode() {
		if (head == null) {
			// TODO: Throw exception.
			return -1;
		}

		Node current = head;
		head = head.getNext();

		if (head == null) {
			tail = null;
		} else {
			head.setPrevious(null);
		}

		return current.getData();
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
