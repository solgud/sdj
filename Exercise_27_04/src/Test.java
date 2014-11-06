
public class Test
{

   public static void main(String[] args)
   {
      // Test the Student class
      Student bob = new Student("Bob", 222333);
      
      try
      {
         bob.addExam(new GradedExam("English", 3, 10));
         bob.addExam(new GradedExam("Math", 4, 0));
         bob.addExam(new GradedExam("Physics", 3, 12));
         bob.addExam(new GradedExam("Danish", 3, 7));
         bob.addExam(new GradedExam("Perl", 3, -3));
         bob.addExam(new PassFailExam("Lego", 2, false));
      }
      catch (ExceededMaximumItemsException e)
      {
         e.printStackTrace();
      }
      System.out.println(bob.getAverageGrade());

   }

}
