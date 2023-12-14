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
		System.out.println("Expression: " + expression + " " + (Expression.isValidExpression(expression) ? "Pass" : "Fail"));
	}

}
