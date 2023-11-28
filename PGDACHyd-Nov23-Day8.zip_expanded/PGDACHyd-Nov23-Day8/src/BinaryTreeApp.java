
public class BinaryTreeApp {
	public static void main(String[] args) {
		BinaryTree bt01 = new BinaryTree();

		bt01.buildTree01();
		System.out.println("Preorder of tree ...");
		bt01.printUsingPreOrder();

		System.out.println("Preorder of tree (using Unoptimised) ...");
		bt01.printUsingPreOrderUnoptimised();
	}
}
