
public class Grade
{
   // Class copied from Exercise 18.02A
   private String courseName;
   private int grade;
   
   public Grade(String courseName, int grade)
   {
      // First error: courseName wasn't initialized here
      this.courseName = courseName; // Fixed
      
      // Second error: "grade = this.grade;" was backwards
      this.grade = grade; // Fixed
   }
   
   public String getCourseName()
   {
      // Not an error, but I like to use "this."
      // when referring to class variables
      return courseName;
   }
   
   public int getGrade()
   {
      // Not an error, but I like to use "this."
      // when referring to class variables
      return grade;
   }
   
   public void setGrade(int grade)
   {
      // Third error: same as the second, "grade = this.grade;" is backwards
      this.grade = grade; // Fixed
   }
   
   // Fourth error: ToString() should be toString() 
   public String toString() // Fixed
   {
      return this.courseName + ", " + this.grade;
   }

}
