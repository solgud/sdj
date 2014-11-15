import java.util.Scanner;
public class GenderTest_b
{

   public static void main(String[] args)
   {
      // Ask the user for input
      // Return whether user is a man, boy, woman, or girl
      // Using nested if/else statements
      
      // Declare age variable
      int age;
      
      // Get a scanner object
      Scanner input = new Scanner(System.in);
      
      // Get the age from the user
      System.out.print("Input age");
      age = input.nextInt();
      input.nextLine(); // Prevent nextLine() from falling through

      // Get the gender from the user
      System.out.print("Type gender (M or F)");
      String line = input.nextLine();
      
      // Set gender character to the first character in the given String
      char gender = line.toUpperCase().charAt(0);
      
      // Check if age is greater or equal to 18
      if (age >= 18)
      {
         // if so, check for gender
         if (gender == 'F')
            // Over 18, Female -> Woman
            System.out.print("Woman");
         else
            // Over 18, not Female -> Man (if we assume binary genders...)
            System.out.print("Man");
      }
      else
      {
         // Here we can assume age is less than 18
         if (gender =='F')
            // Under 18, Female -> Girl
            System.out.print("Girl");
         else
            // Under 18, Male -> Boy
            System.out.print("Boy");
      }
      input.close();
   }

}
   