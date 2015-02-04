
public class GradedExam extends Exam
{
   private int grade;

   public GradedExam(String name, int ectsPoints, int grade)
   {
      super(name, ectsPoints);
      // If not a valid grade
      if (!(grade == -3
            || grade == 0
            || grade == 2
            || grade == 4
            || grade == 7
            || grade == 10
            || grade == 12))
      {
         // Throw an exception
         throw new IllegalArgumentException();
      } 
      this.grade = grade;
   }
   
   @Override
   public boolean isPassed()
   {
      return this.grade > 0;
   }
   
   public int getGrade()
   {
      return this.grade;
   }
   
   public String toString()
   {
      return super.toString() + ", " + "Grade: " + this.grade;
   }

}
