public class ArrayQueue {
	private final int[] queueArray;
	private final int capacity;
	private int size;

	private int front;
	private int last;

	public ArrayQueue(int capacity) {
		this.capacity = capacity;
		this.queueArray = new int[capacity];
	}

	public boolean isEmpty() {
		return size == 0;
	}

	public void checkIsEmpty() {
		if (isEmpty())
			throw new IllegalStateException("Queue is empty");
	}

	public boolean isFull() {
		return size == capacity;
	}

	public int size() {
		return size;
	}

	public void enqueue(int value) {
		if (isFull())
			throw new IllegalStateException("Queue is full");

		queueArray[last] = value;
		last = (last + 1) % capacity;
		size++;
	}

	public int dequeue() {
		checkIsEmpty();

		int removedItem = queueArray[front];
		front = (front + 1) % capacity;
		size--;
		return removedItem;
	}

	public int front() {
		checkIsEmpty();

		return queueArray[front];
	}

	public void display() {
		System.out.print("Queue: [");
		if (isEmpty()) {
			System.out.println("]");
			return;
		}

		int current = front;
		while (current != last) {
			System.out.print(queueArray[current] + ", ");
			current = (current + 1) % capacity;
		}

		System.out.println("\b\b]");
	}


	public static void main(String[] args) {
		ArrayQueue queue = new ArrayQueue(5);

		for (int i = 1; i <= 5; i++) {
			System.out.println("Enqueue " + i);
			queue.enqueue(i);
		}
		for (int i = 1; i < 3; i++) {
			System.out.println("Dequeue " + queue.dequeue());
		}

		queue.display();

	}
}
