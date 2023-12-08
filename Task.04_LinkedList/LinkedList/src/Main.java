public class Main {

	public static void main(String[] args) {
		// Create a new linked list
		LinkedList linkedList = new LinkedList();

		// Test addFirst and addLast
		linkedList.addFirst(2);
		linkedList.addFirst(1);
		linkedList.addLast(3);
		linkedList.addLast(4);

		// Print the initial linked list
		System.out.println("Initial Linked List:");
		linkedList.printLinkedList();
		System.out.println("Size: " + linkedList.size());
		System.out.println("Is the linked list empty? " + linkedList.isEmpty());
		System.out.println();

		// Test the reverse function
		linkedList.reverse();

		System.out.println("Reversed Linked List:");
		linkedList.printLinkedList();

		// Test removeFirst and removeLast
		linkedList.removeFirst();
		linkedList.removeLast();

		// Print the linked list after removals
		System.out.println("\nLinked List after removeFirst and removeLast:");
		linkedList.printLinkedList();
		System.out.println("Size: " + linkedList.size());

		// Test clear
		linkedList.clear();
		System.out.println("\nLinked List after clear:");
		linkedList.printLinkedList();
		System.out.println("Size: " + linkedList.size());
		System.out.println("Is the linked list empty? " + linkedList.isEmpty());

		// Test addFirst to an empty list
		linkedList.addFirst(10);

		// Print the linked list after adding to an empty list
		System.out.println("\nLinked List after adding to an empty list:");
		linkedList.printLinkedList();
		System.out.println("Size: " + linkedList.size());
		System.out.println("Is the linked list empty? " + linkedList.isEmpty());

		// Test set
		linkedList.set(0, 20);

		// Print the linked list after setting a value
		System.out.println("\nLinked List after setting a value:");
		linkedList.printLinkedList();
		System.out.println("Size: " + linkedList.size());

		// Test min and max
		linkedList.addLast(5);
		linkedList.addLast(15);
		linkedList.addLast(25);
		System.out.println("\nLinked List with additional elements:");
		linkedList.printLinkedList();
		System.out.println("Min: " + linkedList.min());
		System.out.println("Max: " + linkedList.max());

		// Test removeAt
		linkedList.removeAt(1);

		// Print the linked list after removeAt
		System.out.println("\nLinked List after removeAt:");
		linkedList.printLinkedList();
		System.out.println("Size: " + linkedList.size());

		// Test remove by value
		linkedList.remove(20);

		// Print the linked list after remove by value
		System.out.println("\nLinked List after remove by value:");
		linkedList.printLinkedList();
		System.out.println("Size: " + linkedList.size());


	}
}