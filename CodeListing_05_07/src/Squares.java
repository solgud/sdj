import java.util.Scanner;

import javax.swing.text.NumberFormatter;


public class Squares
{

   public static void main(String[] args)
   {
      int count;
      Scanner key = new Scanner(System.in);
      
      System.out.println("Give me a count!");
      count = key.nextInt();

      System.out.println("Number\t\tNumber Squared");
      System.out.println("--------------------------------");
      for (int number = 1; number <= count; number ++)
      {
         System.out.println(number + "\t|\t" + (int) Math.pow(number, 2));
      }
   }

}
