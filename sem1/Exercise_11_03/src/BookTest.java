
public class BookTest
{

   public static void main(String[] args)
   {
      // Test the Book class
      // Make two books, lower the prices on both,
      // and print information using the toString() method
      
      // Make two books
      Book pride = new Book("Jane Austen", "Pride and Prejudice", 10.99, 350);
      Book peace = new Book("Leo Tolstoy", "War and Peace", 15.50, 600);

      // Lower the prices on both
      // Using their setPrice() methods
      pride.setPrice(8.99);
      peace.setPrice(6.55);
      
      // Print information about the books
      // Using their toString() methods
      System.out.println(pride.toString());
      System.out.println(peace.toString());
   }

}
