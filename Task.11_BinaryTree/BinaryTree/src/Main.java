public class Main {
	public static void main(String[] args) {
		BinaryTree binaryTree = new BinaryTree();

		// Insert some values into the binary tree
		binaryTree.insert(50);
		binaryTree.insert(30);
		binaryTree.insert(70);
		binaryTree.insert(20);
		binaryTree.insert(40);
		binaryTree.insert(60);
		binaryTree.insert(80);

		// Check if certain values are contained in the tree
		System.out.println("Contains 30: " + binaryTree.contains(30)); // true
		System.out.println("Contains 45: " + binaryTree.contains(45)); // false

		// Find the minimum and maximum values in the tree
		System.out.println("Minimum value: " + binaryTree.min()); // 20
		System.out.println("Maximum value: " + binaryTree.max()); // 80

		// Display the tree in different traversal orders
		binaryTree.displayPreOrder(); // Pre-Order: 50 30 20 40 70 60 80
		binaryTree.displayInOrder(); // In-Order: 20 30 40 50 60 70 80
		binaryTree.displayPostOrder(); // Post-Order: 20 40 30 60 80 70 50
	}
}