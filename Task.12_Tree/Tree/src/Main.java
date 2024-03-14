public class Main {
	public static void main(String[] args) {
		Tree tree = new Tree();

		// Insert some values into the tree
		tree.insert(7);
		tree.insert(4);
		tree.insert(9);
		tree.insert(8);
		tree.insert(10);
		tree.insert(6);
		tree.insert(1);

		// Display the tree using various traversal methods
		System.out.println("Pre-order traversal:");
		tree.displayPreOrder();
		System.out.println("\n");

		System.out.println("In-order traversal:");
		tree.displayInOrder();
		System.out.println("\n");

		System.out.println("Post-order traversal:");
		tree.displayPostOrder();
		System.out.println("\n");

		System.out.println("Print elements in level order:");
		tree.printInLevelOrder();

		// Find the minimum and maximum values in the tree
		System.out.println("Minimum value in the tree: " + tree.min());
		System.out.println("Maximum value in the tree: " + tree.max());

		// Check if the tree contains a certain value
		int valueToSearch = 7;
		System.out.println("Is " + valueToSearch + " in the tree? " + tree.contains(valueToSearch));

		// Calculate and display the height of the tree
		System.out.println("Height of the tree: " + tree.height());
	}
}
