
public class NameTest
{

   public static void main(String[] args)
   {
      // A program to test the Name class
      
      // Create a new name object
      Name me = new Name("Joe Schmoe");
      
      System.out.println(me.getFirstName());
      System.out.println(me.getLastName());
      System.out.println(me.getFullName());
      System.out.println(me.getFormalName());

   }

}
