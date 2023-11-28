package BinarySearch;

public class BSTNode {
	private int data;
	private BSTNode lChild;
	private BSTNode rChild;
	
	
	public BSTNode() {
		data=0;
		lChild=null;
		rChild=null;
	}
	public int getData() {
		return data;
	}
	public void setData(int data) {
		this.data = data;
	}
	public BSTNode getlChild() {
		return lChild;
	}
	public void setlChild(BSTNode lChild) {
		this.lChild = lChild;
	}
	public BSTNode getrChild() {
		return rChild;
	}
	public void setrChild(BSTNode rChild) {
		this.rChild = rChild;
	}


	
}
