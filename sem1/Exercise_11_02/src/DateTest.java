
public class DateTest
{

   public static void main(String[] args)
   {
      // A program to test the MyDate class

      // Make a new MyDate object
      MyDate date = new MyDate(1,1,1970);
      
      // It has all the methods defined in its class (MyDate)
      System.out.println("Day is: " + date.getDay());
      System.out.println("Month is: " + date.getMonth());
      System.out.println("Year is: " + date.getYear());
      
      date.displayDate();
   }

}
