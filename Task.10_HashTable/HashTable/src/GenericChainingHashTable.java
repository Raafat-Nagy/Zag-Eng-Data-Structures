import java.util.LinkedList;
import java.util.NoSuchElementException;

public class GenericChainingHashTable<K,V> {
	private class Node {
		private final K key;
		private V value;

		private Node(K key, V value) {
			this.key = key;
			this.value = value;
		}
	}

	private final LinkedList<Node>[] hashTable;
	private int size;

	public GenericChainingHashTable(int size) {
		hashTable = new LinkedList[size];
	}

	public boolean isEmpty() {
		return size == 0;
	}

	public int size() {
		return size;
	}

	public int hash(K key) {
		return key.hashCode() % hashTable.length;
	}

	public void put(K key, V value) {
		Node node = new Node(key, value);
		int index = hash(key);

		if (hashTable[index] == null) {
			hashTable[index] = new LinkedList<>();
			hashTable[index].add(node);
			size++;
		} else {
			for (Node n : hashTable[index]) {
				if (n.key == key) {
					n.value = value;
					return;
				}
			}
			hashTable[index].add(node);
			size++;
		}
	}

	public V get(K key) {
		int index = hash(key);

		if (hashTable[index] == null)
			return null;

		for (Node n : hashTable[index]) {
			if (n.key == key)
				return n.value;
		}

		return null;
	}

	public boolean contains(K key) {
		int index = hash(key);

		if (hashTable[index] == null)
			return false;

		for (Node n : hashTable[index]) {
			if (n.key == key)
				return true;
		}

		return false;
	}

	public void remove(K key) {
		int index = hash(key);

		if (hashTable[index] == null)
			throw new NoSuchElementException();

		for (Node n : hashTable[index]) {
			if (n.key == key) {
				hashTable[index].remove(n);
				size--;
				return;
			}
		}

		throw new NoSuchElementException();
	}
}