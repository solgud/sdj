// Warning: trying to optimize causes insanity. Step away!!!

import java.util.Random;

public class NumberGuesser
{

   public static void main(String[] args)
   {
      Random random = new Random(); 
      int target = random.nextInt(1000) + 1;

      int guess = 500;
      
      while (guess != target)
      {
         System.out.println("\nMake a new guess!");
         
         if (guess > target)
         {
            System.out.println(guess + " is too high!");
            guess--;
         }

         else if (guess < target)
         {
            System.out.println(guess + " is too low!");
            guess++;
         }
      } 
      System.out.println("\nYou got it! The value was: " + target);
   }
}
