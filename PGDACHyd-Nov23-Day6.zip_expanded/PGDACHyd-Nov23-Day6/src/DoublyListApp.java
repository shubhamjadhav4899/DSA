
public class DoublyListApp {

	public static void testDoublyList() {
		DoublyList dList = new DoublyLinkedList();

		dList.addAtFront(5);
		dList.addAtFront(1);

		System.out.println("List contents are (forward) ...");
		dList.printForward();
		System.out.println("List contents are (backwards) ...");
		dList.printBackward();

		dList.addAtEnd(10);

		System.out.println("List contents are (forward) ...");
		dList.printForward();
		System.out.println("List contents are (backwards) ...");
		dList.printBackward();

		System.out.println("First element was - " + dList.deleteFirstNode());
		System.out.println("List contents are (forward) ...");
		dList.printForward();
		System.out.println("List contents are (backwards) ...");
		dList.printBackward();
	}

	public static void testSortedDoublyList(SortedList dList) {
		dList.insert(10);
		dList.insert(5);
		dList.insert(15);
		dList.insert(7);

		System.out.println("List contents are (forward) ...");
		dList.printForward();
		System.out.println("List contents are (backwards) ...");
		dList.printBackward();
	}

	public static void main(String[] args) {
		System.out.println("Testing sorted doubly linked list.");
		testSortedDoublyList(new SortedDoublyLinkedList());

		System.out.println("Testing sorted circular doubly linked list.");
		testSortedDoublyList(new SortedCircularDoublyLinkedList());
	}
}
