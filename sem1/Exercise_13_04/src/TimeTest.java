
public class TimeTest
{

   public static void main(String[] args)
   {
      // Test the time class
      
      // Make a new time object
      // Set to 23:59:59
      Time time = new Time(59, 59, 23);
      System.out.println("Time is: " + time.toString());

      // Copy that object
      Time time2 = time.copy();
      System.out.println("Time two is: " + time2.toString());
      
      // Advance by one second (pushing over to 00:00:00
      time.advanceSeconds();
      System.out.println("Time one is now: " + time.toString());
      System.out.println("Time two is: " + time2.toString());
      // Advance by another second
      time.advanceSeconds();
      System.out.println("Time one is now: " + time.toString());
      
   }

}
