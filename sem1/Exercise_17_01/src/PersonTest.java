
public class PersonTest
{

   public static void main(String[] args)
   {
      // Test the Person class
      
      // Create two Person objects
      Person alice = new Person("Alice");
      Person bob = new Person("Bob");

      // Move them both to new houses
      // Lots of constructors!
      alice.moveTo(new House(80, new Address("Princessegade", 3000)));
      bob.moveTo(new House(100, new Address("Brombaervej", 4200)));
      
      // Print both of their addresses
      System.out.println("Alice lives at: " + alice.getAddress().getStreetAddress());
      System.out.println("Bob lives at: " + bob.getAddress().getStreetAddress());
      
      // Check to see if Alice and Bob live at the same place (same address and postcode)
      System.out.println(alice.getName() + " and " + bob.getName() 
                        + " live at the same place: " 
                        + alice.getAddress().equals(bob.getAddress()));
   }

}
