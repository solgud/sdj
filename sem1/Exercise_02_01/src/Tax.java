
public class Tax
{

   public static void main(String[] args)
   {
      // Find tax on three items
      
      // Declare and initialize variables
      int item1 = 80, 
          item2 = 140,
          item3 = 230;
      double tax = 0.25;
      
      
      // Print results
      // Performing maths inside the print statement
      System.out.println("Item one tax: " + item1 * tax);
      System.out.println("Item one price after tax: " + (item1 + (item1*tax)));
      
      System.out.println("Item one tax: " + item2 * tax);
      System.out.println("Item one price after tax: " + (item2 + (item2*tax)));
      
      System.out.println("Item one tax: " + item3 * tax);
      System.out.println("Item one price after tax: " + (item3 + (item3*tax)));
   }

}