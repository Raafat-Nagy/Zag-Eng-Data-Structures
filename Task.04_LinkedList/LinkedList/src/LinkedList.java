import java.util.NoSuchElementException;

public class LinkedList {

	// Node class represents an element in the linked list
	public class Node {
		int value;
		Node next;

		// Constructor to initialize a node with a given value
		Node(int value) {
			this.value = value;
		}
	}

	private Node head; // Points to the first node in the list
	private Node tail; // Points to the last node in the list
	private int size;   // Number of elements in the list

	// Checks if the linked list is empty
	// Complexity: O(1)
	public boolean isEmpty() {
		return head == null;
	}

	// Adds a new node with the given value to the beginning of the linked list
	// Complexity: O(1)
	public void addFirst(int value) {
		Node node = new Node(value);

		if (isEmpty()) {
			// If the list is empty, the new node becomes both head and tail
			head = tail = node;
		} else {
			// Otherwise, set the new node as the head
			node.next = head;
			head = node;
		}
		size++;
	}

	// Adds a new node with the given value to the end of the linked list
	// Complexity: O(1)
	public void addLast(int value) {
		Node node = new Node(value);

		if (isEmpty()) {
			// If the list is empty, the new node becomes both head and tail
			head = tail = node;
		} else {
			// Otherwise, set the new node as the tail
			tail.next = node;
			tail = node;
		}
		size++;
	}

	// Throws an exception if the linked list is empty
	// Complexity: O(1)
	private void checkEmptyList() {
		if (isEmpty())
			throw new NoSuchElementException("Empty LinkedList");
	}

	// Removes the first node in the linked list
	// Complexity: O(1)
	public void removeFirst() {
		checkEmptyList();

		if (head == tail)
			head = tail = null; // If there's only one element, remove it
		else {
			Node node = head;
			head = head.next; // Move the head to the next node
			node.next = null;
		}
		size--;
	}

	// Removes the last node in the linked list
	// Complexity: O(n), where n is the number of elements in the list
	public void removeLast() {
		checkEmptyList();

		if (head == tail)
			head = tail = null; // If there's only one element, remove it
		else {
			Node beforeLast = getBeforeLast();
			beforeLast.next = null;
			// Set the node before the last as the new tail
			tail = beforeLast;
		}
		size--;
	}

	// Private method to get the node before the last node in the linked list
	// Complexity: O(n), where n is the number of elements in the list
	private Node getBeforeLast() {
		Node currentNode = head;

		while (currentNode.next != tail)
			currentNode = currentNode.next;

		return currentNode;
	}

	// Finds the index of the first occurrence of the specified value in the linked list
	// Complexity: O(n), where n is the number of elements in the list
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

	// Checks if the linked list contains the specified value
	// Complexity: O(n), where n is the number of elements in the list
	public boolean contains(int value) {
		return indexOf(value) >= 0;
	}

	// Returns the size (number of elements) of the linked list
	// Complexity: O(1)
	public int size() {
		return size;
	}

	// Prints the elements of the linked list in order
	// Complexity: O(n), where n is the number of elements in the list
	public void printLinkedList() {
		Node currentNode = head;

		while (currentNode != null) {
			System.out.print(currentNode.value + " ");
			// Move to the next node in the list
			currentNode = currentNode.next;
		}
		System.out.println();
	}

	// Clears all elements from the linked list
	// Complexity: O(n), where n is the number of elements in the list
	public void clear() {
		while (head != null) {
			Node currentNode = head;
			head = head.next;
			currentNode.next = null;
		}
		size = 0;
	}

	// Checks if the given index is a valid index for accessing elements in the linked list
	// Complexity: O(1)
	private void checkElementIndex(int index) {
		if (index < 0 || index >= size)
			throw new IndexOutOfBoundsException("Index out of range");
	}

	// Retrieves the node at the specified index in the linked list
	// Complexity: O(n), where n is the number of elements in the list
	private Node getNode(int index) {
		Node currentNode = head;
		while (index-- > 0)
			currentNode = currentNode.next;
		return currentNode;
	}

	// Sets the value of the node at the specified index to the given value
	// Complexity: O(n), where n is the number of elements in the list
	public void set(int index, int value) {
		checkElementIndex(index);

		Node node = getNode(index);
		node.value = value;
	}

	// Removes the node at the specified index in the linked list
	// Complexity: O(n), where n is the number of elements in the list
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

	// Removes the first occurrence of the specified value in the linked list
	// Complexity: O(n), where n is the number of elements in the list
	public void remove(int value) {
		int index = indexOf(value);

		if (index == -1)
			throw new IllegalArgumentException("Element not found");

		removeAt(index);
	}

	// Finds and returns the minimum value in the linked list
	// Complexity: O(n), where n is the number of elements in the list
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

	// Finds and returns the maximum value in the linked list
	// Complexity: O(n), where n is the number of elements in the list
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

	// Reverses the linked list
	// Complexity: O(n), where n is the number of elements in the list
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
