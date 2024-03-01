import java.util.Scanner;

public class Hash {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		String userInput = input.next();
		int[] freqArray = new int[26];

		for (int i = 0; i < userInput.length(); i++)
			freqArray[hash(userInput.charAt(i))]++;

		for (int i = 0; i < userInput.length(); i++) {
			int index = hash(userInput.charAt(i));

			if (freqArray[index] == 1) {
				System.out.println(userInput.charAt(i));
				break;
			}
		}
	}

	public static int hash(char c) {
		return c - 'a';
	}
}
