import java.util.Queue;
import java.util.LinkedList;
import java.util.Scanner;

public class HotPotatoGame {
	public static String hotPotato(String[] children, int tosses) {
		Queue<String> queue = new LinkedList<>();

		for (String child : children)
			queue.add(child);

		while (queue.size() > 1) {
			for (int i = 1; i < tosses; i++)
				queue.add(queue.remove());

			queue.remove();
		}

		return queue.remove();
	}


	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter the number of children: ");
		int childrenNum = input.nextInt();

		String[] children = new String[childrenNum];

		System.out.println("Enter the names of children: ");
		for (int i = 0; i < childrenNum; i++) {
			children[i] = input.next();
		}

		System.out.print("Enter the number of tosses: ");
		int tosses = input.nextInt();


		System.out.println("The winner is: " + hotPotato(children, tosses));

	}
}
