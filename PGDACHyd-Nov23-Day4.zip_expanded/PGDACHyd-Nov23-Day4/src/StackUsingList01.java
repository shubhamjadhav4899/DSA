
public class StackUsingList01 extends SinglyList implements StackIntf {

	@Override
	public void push(int element) {
		addAtFront(element);
	}

	@Override
	public int pop() {
		return deleteFirstNode();
	}

	@Override
	public boolean isEmpty() {
		return super.isEmpty();
	}

	@Override
	public boolean isFull() {
		return false;
	}

}
