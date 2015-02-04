
public class Person
{
   // Declare class variables
   private String name;
   private House home;
   
   // Constructor
   // Setting home to null
   public Person(String name)
   {
      this.name = name;
      this.home = null;
   }
   
   // Set the house for the person
   // This doesn't need to be compositional
   // because the house object being passed in
   // can still be changed by external factors
   // it isn't a part of the person
   public void moveTo(House house)
   {
      this.home = house;
   }

   // Return the name of the person
   public String getName()
   {
      return this.name;
   }
   
   // Return the address
   // using the method in home
   // I want this to throw an error or check to see if home isn't null
   // But there's no clear way to do that...
   public Address getAddress()
   {
      return this.home.getAddress();
   }
}
