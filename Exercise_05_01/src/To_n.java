import java.util.Scanner;


public class To_n
{

   public static void main(String[] args)
   {
      int n, i = 0;
      Scanner keyboard = new Scanner(System.in);

      // Get n
      System.out.println("Give me a number!");
      n = keyboard.nextInt();
      
      // Loop from 0 until n
      while (i < n)
      {
         System.out.print(i + ", ");
         i++;
      }
      System.out.println(n);
      
   }

}
