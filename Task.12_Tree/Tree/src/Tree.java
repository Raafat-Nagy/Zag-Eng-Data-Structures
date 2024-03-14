import java.util.ArrayList;

public class Tree {

	private static class Node {
		int value;
		Node rightChild;
		Node leftChild;

		public Node(int value) {
			this.value = value;
		}
	}

	private Node root;
	private int size;

	public boolean isEmpty() {
		return root == null;
	}

	public int size() {
		return size;
	}

	public void insert(int value) {
		Node node = new Node(value);
		if (isEmpty())
			root = node;
		else {
			Node parent = getParent(value);

			if (value >= parent.value)
				parent.rightChild = node;
			else
				parent.leftChild = node;

		}
		size++;
	}

	private Node getParent(int value) {
		Node current = root;
		Node parent = root;

		while (current != null) {
			parent = current;
			current = (value >= current.value) ? current.rightChild : current.leftChild;

		}
		return parent;
	}

	public boolean contains(int value) {
		Node current = root;
		while (current != null) {
			if (value == current.value)
				return true;
			else if (value > current.value)
				current = current.rightChild;
			else
				current = current.leftChild;
		}
		return false;
	}

	public int min() {
		Node current = root;
		int min = root.value;

		while (current != null) {
			min = current.value;
			current = current.leftChild;
		}
		return min;
	}

	public int max() {
		Node current = root;
		int max = root.value;

		while (current != null) {
			max = current.value;
			current = current.rightChild;
		}
		return max;
	}

	public void displayPreOrder() {
		displayPreOrder(root);
	}

	private void displayPreOrder(Node root) {
		if (root == null)
			return;

		System.out.print(root.value + " ");
		displayPreOrder(root.leftChild);
		displayPreOrder(root.rightChild);
	}


	public void displayInOrder() {
		displayInOrder(root);
	}

	private void displayInOrder(Node root) {
		if (root == null)
			return;

		displayInOrder(root.leftChild);
		System.out.print(root.value + " ");
		displayInOrder(root.rightChild);
	}

	public void displayPostOrder() {
		displayPostOrder(root);
	}

	private void displayPostOrder(Node root) {
		if (root == null)
			return;

		displayPostOrder(root.leftChild);
		displayPostOrder(root.rightChild);
		System.out.print(root.value + " ");
	}

	public int height() {
		return height(root);
	}

	private int height(Node root) {
		if (root == null)
			return -1;

		if (isLeaf(root))
			return 0;

		return 1 + Math.max(height(root.leftChild), height(root.rightChild));
	}

	private boolean isLeaf(Node root) {
		return root.leftChild == null && root.rightChild == null;
	}


	public boolean equals(Tree tree) {
		return equals(root, tree.root);
	}

	private boolean equals(Node root1, Node root2) {
		if (root1 == null && root2 == null)
			return true;

		if (root1 != null && root2 != null) {
			return root1.value == root2.value &&
							equals(root1.leftChild, root2.leftChild) &&
							equals(root1.rightChild, root2.rightChild);
		}

		return false;

	}


	public ArrayList<Integer> kthElementFromRoot(int distance) {
		ArrayList<Integer> list = new ArrayList<>();
		kthElementFromRoot(root, distance, list);

		return list;
	}

	private void kthElementFromRoot(Node root, int distance, ArrayList<Integer> list) {
		if (root == null)
			return;

		if (distance == 0)
			list.add(root.value);

		kthElementFromRoot(root.leftChild, distance - 1, list);
		kthElementFromRoot(root.rightChild, distance - 1, list);

	}

	public void printInLevelOrder() {
		int height = height();

		for (int i = 0; i <= height; i++)
			System.out.println(kthElementFromRoot(i));

	}


}