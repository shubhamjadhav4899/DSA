package linkedList.example_1;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LikedListimpl ls=new LikedListimpl();
//		ls.addRear(10);
//		ls.addRear(20);
//		ls.addRear(30);
		ls.add(50);
		ls.add(70);
		ls.add(7);
		ls.deleteLastNode();
		ls.print();
		System.out.println(ls.findMiddleNode());
	}

}
