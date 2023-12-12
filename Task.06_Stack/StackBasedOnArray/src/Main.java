public class Main {

	public static void main(String[] args) {
		Stack<Integer> stack = new Stack<>();
		System.out.println("Is Empty? " + stack.isEmpty());

		// Test push
		for (int i = 0; i <= 5; i++) {
			stack.push(i);
			System.out.println("Pushed: " + i);
		}

		System.out.println("\nSize: " + stack.size());
		System.out.println("Is Empty? " + stack.isEmpty());

		// Test peek
		System.out.println("\nPeek: " + stack.peek());

		// Test pop
		System.out.println("Popped: " + stack.pop());
		System.out.println("Popped: " + stack.pop());
		System.out.println("Popped: " + stack.pop());

	}
}
