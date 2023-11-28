
public class SortedListApp {

	public static void main(String[] args) {
		SortedList list1 = new SortedSinglyList();

		list1.insert(12);
		list1.insert(10);
		list1.insert(5);
		list1.insert(20);
		list1.insert(20);
		list1.insert(12);
		list1.insert(7);
		list1.insert(24);

		System.out.println("Elements in sorted list are ...");
		list1.print();

		list1.delete(20);
		System.out.println("Elements after deleting 20 are ...");
		list1.print();

		list1.delete(5);
		System.out.println("Elements after deleting 5 are ...");
		list1.print();
	}

}
