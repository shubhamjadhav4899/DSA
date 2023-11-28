
public class BSTApp {

	public static void main(String[] args) {
		BST bst01 = new BST();

		bst01.insert(10);
		bst01.insert(5);
		bst01.insert(8);
		bst01.insert(15);
		bst01.insert(1);
		bst01.insert(20);

		int element = 5;
		if (bst01.search(element)) {
			System.out.println(element + " is present.");
		} else {
			System.out.println(element + " is NOT present.");
		}

		element = 50;
		if (bst01.search(element)) {
			System.out.println(element + " is present.");
		} else {
			System.out.println(element + " is NOT present.");
		}

		System.out.println("BST contains ...");
		bst01.printBST();

		bst01.delete(10);
		bst01.delete(1);
		bst01.delete(20);
		System.out.println("BST after deleting 10, 1, 20 ...");
		bst01.printBST();
	}

}
