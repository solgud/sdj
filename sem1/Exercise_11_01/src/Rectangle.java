
public class Rectangle
{
   // Update the Rectangle class from Exercise 10.02
   // using constructors
   
   // Declare fields
   private double width;
   private double height;

   // Create the constructor
   // Takes in two doubles, w and h (for width and height)
   public Rectangle(double w, double h)
   {
      // Set fields to the arguments
      this.width = w;
      this.height = h;
   }
   
   // Create a no-argument constructor
   // This will only be used if a new Rectangle object is created
   // but the constructor is passed 0 arguments
   // Kind of like a default
   // Set it to 3x2
   public Rectangle()
   {
      this.width = 3.0;
      this.height = 2.0;
   }
   
   // Getter methods and the like go here:

   // Return the value in the height field
   public double getHeight()
   {
      return this.height;
   }

   // Return the value in the width field
   public double getWidth()
   {
      return this.width;
   }
   
   // Return an area
   // Which is calculated with the values in both fields
   public double getArea()
   {
      return this.height * this.width;
   }
}
