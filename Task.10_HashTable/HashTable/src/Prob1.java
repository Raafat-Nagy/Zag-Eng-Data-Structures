import java.util.HashMap;
import java.util.Scanner;

public class Prob1 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		HashMap<Character, Integer> hashTable = new HashMap<>();

		System.out.print("Enter Text: ");
		String userInput = input.nextLine();

		for (char c : userInput.toCharArray()) {
			int value = hashTable.containsKey(c) ? hashTable.get(c) : 0;
			hashTable.put(c, value + 1);
		}
		System.out.println(hashTable);
	}
}