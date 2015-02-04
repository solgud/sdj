/*
 * Reads a grade from the 7-grade scale
 * and displays the equivalent ECTS grade
 * 
 * 7-grade: {12,10,7,4,2,0,-3}
 * ECTS:    {A,B,C,D,E,Fx,F}
 */

import java.util.Scanner;

public class ECTS
{
   public static void main(String[] args)
   {
      // Convert a grade from 12-scale to ECTS
      
      // Declare variables
      int grade;
      String ects;
      
      // Get a scanner object
      Scanner keyboard = new Scanner(System.in);
      
      // Get value from the user
      System.out.println("Enter a grade from the 7-grade scale");
      grade = keyboard.nextInt();
      
      // Use switch statement to match values
      switch (grade)
      {
         case 12:
            ects = "A";
            break;
         case 10:
            ects = "B";
            break;
         case 7:
            ects = "C";
            break;
         case 4:
            ects = "D";
            break;
         case 2:
            ects = "E";
            break;
         case 0:
            ects = "Fx";
            break;
         case -3:
            ects = "F";
            break;
         default:
            ects = ""; // Default to a null value
            break;
      }
      
      // If value was set, return result
      if (!ects.equals(""))
      {
         System.out.println("7-grade value: " + grade);
         System.out.println("ECTS equivalent: " + ects);
      }
      else
      {
         // Otherwise, return an error
         System.out.println("Grade: " + grade + " is off of the 7-grade scale.");
      }
      keyboard.close();
   }
}