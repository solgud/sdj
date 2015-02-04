
public class Person
{
   // Declare instance variables
   private String name;
   private int age;
   
   // Two-argument constructor
   public Person(String name, int age)
   {
      this.name = name;
      this.age = age;
   }
   
   // Single-argument constructor
   public Person(String name)
   {
      this.name = name;
      // Age is set to 0 as a default value
      this.age = 0;
   }

   // Getters and Setters for both instance variables
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
      return this.name + ", " + this.age;
   }
   
   // Check for Equality against another Person
   public boolean equals(Person person)
   {
      return this.name.equals(person.name)
            && this.age == person.age;
   }
   
   
   

}
