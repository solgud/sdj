
public class StudentTest
{
   public static void main(String[] args)
   {
      // Test the Student class
	  Student alice;
      try {
         alice = new Student("Alice", 3);
         alice.getName();
      }
      catch (IllegalGradeException e) {
         System.out.println("Grade must be valid on the Danish 7-point scale");
      }

   }
}
