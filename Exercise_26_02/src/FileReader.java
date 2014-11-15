import java.util.Scanner;


public class FileReader
{

   public static void main(String[] args)
   {
      // Print the contents of a file
      // Ask user for a filename
      // Then print the contents of that file
      
      // Create a new keyboard object
      Scanner keyboard = new Scanner(System.in);

      String fileName;
      
      // Open a stream
      // Open a file
      System.out.println("Enter filename: ");
      try {
         fileName = keyboard.nextLine();

      
      // Loop through the file
      // Print each line
      
      // Close the stream
      
      // Close the keyboard
      keyboard.close();
      
   }
}
