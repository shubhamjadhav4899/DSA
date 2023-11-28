package com.dsa.tree.binaryTreeMap;

import java.util.LinkedList;
import java.util.Queue;

public class BinaryTree {
	private BinaryNode root;
	private int count;

	public BinaryTree() {
		root = null;

	}

	BinaryNode b1 = new BinaryNode(10);
	BinaryNode b2 = new BinaryNode(5);
//	4-5
	BinaryNode b3 = new BinaryNode(5);
	BinaryNode b4 = new BinaryNode(3);
	BinaryNode b5 = new BinaryNode(2);
	BinaryNode b6 = new BinaryNode(7);
	BinaryNode b7 = new BinaryNode(9);
	BinaryNode b8 = new BinaryNode(8);
	BinaryNode b9 = new BinaryNode(6);
	BinaryNode b10 = new BinaryNode(15);
	BinaryNode b11 = new BinaryNode(12);
	BinaryNode b12 = new BinaryNode(11);
	BinaryNode b13 = new BinaryNode(17);

	public void buildTree() {
		b1.setlChild(b2);
		b1.setrChild(b3);
		b2.setlChild(b4);
		b2.setrChild(b5);
		b3.setlChild(b6);
		b3.setrChild(b7);
		b4.setrChild(b8);
		b5.setlChild(b9);
		b6.setlChild(b10);
		b6.setrChild(b11);
		b7.setrChild(b12);
		b11.setlChild(b13);
		root = b1;
	}

	private void printUsingPreOrder(BinaryNode root) {
		++count;
		if (root == null)
			return;
		System.out.println(root.getData());
		if (root.getlChild() != null) {
			printUsingPreOrder(root.getlChild());
		}
		if (root.getrChild() != null) {
			printUsingPreOrder(root.getrChild());
		}
	}

	public void printUsingPreOrder() {
		count = 0;
		printUsingPreOrder(root);
		System.out.println("Called - " + count);
	}

	private void printUsingPostOrder(BinaryNode root) {
		++count;
		if (root == null)
			return;
		if (root.getlChild() != null) {
			printUsingPostOrder(root.getlChild());
		}
		if (root.getrChild() != null) {
			printUsingPostOrder(root.getrChild());
		}
		System.out.println(root.getData());
	}

	public void printUsingPostOrder() {
		count = 0;
		printUsingPostOrder(root);
		System.out.println("Called - " + count);
	}

	private void printUsingUnoptimizedPreOrder(BinaryNode root) {
		++count;
		if (root == null)
			return;
		System.out.println(root.getData());
		printUsingUnoptimizedPreOrder(root.getlChild());
		printUsingUnoptimizedPreOrder(root.getrChild());

	}

	public void printUsingUnoptimizedPreOrder() {
		count = 0;
		printUsingUnoptimizedPreOrder(root);
		System.out.println("Called -" + count);

	}

	private void printUsingUnoptimizedInOrder(BinaryNode root) {
		++count;
		if (root == null)
			return;
		printUsingUnoptimizedInOrder(root.getlChild());
		System.out.println(root.getData());
		printUsingUnoptimizedInOrder(root.getrChild());

	}

	public void printUsingUnoptimizedInOrder() {
		count = 0;
		printUsingUnoptimizedInOrder(root);
		System.out.println("Called -" + count);

	}

	public void inLevelTraversal() {
		if (root == null)
			return;
		Queue<BinaryNode> bNode = new LinkedList<>();
		bNode.add(root);
		while (!bNode.isEmpty()) {
			BinaryNode current = bNode.remove();
			System.out.print(current.getData()+" ");
			if (current.getlChild() != null) {
				bNode.add(current.getlChild());
			}
			if (current.getrChild() != null) {
				bNode.add(current.getrChild());
			}
		}
	}
	
	public void mirrorTreeTraversal() {
		if (root == null)
			return;
		Queue<BinaryNode> bNode = new LinkedList<>();
		bNode.add(root);
		while (!bNode.isEmpty()) {
			BinaryNode current = bNode.remove();
			System.out.print(current.getData()+" ");
			if (current.getrChild() != null) {
				bNode.add(current.getrChild());
			}
			if (current.getlChild() != null) {
				bNode.add(current.getlChild());
			}
			
		}
	}

	private int count(BinaryNode root) {

		if (root == null) {
			return 0;
		}
		return 1 + count(root.getlChild()) + count(root.getrChild());
	}

	public int count() {

		return count(root);
	}

	private int countLeaf(BinaryNode root) {

		if (root == null) {
			return 0;
		}
		if (root.getlChild() == null && root.getrChild() == null) {
			return 1;
		}

		return countLeaf(root.getlChild()) + countLeaf(root.getrChild());
	}

	public int countLeaf() {

		return countLeaf(root);
	}
	
	public int countElement(int n) {
		BinaryNode current=root;
		if(current==null) {
			return 0;
		}
		while(current!=null) {
			if(current.getlChild()!=null&& current.getData()==n) {
				return 1;
			}
			if(current.getrChild()!=null&& current.getData()==n) {
				return 1;
			}
		}
		return countElement(n);
	}

	public void search(int n, BinaryNode root) {
		BinaryNode current = root;
		while (current != null) {
			if (current.getData() < n) {
				search(n, root.getlChild());
			} else {
				search(n, root.getrChild());
			}
		}
	}
}
