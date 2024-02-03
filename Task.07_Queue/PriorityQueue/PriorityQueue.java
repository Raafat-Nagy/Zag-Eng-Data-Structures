import java.util.NoSuchElementException;

public class PriorityQueue {
	private static class Node {
		int value;
		Node next;

		Node(int value) {
			this.value = value;
		}
	}

	private Node head;
	private int size;

	public boolean isEmpty() {
		return head == null;
	}

	private void checkIsEmpty() {
		if (isEmpty())
			throw new NoSuchElementException("Queue is empty");
	}

	public void enqueue(int value) {
		Node node = new Node(value);

		if (isEmpty()) {
			head = node;
		} else if (head.value < value) {
			node.next = head;
			head = node;
		} else {
			Node previousNode = getNodePosition(value);
			node.next = previousNode.next;
			previousNode.next = node;
		}
		size++;
	}

	private Node getNodePosition(int value) {
		Node previous, current;
		previous = current = head;

		while (current != null) {
			if (current.value < value)
				break;

			previous = current;
			current = current.next;
		}
		return previous;
	}

	public int dequeue() {
		checkIsEmpty();

		Node temp = head;
		head = head.next;
		temp.next = null;
		size--;

		return temp.value;
	}

	public int front() {
		checkIsEmpty();

		return head.value;
	}

	public int size() {
		return size;
	}

	public void display() {
		System.out.print("Queue: [");
		if (isEmpty()) {
			System.out.println("]");
			return;
		}

		Node current = head;
		while (current != null) {
			System.out.print(current.value + ", ");
			current = current.next;
		}
		System.out.print("\b\b]");
	}


	public static void main(String[] args) {
		PriorityQueue queue = new PriorityQueue();

		for (int i = 1; i <= 5; i++) {
			System.out.println("Enqueue " + i);
			queue.enqueue(i);
		}

		System.out.println();
		for (int i = 1; i < 3; i++) {
			System.out.println("Dequeue " + queue.dequeue());
		}

		queue.display();

	}
}
