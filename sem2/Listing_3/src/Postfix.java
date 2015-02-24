/**
 * Copy from the Lewis/Chase text, Listings 3.2-3.3
 *
 */
import java.io.IOException;
import java.util.Scanner;

public class Postfix {
	public static void main(String[] args) {
		String expression;
		boolean isFinished = false;
		int result;
		
		try {
			Scanner keyboard = new Scanner(System.in);
			while(!isFinished) {
				PostfixEvaluator evaluator = new PostfixEvaluator();
				System.out.println("Enter a valid postfix expression: ");
				expression = keyboard.nextLine();
				
				result = evaluator.evaluate(expression);
				System.out.println();
				System.out.println("That expression equals " + result);
				
				System.out.println("Evaulate another expression? [Y/N]");
				isFinished = keyboard.nextLine().equalsIgnoreCase("n"); // If response is "n", end loop
			}
		} catch(Exception e) {
			e.printStackTrace();
		}
		
	}


}
