import java.util.Queue;
import java.util.Stack;
import java.util.LinkedList;

public class ReverseQueue {
	public static void reverseQueue(Queue<Integer> queue) {
		Stack<Integer> stack = new Stack<>();

		while (!queue.isEmpty())
			stack.push(queue.poll());

		while (!stack.isEmpty())
			queue.add(stack.pop());

	}

	public static void main(String[] args) {
		Queue<Integer> queue = new LinkedList<>();

		for (int i = 1; i <= 5; i++)
			queue.add(i);

		System.out.println("Original Queue: " + queue);

		reverseQueue(queue);

		System.out.println("Reversed Queue: " + queue);
	}
}
