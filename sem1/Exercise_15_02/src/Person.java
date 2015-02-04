public class Person
{
   // Create a Person class like in Exercise 10.05
   // But use a constructor
   
   // Declare the fields
   private String name;
   private MyDate birthday;
   
   // Make a constructor
   // Takes in a String for the name
   // and a String for the birthday
   public Person (String name, MyDate birthday)
   {
      this.name = name;
      this.birthday = birthday;
   }

   // Getter method for name
   public String getName()
   {
      return this.name;
   }

   // Getter method for birthday
   public String getBirthday()
   {
      return this.birthday.toString();
   }
   
   // Setter method for name
   public void setName(String name)
   {
      this.name = name;
   }
   
   // Setter method for birthday
   public void setBirthday(MyDate birthday)
   {
      this.birthday = birthday;
   }
   
   // Check for equality with another Person object
   public boolean equals(Person other)
   {
      return this.name == other.name &&
             this.birthday.equals(other.birthday);
   }
   
   public boolean sameBirthday(Person other)
   {
      return this.birthday.equals(other.birthday);
   }
}