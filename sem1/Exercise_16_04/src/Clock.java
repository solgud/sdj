public class Clock
{
   // Declare variables
   // Here we are using a time object
   private Time time;
   
   // Constructor
   public Clock(int seconds, int minutes, int hours)
   {
      // Make a new time object with the given arguments
      this.time = new Time(seconds, minutes, hours);
   }
   
   // Return a new time object with the same time as the clock
   public Time getTime()
   {
      // Use the copy method on the time object
      // This keeps the original time object local to the clock
      return this.time.copy();
   }
   
   // Show the time the clock has
   public String toString()
   {
      // Use the toString method on the time object
     return this.time.toString();
   }
   
   // Return a copy clock object
   public Clock copy()
   {
      // Use the constructor with the values in the time object
      return new Clock(this.time.getSeconds(), this.time.getMinutes(), this.time.getHours());
   }
   
   // Advance the time by one second
   public void advanceSeconds()
   {
      // Use the advance seconds method on the time object
      this.time.advanceSeconds();
   }

}