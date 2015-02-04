import java.util.Scanner;

public class AgeJudger
{

   public static void main(String[] args)
   {
      // Rehash of Age Judger in Exercise 03_03
      // Using conditional operators &&
      
      // Get scanner object
      Scanner keyboard = new Scanner(System.in);
      
      // Declare age variable
      int age;

      // Get age value from user
      System.out.println("What is your age?");
      age = keyboard.nextInt();
      
      // Compare values, judge accordingly
      if (age < 0)
      {
         System.out.println("Error in age value");
      }
      // Use && operators to check more than one expression
      else if (age >= 0 && age <= 12)
      {
         System.out.println("You are a child");
      }
      else if (age > 12 && age <= 19)
      {
         System.out.println("You are a teenager");
      }
      else if (age > 19 && age <= 65)
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
