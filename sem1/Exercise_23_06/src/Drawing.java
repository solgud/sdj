import java.util.ArrayList;

public class Drawing
{
   // Declare instance variables
   private ArrayList<Shape> shapes;
   
   // Empty constructor
   public Drawing()
   {
      this.shapes = new ArrayList<Shape>();
   }
   
   // Add a Shape to the ArrayList
   public void addShape(Shape shape)
   {
      this.shapes.add(shape);
   }
   
   // Return number of items in ArrayList
   public int getNumberOfShapes()
   {
      return this.shapes.size();
   }
   
   // Get a Shape by reference to its index in the ArrayList
   public Shape getShape(int index)
   {
      return this.shapes.get(index);
   }
   
   // Get the total area of all the Shapes
   public double getTotalArea()
   {
      // Start with a counter set to zero
      double totalArea = 0;
      // Loop through the ArrayList
      for (int i = 0; i < this.shapes.size(); i++)
      {
         // Add the total area of each item to the counter
         totalArea += this.shapes.get(i).getArea();
      }
      // Outside of the loop, return the counter
      return totalArea;
      
   }
   
   // Find and return the largest shape in the array
   public Shape getLargestShape()
   {
      // Start with a largest Shape item
      // Set it to a junk value for now
      Shape largestShape = new Square(0);
      
      // Loop through the ArrayList
      for (int i = 0; i < this.shapes.size(); i++)
      {
         // If the Shape at the current index 
         // is greater than the current largest Shape
         if (this.shapes.get(i).getArea() > largestShape.getArea())
         {
            // Set the largest Shape to be that Shape
            largestShape = this.shapes.get(i);
         }
      }
      // Outside of the loop, return the largest Shape
      return largestShape;
   }

}
