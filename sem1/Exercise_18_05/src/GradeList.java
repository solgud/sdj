import java.util.ArrayList;

public class GradeList
{
   // Declare class variable
   // This time it's just an ArrayList of Grade objects
   private ArrayList<Grade> grades;
   
   // Constructor
   public GradeList()
   {
      // Just make a new empty ArrayList
      this.grades = new ArrayList<Grade>();
   }
   
   // Return the length of the ArrayList
   // This is a vestige of the prior Class that used a normal Array
   public int getSize()
   {
      // Use native method of the ArrayList
      return grades.size();
   }
   
   // Get the Grade object at the specified index
   public Grade getGrade(int index)
   {
      // If index is out of bounds, return a null value
      if (index < 0 || index >= getSize())
      {
         return null;
      }

      // Otherwise, get the object at the specified index
      return grades.get(index);
   }
   
   // Return an array containing all the Grade objects
   public Grade[] getAllGrades()
   {
      // Make a simple gradeArray
      Grade[] gradeArray = new Grade[grades.size()];
      
      // Loop through the ArrayList
      for (int i = 0; i < grades.size(); i++)
      {
         // Copy element from the ArrayList to the array
         gradeArray[i] = grades.get(i);
      }
      // Return the array of Grade objects
      return gradeArray;
   }
   
   // Add a grade to the ArrayList
   public void addGrade(Grade grade)
   {
      // Just use native ArrayList method
      grades.add(grade);
   }

   // Get the average of all the grades
   public double getAverage()
   {
      // Declare and initialize a sum variable
      int sum = 0;
      // Loop through the ArrayList
      for (int i = 0; i < getSize(); i++) // Still using getSize(), but could use grades.size() as well
      {
         // Increment sum with the grade at the current index
         sum += grades.get(i).getGrade();
      }
      // Find the average
      double avg = (double) sum / getSize();
      // Return the average
      return avg;
   }
   
   // Return a String representation of all the grades
   public String toString()
   {
      // Fixed
      // Start with a basic String with the average
      String s = "Grade list: (average = " + this.getAverage() + ")\n";
      // Loop through the grades array
      for (int i = 0; i < this.getSize(); i++)
      {
         // For each index, use the toString method in the current Grade object
         s += this.getGrade(i).toString() + "\n";
      }
      // Return the collected string
      return s;
   }

}
