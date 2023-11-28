
public class SortedSinglyList implements SortedList {
	private Node head;

	public SortedSinglyList() {
		head = null;
	}

	@Override
	public void insert(int element) {
		Node newNode = new Node(element);

		// If list is empty.
		if (head == null) {
			head = newNode;
			return;
		}

		// List is not empty.
		// Find first node having data greater than newNode.
		Node current = head;
		Node previous = null;
		while (current != null) {
			if (current.getData() > newNode.getData()) {
				// Found the node.
				break;
			}
			previous = current;
			current = current.getNext();
		}

		// Add newNode as first node?
		if (previous == null) { // OR if (current == head)
			newNode.setNext(head);
			head = newNode;
			return;
		}

		// Add newNode between previous and current.
		previous.setNext(newNode);
		newNode.setNext(current);
	}

	@Override
	public void delete(int element) {
		Node current = head;
		Node previous = null;
		while (current != null) {
			if (current.getData() == element) {
				// Element found.
				break;
			}
			previous = current;
			current = current.getNext();
		}

		if (current == null) {
			// Element not present in list.
			return;
		}

		if (current == head) { // OR if (previous == null)
			// Deleting first node
			head = head.getNext();
			return;
		}

		// previous.next = current.next;
		previous.setNext(current.getNext());
	}

	@Override
	public void print() {
		Node current = head;

		while (current != null) {
			System.out.println(current.getData());
			current = current.getNext();
		}
	}

}
