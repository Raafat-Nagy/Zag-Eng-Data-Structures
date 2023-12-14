import java.util.EmptyStackException;

public class Stack<E> {

	private static final int DEFAULT_CAPACITY = 10;
	private static final int RESIZE_FACTOR = 2;

	private Object[] elements;
	private int capacity;
	private int lastElement = 0;

	public Stack() {
		capacity = DEFAULT_CAPACITY;
		elements = new Object[capacity];
	}

	public Stack(int capacity) {
		this.capacity = capacity;
		elements = new Object[capacity];
	}

	public boolean isEmpty() {
		return lastElement == 0;
	}

	private boolean isFull() {
		return lastElement == capacity;
	}

	private void resizeArray() {
		capacity *= RESIZE_FACTOR;
		Object[] newArray = new Object[capacity];

		for (int i = 0; i < lastElement; i++)
			newArray[i] = elements[i];

		elements = newArray;
	}

	public void push(int element) {
		if (isFull())
			resizeArray();

		elements[lastElement] = element;
		lastElement++;
	}

	private void checkEmptyStack() {
		if (isEmpty())
			throw new EmptyStackException();
	}

	public E pop() {
		checkEmptyStack();

		int lastIndex = lastElement - 1;
		lastElement--;
		return (E) elements[lastIndex];
	}

	public E peek() {
		checkEmptyStack();

		return (E) elements[lastElement - 1];
	}

	public int size() {
		return lastElement;
	}
}
