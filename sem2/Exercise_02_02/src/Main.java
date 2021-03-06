import utility.collection.BoundedArrayStack;

public class Main {

	public static void main(String[] args) {
		BoundedArrayStack<String> words = new BoundedArrayStack<String>(5);

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
		
		try{
			words.push("Sixth");
			System.out.println(words.toString());
		} catch (IllegalStateException e) {
			System.out.println("Didn't work!");
		}
	}

}
