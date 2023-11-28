
public class StackUsingList02 implements StackIntf {
	private SinglyList list;

	public StackUsingList02() {
		list = new SinglyList();
	}

	@Override
	public void push(int element) {
		list.addAtFront(element);
	}

	@Override
	public int pop() {
		return list.deleteFirstNode();
	}

	@Override
	public boolean isEmpty() {
		return list.isEmpty();
	}

	@Override
	public boolean isFull() {
		return false;
	}

}
