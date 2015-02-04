
public class Harbor
{
   public String name;
   public String town;
   
   public Harbor(String name, String town)
   {
      this.name = name;
      this.town = town;
   }
   
   public String getName()
   {
      return this.name;
   }

   public void setName(String name)
   {
      this.name = name;
   }
   
   public String getTown()
   {
      return this.town;
   }
   
   public boolean equals(Object obj)
   {
      if (obj instanceof Harbor)
      {
         Harbor other = (Harbor) obj;
         return this.name.equals(other.name)
               && this.town.equals(other.town);
      }
      return false;
   }
}
