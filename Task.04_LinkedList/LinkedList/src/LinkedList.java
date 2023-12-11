import java.util.NoSuchElementException;

public class LinkedList {

	public class Node {
		int value;
		Node next;

		Node(int value) {
			this.value = value;
		}
	}

	private Node head;
	private Node tail;
	private int size;

	public boolean isEmpty() {
		return head == null;
	}

	public void addFirst(int value) {
		Node node = new Node(value);

		if (isEmpty()) {
			head = tail = node;
		} else {
			node.next = head;
			head = node;
		}
		size++;
	}

	public void addLast(int value) {
		Node node = new Node(value);

		if (isEmpty()) {
			head = tail = node;
		} else {
			tail.next = node;
			tail = node;
		}
		size++;
	}

	private void checkEmptyList() {
		if (isEmpty())
			throw new NoSuchElementException("Empty LinkedList");
	}

	public void removeFirst() {
		checkEmptyList();

		if (head == tail)
			head = tail = null;
		else {
			Node node = head;
			head = head.next;
			node.next = null;
		}
		size--;
	}

	public void removeLast() {
		checkEmptyList();

		if (head == tail)
			head = tail = null;
		else {
			Node beforeLast = getBeforeLast();
			beforeLast.next = null;
			tail = beforeLast;
		}
		size--;
	}

	private Node getBeforeLast() {
		Node currentNode = head;

		while (currentNode.next != tail)
			currentNode = currentNode.next;

		return currentNode;
	}

	public int indexOf(int value) {
		int index = 0;
		Node currentNode = head;

		while (currentNode != null) {
			if (currentNode.value == value)
				return index;

			currentNode = currentNode.next;
			index++;
		}

		return -1;
	}

	public boolean contains(int value) {
		return indexOf(value) >= 0;
	}

	public int size() {
		return size;
	}

	public void printLinkedList() {
		Node currentNode = head;

		while (currentNode != null) {
			System.out.print(currentNode.value + " ");
			currentNode = currentNode.next;
		}
		System.out.println();
	}

	public void clear() {
		while (head != null) {
			Node currentNode = head;
			head = head.next;
			currentNode.next = null;
		}
		size = 0;
	}

	private void checkElementIndex(int index) {
		if (index < 0 || index >= size)
			throw new IndexOutOfBoundsException("Index out of range");
	}

	public Node getNode(int index) {
		checkElementIndex(index);

		Node currentNode = head;
		while (index-- > 0)
			currentNode = currentNode.next;
		return currentNode;
	}

	public void set(int index, int value) {
		checkElementIndex(index);

		Node node = getNode(index);
		node.value = value;
	}

	public void removeAt(int index) {
		checkElementIndex(index);

		if (index == 0)
			removeFirst();
		else if (index == size - 1)
			removeLast();
		else {
			Node leftNode = getNode(index - 1);
			Node remove = leftNode.next;

			leftNode.next = remove.next;
			remove = null;
		}
	}

	public void remove(int value) {
		int index = indexOf(value);

		if (index == -1)
			throw new IllegalArgumentException("Element not found");

		removeAt(index);
	}

	public int min() {
		int min = head.value;
		Node currentNode = head.next;

		while (currentNode != null) {
			if (currentNode.value < min)
				min = currentNode.value;

			currentNode = currentNode.next;
		}
		return min;
	}

	public int max() {
		int max = head.value;
		Node currentNode = head.next;

		while (currentNode != null) {
			if (currentNode.value > max)
				max = currentNode.value;

			currentNode = currentNode.next;
		}
		return max;
	}

	public void reverse() {
		if (isEmpty())
			return;

		Node previous = head;
		Node current = head.next;

		while (current != null) {
			Node nextNode = current.next;
			current.next = previous;
			previous = current;
			current = nextNode;
		}
		Node temp = head;
		head = tail;
		tail = temp;
		tail.next = null;
	}
}
