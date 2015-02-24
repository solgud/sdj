import java.util.StringTokenizer;

import utility.collection.*;

public class PostfixEvaluator {

	// Constants for different symbols
	private	final char ADD = '+';
	private final char SUBTRACT = '-';
	private	final char MULTIPLY = '*';
	private final char DIVIDE = '/';

	private ArrayStack<Integer> stack;

	public PostfixEvaluator() {
		this.stack = new ArrayStack<Integer>();
	}
	

	public int evaluate(String expression) {
		
		int operand1, operand2;
		int result = 0;
		String token;
		StringTokenizer tokenizer = new StringTokenizer(expression);
		
		while(tokenizer.hasMoreTokens()) {
			token = tokenizer.nextToken(); // Get the next element in the expression
			
			if(isOperator(token)) { // If the token is an operator (+-*/)
				operand2 = (stack.pop()).intValue(); // Get the operand at the top of the stack
				operand1 = (stack.pop()).intValue(); // Get the next operand off the top of the stack
				result = evaluateSingleOperator(token.charAt(0), operand1, operand2); // Evaluate using the helper method
				stack.push(new Integer(result)); // Now push the result back onto the top of the stack
			} else { // If token isn't an operator
				stack.push(new Integer(Integer.parseInt(token))); // Get the value of the element and push it on top of the stack
			}
		}
		return result;
	}


	private int evaluateSingleOperator(char operation, int operand1, int operand2) {
		int result = 0;
		
		switch(operation) {
		case ADD:
			result = operand1 + operand2;
			break;
		case SUBTRACT:
			result = operand1 - operand2;
			break;
		case MULTIPLY:
			result = operand1 * operand2;
			break;
		case DIVIDE:
			result = operand1 / operand2;
			break;
		}
		return result;
	}


	private boolean isOperator(String token) {
		return ( token.equals("+") || token.equals("-") ||
				 token.equals("*") || token.equals("/"));
	}

}
