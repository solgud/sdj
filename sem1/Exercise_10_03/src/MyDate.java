// Create a class MyDate
// Store three fields: day, month, year
// And manually create getter and setter methods for each
// Finally, make a displayDate method that displays a formatted date

public class MyDate
{
   // Declare fields
   private int day;
   private int month;
   private int year;

   // Setter and getter methods
   public void setDay(int day)
   {
      this.day = day;
   }
   
   public int getDay()
   {
      return this.day;
   }

   public void setMonth(int month)
   {
      this.month = month;
   }
   
   public int getMonth()
   {
      return this.month;
   }

   public void setYear(int year)
   {
      this.year = year;
   }
   
   public int getyear()
   {
      return this.year;
   }
   
   // Send a formatted date to the console
   public void displayDate()
   {
      System.out.printf("%d/%d/%d%n", this.day, this.month, this.year);
   }
}
