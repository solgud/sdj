import java.util.Scanner;


public class SmallestDivisor
{

   public static void main(String[] args)
   {
      Scanner keyboard = new Scanner(System.in);
      System.out.println("Give me an n!");
      int n = keyboard.nextInt();
      int divisor = 2;
      while (n % divisor != 0)
      {
      divisor++;
      }
      System.out.println(divisor);
      keyboard.close();   
   }

}
