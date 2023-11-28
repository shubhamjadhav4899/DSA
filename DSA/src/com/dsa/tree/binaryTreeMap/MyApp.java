package com.dsa.tree.binaryTreeMap;

public class MyApp {

	public static void main(String[] args) {
		BinaryTree binaryTree=new BinaryTree();
		binaryTree.buildTree();
		System.out.println("Print Using optimized preorder...");
		binaryTree.printUsingPreOrder();
		System.out.println("Print using Optimized postorder...");
		binaryTree.printUsingPostOrder();
		System.out.println("Print using un-optimized preorder..");
		binaryTree.printUsingUnoptimizedPreOrder();
		System.out.println("using inorder");
		binaryTree.printUsingUnoptimizedInOrder();
		System.out.println("inlevel***");
		binaryTree.inLevelTraversal();
		System.out.println("Mirror of the tree***");
		binaryTree.mirrorTreeTraversal();
		System.out.println("Count Leaf Node : - "+binaryTree.countLeaf());
		System.out.println("Count : - "+binaryTree.count());
		System.out.println("The Frequency of the given element is :- "+binaryTree.countElement(5));
	}

}
