
public class Student
{
   private String name;
   private int grade;
   
   public Student(String name, int grade)
   {
      this.name = name;
      setGrade(grade);
   }
   
   public String getName()
   {
      return this.name;
   }
   
   public int getGrade()
   {
      return this.grade;
   }
   
   public void setGrade(int grade)
   {
      if (grade != -3 
            && grade != 0 
            && grade != 2
            && grade != 4
            && grade != 7
            && grade != 10
            && grade != 12)
      {
         throw new IllegalGradeException();
      }
      this.grade = grade;
   }
   
   public String toString()
   {
      return "Name: " + this.name + ", "
            + "Grade: " + this.grade;
   }

}
