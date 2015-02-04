
public class Actor
{
   // Declare class variables
   private String name;
   private int numberOfEmmys;
   private int numberOfEpisodes;
   
   // Constructor
   public Actor(String name)
   {
      this.name = name;
      
      // Reasonable to assume 0 awards or episodes
      // until that is explicitly added
      this.numberOfEmmys = 0;
      this.numberOfEpisodes = 0;
   }
   // Getters and setters
   public String getName()
   {
      return name;
   }
   public void setName(String name)
   {
      this.name = name;
   }
   
   public int getNumberOfEmmys()
   {
      return this.numberOfEmmys;
   }
   
   public int getNumberOfEpisodes()
   {
      return this.numberOfEpisodes;
   }
   
   // Award actor an Emmy
   public void awardEmmy()
   {
      this.numberOfEmmys += 1;
   }

   // Actor participates in an episode
   public void participateInEpisode()
   {
      this.numberOfEpisodes += 1;
   }
   
   
   

}
