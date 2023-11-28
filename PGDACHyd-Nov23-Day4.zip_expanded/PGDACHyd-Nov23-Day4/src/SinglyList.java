
public class SinglyList implements LinkedListIntf {
	private Node head;
	private Node tail;

	public SinglyList() {
		head = null;
		tail = null;
	}

	@Override
	public void addAtFront(int element) {
		Node newNode = new Node();
		newNode.data = element;
		newNode.next = null;

		if (head == null) {
			head = newNode;
			// If following is not done then test2() will fail.
			tail = newNode;
			return;
		}

		newNode.next = head;
		head = newNode;
	}

	@Override
	public void addAtRear(int element) {
		Node newNode = new Node();
		newNode.data = element;
		newNode.next = null;

		if (head == null) {
			head = newNode;
			tail = newNode;
			return;
		}

		tail.next = newNode;
		tail = newNode;
	}

	@Override
	public int deleteFirstNode() {
		if (head == null) {
			// TODO: Throw exception.
			return -1;
		}

		Node temp = head;
		head = head.next;
		if (head == null) {
			// What if list only had one node.
			tail = head; // or null
		}

		return temp.data;
	}

	@Override
	public boolean isEmpty() {
		if (head == null) {
			return true;
		}
		return false;
	}

	@Override
	public void print() {
		Node current = head;

		while (current != null) {
			System.out.println(current.data);
			current = current.next;
		}
	}

}
