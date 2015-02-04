
public class Time
{
   // Implement a class using a diagram

   // Declare fields
   private int seconds;
   private int minutes;
   private int hours;

   // Constructor
   public Time(int seconds, int minutes, int hours)
   {
      // Demand all values to be realistic
      // Otherwise object will default to all 0 values
      // although it should probably throw an error or something
      if (seconds < 60 && minutes < 60 && hours < 24)
      {
         this.seconds = seconds;
         this.minutes = minutes;
         this.hours = hours;
      }
   }

   // Other methods (getters, setters, etc.)
   public int getSeconds()
   {
      return this.seconds;
   }
   public int getMinutes()
   {
      return this.minutes;
   }
   public int getHours()
   {
      return this.hours;
   }

   public void setSeconds(int seconds)
   {
      this.seconds = seconds;
   }
   public void setMinutes(int minutes)
   {
      this.minutes = minutes;
   }
   public void setHours(int hours)
   {
      this.hours = hours;
   }

   // Return a String containing all the fields
   // This is a very repetitive way to do this, but it works...
   public String toString()
   {
      // Create String versions of class variables
      String seconds, minutes, hours;

      // Add padding if hours is less than 10
      if (this.hours < 10)
      {
         hours = "0" + this.hours;
      }
      else
      {
         hours = ""+ this.hours;
      }

      // Add padding if minutes is less than 10
      if (this.minutes < 10)
      {
         minutes = "0" + this.minutes;
      }
      else
      {
         minutes = "" + this.minutes;
      }

      // Add padding if seconds is less than 10
      if (this.seconds < 10)
      {
         seconds = "0" + this.seconds;
      }
      else
      {
         seconds = "" + this.seconds;
      }

      // Return the time (with the newly created Strings)
      return hours + ":" + minutes + ":" + seconds;
   }

   // Returns a new Time object
   // With the same values
   public Time copy()
   {
      return new Time(this.seconds, this.minutes, this.hours);
   }

   // Advance the time by one second
   // Adjust minute and hour if necessary
   public void advanceSeconds()
   {
      // If seconds currently is 59, set it to 0
      if (this.seconds == 59)
      {
         this.seconds = 0;
         // If minutes is also 59, set that to 0 too and advance hours by one
         if (this.minutes == 59)
         {
            this.minutes = 0;

            // If minutes is also 23, set that to 0
            if (this.hours == 23)
            {
               this.hours = 0;
            }
            // Otherwise just add one to hours
            else
            {
               this.hours += 1;
            }
         }
         // If minutes wasn't 59 , just increment it by 1
         else 
         {
            this.minutes += 1;
         }
      }
      // If seconds wasn't 59, just increment it by 1
      else
      {
         this.seconds += 1;
      }


   }
}
