
public class PersonTest
{

   public static void main(String[] args)
   {
      // A program to test the Person class
      
      // Create a new Person object
      Person joe = new Person("Joe", "1, 1, 1970");
      
      // It has the methods defined in Person
      System.out.println("Name is: " + joe.getName());
      System.out.println("Birthday is: " + joe.getBirthday());

   }

}
