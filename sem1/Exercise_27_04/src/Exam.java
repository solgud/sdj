
public abstract class Exam
{
   private String courseName;
   private int ectsPoints;
   
   public Exam(String name, int ectsPoints)
   {
      this.courseName = name;
      this.ectsPoints = ectsPoints;
   }
   
   public String getCourseName()
   {
      return this.courseName;
   }
   
   public int getEctsPoints()
   {
      return this.ectsPoints;
   }
   
   public abstract boolean isPassed();
   
   public String toString()
   {
      return "Course name: " + this.courseName + ", "
               + "ECTS Points: " + this.ectsPoints;
   }

}
