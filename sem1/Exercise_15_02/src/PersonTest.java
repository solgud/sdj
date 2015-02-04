
public class PersonTest
{

   public static void main(String[] args)
   {
      // Test the Person class
      Person bob = new Person("Bob", new MyDate(1,1,1970));
      Person jim = new Person("Jim", new MyDate(1,1,1970));
      
      System.out.println(bob.sameBirthday(jim));
      

   }

}
