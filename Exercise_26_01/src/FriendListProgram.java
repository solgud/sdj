import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;


public class FriendListProgram
{

   public static void main(String[] args)
   {
      // Ask user to input names of friends
      // Write the names to a specified file
      // First input is filename
      // Program ends when input is DONE
      String fileName;
      
      try {
         // Create the PrintWriter
         FileOutputStream outputStream = new FileOutputStream(fileName);
         PrintWriter out = new PrintWriter(outputStream);
         // Print to PrintWriter
         out.println();
      } catch (FileNotFoundException e) {
         System.out.println("No such file");
      } finally {
         // Close the PrintWriter
         out.close();
      }

      
      
      

   }

}
