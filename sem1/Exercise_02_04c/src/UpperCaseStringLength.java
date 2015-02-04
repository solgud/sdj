
public class UpperCaseStringLength
{

   public static void main(String[] args)
   {
      // Play with String methods
      
      // Declare and initialize a String object
      String name = "Kris";
      
      // Get the length of the string
      int stringSize = name.length();
      
      // Set all letters to uppercase
      name = name.toUpperCase();
      
      // Print the results
      System.out.println(name + " has " + stringSize + " characters");
   }

}