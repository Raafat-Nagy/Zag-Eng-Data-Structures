public class BinaryTree {

	private static class Node {
		int value;
		Node rightChild;
		Node leftChild;

		public Node(int value) {
			this.value = value;
		}
	}

	Node root;
	int size;

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
		System.out.print("Pre-Order: [");
		displayPreOrder(root);
		System.out.println("\b]");
	}

	private void displayPreOrder(Node root) {
		if (root == null)
			return;

		System.out.print(root.value + " ");
		displayPreOrder(root.leftChild);
		displayPreOrder(root.rightChild);
	}


	public void displayInOrder() {
		System.out.print("In-Order: [");
		displayInOrder(root);
		System.out.println("\b]");
	}

	private void displayInOrder(Node root) {
		if (root == null)
			return;

		displayInOrder(root.leftChild);
		System.out.print(root.value + " ");
		displayInOrder(root.rightChild);
	}

	public void displayPostOrder() {
		System.out.print("Post-Order: [");
		displayPostOrder(root);
		System.out.println("\b]");
	}

	private void displayPostOrder(Node root) {
		if (root == null)
			return;

		displayPostOrder(root.leftChild);
		displayPostOrder(root.rightChild);
		System.out.print(root.value + " ");
	}

}