import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.util.Scanner;


public class FriendListProgram
{

   public static void main(String[] args)
   {
      // Ask user to input names of friends
      // Write the names to a specified file
      // First input is filename
      // Program ends when input is DONE
      Scanner keyboard = new Scanner(System.in);
      System.out.println("Enter filename: ");
      String fileName = keyboard.nextLine();

      // Top try block
      // To check for file exceptions
      try {
         // Create the PrintWriter
         FileOutputStream outputStream = new FileOutputStream(fileName);
         PrintWriter out = new PrintWriter(outputStream);
         // Second try block
         // To check for file writing exceptions
         try {
            // Do one iteration before loop begins
            // To allow for zero-name entries
            System.out.print("Friend name: ");
            String friendName = keyboard.nextLine();
            // Then start the loop
            while(!friendName.equals("DONE"))
            {
               // Start by printing, so that DONE is never written to the file
               out.println(friendName);
               System.out.print("Friend name: ");
               friendName = keyboard.nextLine();
            }
         }
         // Allways make sure the PrintWriter closes
         finally {
            out.close();
         }
      } catch (FileNotFoundException e) {
         System.out.println("No such file");
      }
      // Close the Scanner
      keyboard.close();
   }
}
