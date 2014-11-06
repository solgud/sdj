
public class PassFailExam extends Exam
{
   private boolean passed;

   public PassFailExam(String name, int ectsPoints, boolean passed)
   {
      super(name, ectsPoints);
      this.passed = passed;
   }

   @Override
   public boolean isPassed()
   {
      return this.passed;
   }
   
   public String toString()
   {
      return super.toString() + ", " + "Passed: " + this.passed;
   }
}
