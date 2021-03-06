import utility.collection.*;

public class Main {

	public static void main(String[] args) {
		ArrayStack<String> words = new ArrayStack<String>();

		words.push("First");
		words.push("Second");
		words.push("Third");
		words.push("Fourth");
		words.push("Fifth");
		
		System.out.println("Top Element: " + words.peek());
		
		System.out.println(words.toString());

		System.out.println("Popping");
		words.pop();
		System.out.println(words.toString());

		System.out.println("Pushing");
		words.push("Fifth");
		System.out.println(words.toString());

	}

}
