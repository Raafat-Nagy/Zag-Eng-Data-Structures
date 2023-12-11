import java.util.NoSuchElementException;

public class LinkedList<T extends Comparable<T>> {

	public class Node {
		T value;
		Node next;

		Node(T value) {
			this.value = value;
		}
	}

	private Node head;
	private Node tail;
	private int size;

	public boolean isEmpty() {
		return head == null;
	}

	public void addFirst(T value) {
		Node node = new Node(value);

		if (isEmpty()) {
			head = tail = node;
		} else {
			node.next = head;
			head = node;
		}
		size++;
	}

	public void addLast(T value) {
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

	public int indexOf(T value) {
		int index = 0;
		Node currentNode = head;

		while (currentNode != null) {
			if (currentNode.value.equals(value))
				return index;

			currentNode = currentNode.next;
			index++;
		}

		return -1;
	}

	public boolean contains(T value) {
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

	private Node getNode(int index) {
		Node currentNode = head;
		while (index-- > 0)
			currentNode = currentNode.next;
		return currentNode;
	}

	public void set(int index, T value) {
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

	public void remove(T value) {
		int index = indexOf(value);

		if (index == -1)
			throw new IllegalArgumentException("Element not found");

		removeAt(index);
	}

	public T min() {
		if (isEmpty())
			throw new NoSuchElementException("Empty LinkedList");

		T min = head.value;
		Node currentNode = head.next;

		while (currentNode != null) {
			if (currentNode.value.compareTo(min) < 0)
				min = currentNode.value;

			currentNode = currentNode.next;
		}
		return min;
	}

	public T max() {
		if (isEmpty())
			throw new NoSuchElementException("Empty LinkedList");

		T max = head.value;
		Node currentNode = head.next;

		while (currentNode != null) {
			if (currentNode.value.compareTo(max) > 0)
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