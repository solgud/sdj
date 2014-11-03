
public class StudentTest
{
   public static void main(String[] args)
   {
      // Test the Student class
      try {
         Student alice = new Student("Alice", 3);
      }
      catch (IllegalGradeException e) {
         System.out.println("Grade must be valid on the Danish 7-point scale");
      }
   }
}
