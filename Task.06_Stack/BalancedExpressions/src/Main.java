import java.util.Stack;

public class Main {
	public static void main(String[] args) {
		// Test cases
		testExpression("((()))");
		testExpression("{[()]}");
		testExpression("({[}])");
		testExpression("(){}[]");
		testExpression("<>>");
		testExpression("({[<>)");
	}

	public static void testExpression(String expression) {
		System.out.println("Expression: " + expression + " " + (isValidExpression(expression) ? "Pass" : "Fail"));
	}

	public static boolean isValidExpression(String expression) {
		Stack<Character> stack = new Stack<>();

		for (int i = 0; i < expression.length(); i++) {
			char ch = expression.charAt(i);

			if (isOpenBracket(ch))
				stack.push(ch);

			if (isCloseBracket(ch)) {
				if (stack.isEmpty())
					return false;

				char openBracket = stack.pop();
				if (!isMatch(openBracket, ch))
					return false;
			}
		}
		return stack.isEmpty();
	}

	public static boolean isOpenBracket(char ch) {
		return (ch == '(' || ch == '{' || ch == '[' || ch == '<');
	}

	public static boolean isCloseBracket(char ch) {
		return (ch == ')' || ch == '}' || ch == ']' || ch == '>');
	}

	public static boolean isMatch(char openBracket, char closeBracket) {
		return ((openBracket == '(' && closeBracket == ')') ||
						(openBracket == '{' && closeBracket == '}') ||
						(openBracket == '[' && closeBracket == ']') ||
						(openBracket == '<' && closeBracket == '>'));
	}
}
