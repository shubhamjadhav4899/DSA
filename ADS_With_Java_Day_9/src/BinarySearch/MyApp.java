package BinarySearch;

public class MyApp {

	public static void main(String[] args) {
		BinarySearch binarySearch=new BinarySearchImpl();
		binarySearch.insert(100);
		binarySearch.insert(200);
		binarySearch.insert(150);
		binarySearch.insert(50);
		binarySearch.insert(30);
		binarySearch.insert(40);
		
		binarySearch.search(60);
		
		binarySearch.printUsingPreOrder();

	}

}
