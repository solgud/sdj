
public class EmployeeTest
{

   public static void main(String[] args)
   {
      // Test the Employee class
      
      Employee alice = new Employee("Alice", 25, 25000);
      Employee bob = new Employee("Bob", 25, 25000);
      
      System.out.println(alice.toString());
      System.out.println(bob.toString());
      System.out.println(alice.equals(bob));
      alice.setName("Bob");
      System.out.println(alice.equals(bob));
      
      


   }

}
