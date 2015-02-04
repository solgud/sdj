public class Person
{
   // Create a Person class like in Exercise 10.05
   // But use a constructor
   
   // Declare the fields
   private String name;
   private String birthday;
   
   // Make a constructor
   // Takes in a String for the name
   // and a String for the birthday
   public Person (String n, String b)
   {
      // Set the fields to the arguments passed to the constructor
      // when called - i.e.: Person joe = new Person("Joe", "1/1/1970");
      this.name = n;
      this.birthday = b;
   }

   // Getter methods and the like go here:
   public String getBirthday()
   {
      return this.birthday;
   }

   public String getName()
   {
      return this.name;
   }
}
