import java.util.Scanner;
public class GenderTest
{

   public static void main(String[] args)
   {
      // Get a gender input from the user
      // And report whether it is male or female
      // Note: this is gender normative. Ick.
      
      // Get a scanner object
      Scanner input = new Scanner(System.in);
      
      // Ask the user for input
      System.out.print("Type gender (M or F or Awesome)");
      String line = input.nextLine();
      
      // Get the first character in the string
      char gender = line.charAt(0);
      
      // Find and print result
      if (gender == 'M')
         System.out.print("Male");
      else
         System.out.print("Not a Male");
      input.close();
   }

}
