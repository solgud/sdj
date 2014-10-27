
public class Person
{
   // Declare instance variables
   private String name;
   private int age;
   
   // Two-argument Constructor 
   public Person(String name, int age)
   {
      this.name = name;
      this.age = age;
   }
   
   // Single-argument Constructor
   public Person(String name)
   {
      this.name = name;
      this.age = 0;
   }

   // Getters and Setters
   public String getName()
   {
      return this.name;
   }

   public void setName(String name)
   {
      this.name = name;
   }

   public int getAge()
   {
      return this.age;
   }

   public void setAge(int age)
   {
      this.age = age;
   }
   
   // Return a String representation
   public String toString()
   {
      // If age is still set to 0
      if (this.age == 0)
      {
         // Just return the name
         return "Name = " + this.name;
      }
      // Otherwise return both name and age
      return "Name = " + this.name + ", "
            + "Age = " + this.age;
   }
   
   // Check for equality against another object
   @Override
   public boolean equals(Object person)
   {
      // If the person argument is a Person instance
      if (person instanceof Person)
      {
         // Cast a copy of it to Person
         Person otherPerson = (Person) person;
         // Then check if fields match
         return this.age == otherPerson.age
               && this.name.equals(otherPerson.name);
      }
      // In any other case, return false
      return false;
      
   }
   
   
   

}
