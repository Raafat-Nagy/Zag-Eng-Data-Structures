import java.util.Stack;

public class Main {
	public static void main(String[] args) {
		String originalString = "gnirtSesreveR";

		String reversedString = reverseString(originalString);
		System.out.println(reversedString);
	}

	public static String reverseString(String originalString) {
		Stack<Character> charStack = new Stack<>();

		for (int i = 0; i < originalString.length(); i++)
			charStack.push(originalString.charAt(i));

		String reversedString = "";
		while (!charStack.isEmpty())
			reversedString += charStack.pop();

		return reversedString;
	}

}
