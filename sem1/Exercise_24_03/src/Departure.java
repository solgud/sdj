
public class Departure
{
   private String dayAndTime;
   private Trip trip;
   
   public Departure(String dayAndTime, Trip trip)
   {
      this.dayAndTime = dayAndTime;
      this.trip = trip;
   }
   
   public String getDayAndTime()
   {
      return this.dayAndTime;
   }
   
   public Harbor getFrom()
   {
      return this.trip.getFrom();
   }
   public Harbor getTo()
   {
      return this.trip.getTo();
   }

}
