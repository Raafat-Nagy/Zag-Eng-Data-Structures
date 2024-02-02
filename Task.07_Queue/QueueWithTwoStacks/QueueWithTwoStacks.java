import java.util.Stack;

public class QueueWithTwoStacks {
	private final Stack<Integer> inStack;
	private final Stack<Integer> outStack;

	public QueueWithTwoStacks() {
		inStack = new Stack<>();
		outStack = new Stack<>();
	}

	public boolean isEmpty() {
		return inStack.isEmpty() && outStack.isEmpty();
	}

	private void checkNotEmptyQueue() {
		if (isEmpty())
			throw new IllegalStateException("Queue is empty");
	}

	public void enqueue(int value) {
		inStack.push(value);
	}

	public int dequeue() {
		checkNotEmptyQueue();

		if (outStack.isEmpty())
			transferItemsToOutStack();

		return outStack.pop();
	}

	public int front() {
		checkNotEmptyQueue();

		if (outStack.isEmpty())
			transferItemsToOutStack();

		return outStack.peek();
	}

	private void transferItemsToOutStack() {
		while (!inStack.isEmpty())
			outStack.push(inStack.pop());
	}


	public int size() {
		return inStack.size() + outStack.size();
	}
}
