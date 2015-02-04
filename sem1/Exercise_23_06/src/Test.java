
public class Test
{

   public static void main(String[] args)
   {
      // Test the Drawing and Shape classes
      
      // Create a new Drawing
      Drawing drawing = new Drawing();
      
      // Create two circles and two squares
      Shape square1 = new Square(2);
      Square square2 = new Square(4);
      Shape circle1 = new Circle(2);
      Circle circle2 = new Circle(4);
      
      // Add all the Shapes to the Drawing
      drawing.addShape(square1);
      drawing.addShape(square2);
      drawing.addShape(circle1);
      drawing.addShape(circle2);
      
      // Print out the total area
      System.out.println(drawing.getTotalArea());
      
      // Find the largest Shape
      System.out.println(drawing.getLargestShape().toString());
      
   }

}
