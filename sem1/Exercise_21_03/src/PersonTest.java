
public class PersonTest
{

   public static void main(String[] args)
   {
      // Test the Person class
      Person alice = new Person("Alice", 25);
      Person bob = new Person("Bob", 25);
      
      System.out.println(alice.getAge());
      System.out.println(alice.getName());
      System.out.println(alice.toString());
      System.out.println("Changing name and age...");
      alice.setName("Ashley");
      alice.setAge(26);
      System.out.println(alice.getAge());
      System.out.println(alice.getName());
      System.out.println(alice.toString());
      System.out.println(alice.equals(bob));
      alice.setAge(25);
      alice.setName("Bob");
      System.out.println("Changing name and age to match Bob...");
      System.out.println(alice.equals(bob));

   }

}
