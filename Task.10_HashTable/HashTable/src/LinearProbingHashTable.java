import java.util.NoSuchElementException;

public class LinearProbingHashTable {
	private static class Node {
		private final int key;
		private String value;

		private Node(int key, String value) {
			this.key = key;
			this.value = value;
		}
	}

	private final Node[] hashTable;

	private int capacity;
	private int size;

	public LinearProbingHashTable(int capacity) {
		this.capacity = capacity;
		hashTable = new Node[capacity];
	}

	public boolean isEmpty() {
		return size == 0;
	}

	public boolean isFull() {
		return size == capacity;
	}

	public int size() {
		return size;
	}

	public int hash(int key) {
		return key % hashTable.length;
	}

	public void put(int key, String value) {
		if (isFull())
			throw new IllegalArgumentException("Is Full");

		Node node = new Node(key, value);
		int index = hash(key);

		while (true) {
			if (hashTable[index] == null) {
				hashTable[index] = node;
				size++;
				return;
			} else if (hashTable[index].key == key) {
				hashTable[index].value = value;
				return;
			}
			index = (index + 1) % capacity;
		}

	}

	public String get(int key) {

		int index = hash(key);
		int newIndex = index;

		do {
			if (hashTable[newIndex] == null)
				return null;

			else if (hashTable[newIndex].key == key)
				return hashTable[newIndex].value;

			newIndex = (newIndex + 1) % capacity;
		} while (newIndex != index);

		return null;
	}

	public void remove(int key) {

		int index = hash(key);
		int newIndex = index;

		do {
			if (hashTable[newIndex] == null)
				throw new NoSuchElementException("Not Found");

			else if (hashTable[newIndex].key == key) {
				do {
					hashTable[newIndex] = hashTable[(newIndex + 1) % capacity];
					newIndex = (newIndex + 1) % capacity;
				} while (hashTable[newIndex] != null && newIndex != index);
				size--;
				return;
			}

			newIndex = (newIndex + 1) % capacity;
		} while (newIndex != index);

		throw new NoSuchElementException("Not Found");

	}


	public void display() {
		System.out.print("HashTable: [");
		if (isEmpty()) {
			System.out.println("]");
			return;
		}

		for (Node node : hashTable) {
			if (node != null) {
				System.out.print("{" + node.key + " : " + node.value + "}, ");
			}
		}
		System.out.print("\b\b]");
	}

}