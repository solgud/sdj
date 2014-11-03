import java.io.*;
import java.util.Scanner;

public class IOTest
{

   public static void main(String[] args) throws IOException
   {
      // Playing with File IO using the Gaddis textbook
      Scanner keyboard = new Scanner(System.in);
      System.out.println("Enter the filename: ");
      String fileName = keyboard.nextLine();
      PrintWriter outputFile = new PrintWriter(fileName);
      outputFile.println("Hello, world!!!");
      outputFile.flush();
      outputFile.println("Hello, mars!!!");
      outputFile.close();
      keyboard.close();
   }

}
