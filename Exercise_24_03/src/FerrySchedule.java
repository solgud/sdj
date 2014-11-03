import java.util.ArrayList;


public class FerrySchedule
{
   private ArrayList<Departure> departures;
   
   public FerrySchedule()
   {
      this.departures = new ArrayList<Departure>();
   }
   
   public void addDeparture(String dayAndTime, Trip trip)
   {
      this.departures.add(new Departure(dayAndTime, trip));
   }
   
   public int getDepartureCount()
   {
      return this.departures.size();
   }
   
   public Departure getDeparture(int index)
   {
      return this.departures.get(index);
   }
   
   public ArrayList<Departure> getDeparturesFrom(Harbor harbor)
   {
      ArrayList<Departure> departuresFrom = new ArrayList<Departure>();
      
      for(Departure departure : this.departures)
      {
         if (departure.getFrom().equals(harbor))
         {
            departuresFrom.add(departure);
         }
      }
      return departuresFrom;

   }

}
