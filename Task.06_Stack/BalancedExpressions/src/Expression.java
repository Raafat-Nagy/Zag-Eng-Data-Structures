import java.util.Stack;

public class Expression {
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

	private static boolean isOpenBracket(char ch) {
		return (ch == '(' || ch == '{' || ch == '[' || ch == '<');
	}

	private static boolean isCloseBracket(char ch) {
		return (ch == ')' || ch == '}' || ch == ']' || ch == '>');
	}

	private static boolean isMatch(char openBracket, char closeBracket) {
		return ((openBracket == '(' && closeBracket == ')') ||
						(openBracket == '{' && closeBracket == '}') ||
						(openBracket == '[' && closeBracket == ']') ||
						(openBracket == '<' && closeBracket == '>'));
	}

}
