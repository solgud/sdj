public class Statements
{

   public static void main(String[] args)
   {
      // Random problems in the book
      // Playing with if statements
      // Kind of hard to comment/follow :\
      
      int x, y, z, hours;
      double payRate;
      char myCharacter;
      z = 0;
      
      // 4.1
      y = 30;
      if (y == 20)
         x = 0;
      
      // 4.2
      hours = 45;
      payRate = 75;
      if (hours > 40)
         payRate *= 1.5;
      System.out.println("Payrate: " + payRate);
      
      // 4.5
      x = 100;
      if (x > 100)
      {
         y = 20;
         z = 40;
      }
      x = z < 0 ? 4 : 3; 
      // 4.7
      myCharacter = 'D';
      if (myCharacter == 'D')
      {
         System.out.println("GoodBye");
      }
   }

}
