public class ModulusLoop
{

   public static void main(String[] args)
   {
      int i = 3;
      while( i < 2147483647)
      {
         if (i % 2 == 0)
         {
            System.out.println(i + " is Even");
         }
         else
         {
            System.out.println(i + " is Odd");
         }
         i = (int) Math.pow(i, 2);
      }
   }

}
