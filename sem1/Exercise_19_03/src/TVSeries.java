import java.util.ArrayList;

public class TVSeries
{
   // Declare class variables
   private String title;
   private int numberOfEpisodes;
   private ArrayList<Actor> actors;

   // Constructor
   public TVSeries(String title)
   {
      this.title = title;
      // Start with zero episodes
      this.numberOfEpisodes = 0;
      // Start with an empty ArrayList
      this.actors = new ArrayList<Actor>();
   }
   
   // Hire an actor
   public void hireActor(Actor actor)
   {
      this.actors.add(actor);
   }
   
   // Return the number of actors
   public int getNumberOfActors()
   {
      return this.actors.size();
   }
   
   // Return an actor by index
   // This is not compositional
   public Actor getActor(int index)
   {
      return this.actors.get(index);
   }
   
   // Award an Emmy to an actor
   // referenced by name
   public void awardEmmy(String name)
   {
      // Loop through the ArrayList
      for (int i = 0; i < this.actors.size(); i++)
      {
         // If the actors name matches the argument
         if (this.actors.get(i).getName().equals(name))
         {
            // Award that actor an Emmy
            this.actors.get(i).awardEmmy();
         }
      }
      // No need to do anything else!
   }
   
   // Make a new episode
   public void makeNextEpisode()
   {
      this.numberOfEpisodes += 1;
   }
   
   // Return an ArrayList of actors
   // who have been awarded at least one Emmy
   public ArrayList<Actor> getEmmyWinners()
   {
      // Make a new ArrayList to hold all the winners
      ArrayList<Actor> winners = new ArrayList<Actor>();
      
      // Loop through the arrays
      for(int i = 0; i < this.actors.size(); i++)
      {
         // If the actor at the current index 
         // has at least one Emmy
         if (this.actors.get(i).getNumberOfEmmys() > 0)
         {
            // Then add that actor to the winners ArrayList
            winners.add(this.actors.get(i));
         }
      }
      // Finally, return the winners ArrayList
      return winners;
   }
   
   // Return a String representation
   // NOT FINISHED!!!
}
