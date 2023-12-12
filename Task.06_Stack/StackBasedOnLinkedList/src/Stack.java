import java.util.EmptyStackException;

public class Stack<E> {

	private class Node {
		E value;
		Node next;

		Node(E value) {
			this.value = value;
		}
	}

	private Node top;
	private int size = 0;

	public boolean isEmpty() {
		return top == null;
	}

	public void push(E value) {
		Node newNode = new Node(value);

		newNode.next = top;
		top = newNode;
		size++;
	}

	private void checkEmptyStack() {
		if (isEmpty())
			throw new EmptyStackException();
	}

	public E peek() {
		checkEmptyStack();

		return top.value;
	}

	public E pop() {
		checkEmptyStack();

		Node temp = top;
		top = top.next;
		temp.next = null;
		size--;
		return temp.value;
	}

	public int size() {
		return size;
	}
}