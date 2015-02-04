
public class Guest
{
   // Declare class variables
   private String name;
   
   // Constructor
   public Guest(String name)
   {
      this.name = name;
   }
   
   // Getter
   public String getName()
   {
      return this.name;
   }
   
   // Check for equality
   // against another object
   public boolean equals(Object obj)
   {
      // First, check if obj is of type Guest
      // Using the instanceof operator
      // If obj isn't an instance of Guest
      // return false
      if (!(obj instanceof Guest))
      {
         return false;
      }
      // If it is a Guest object, then check the name property for equality
      // Note that the this.name.equals() method will result in a boolean
      return this.name.equals(((Guest) obj).name);
   }
   

}
