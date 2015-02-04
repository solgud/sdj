
public class RectangleTest
{

   public static void main(String[] args)
   {
      // A program to test the Rectangle class
      
      // Make a new rectangle
      // With a width of 3 and a height of 4
      Rectangle rect = new Rectangle(3, 4);
      
      // It now has all the methods defined in its class (Rectangle)

      // Get the height and width
      System.out.println("Height is: " + rect.getHeight());
      System.out.println("Width is: " + rect.getWidth());
      
      // Get the area
      System.out.println("Area is: " + rect.getArea());

   }

}
