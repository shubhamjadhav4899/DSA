
public class SinglyListApp {

	public static void test1() {
		LinkedListIntf list1 = new SinglyList();
		list1.addAtFront(5);
		list1.addAtFront(10);

		System.out.println("Contents of list are ...");
		list1.print();
	}

	public static void test2() {
		LinkedListIntf list1 = new SinglyList();
		list1.addAtFront(5);
		list1.addAtRear(10);

		System.out.println("Contents of list are ...");
		list1.print();
	}

	public static void doStackOperartions() {
		LinkedListIntf list1 = new SinglyList();
		list1.addAtFront(5);
		System.out.println("Element added - 5");
		list1.addAtFront(10);
		System.out.println("Element added - 10");

		int element = list1.deleteFirstNode();
		System.out.println("Element removed - " + element);
		element = list1.deleteFirstNode();
		System.out.println("Element removed - " + element);
	}

	public static void correctUseOfStack() {
		StackIntf s = new StackUsingList02();
		s.push(1);
		s.push(10);
		s.push(100);

		while (!s.isEmpty()) {
			System.out.println("Popped - " + s.pop());
		}
	}

	public static void main(String[] args) {
		correctUseOfStack();
		test1();
	}

}
