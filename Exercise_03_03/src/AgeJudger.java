import java.util.Scanner;
public class AgeJudger
{

   public static void main(String[] args)
   {
      // Get the user's age
      // And judge them accordingly
      
      // Get a scanner object
      Scanner keyboard = new Scanner(System.in);
      
      // Declare age variable
      int age;
      
      // Get the age from the user
      System.out.print("What is your age?");
      age = keyboard.nextInt();
      
      // Use a series of if/else if/else statements
      // Print results in each
      if (age < 0)
      {
         System.out.println("Error in age value");
      }
      else if (age <= 12)
      {
         System.out.println("You are a child");
      }
      else if (age <= 19)
      {
         System.out.println("You are a teenager");
      }
      else if (age <= 65)
      {
         System.out.println("You are an adult");
      }
      else
      {
         System.out.println("You are a senior citizen");
      }
      keyboard.close();
   }

}
