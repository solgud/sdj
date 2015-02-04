
public class Circle
{
   // Declare fields
   private double radius;
   private Point center;

   // Constructor
   public Circle(Point center, double radius)
   {
      this.radius = radius;
      // Give a new center instance to each new circle object
      this.center = center.copy();
   }
   
   // Getters
   public Point getCenter()
   {
      // Get a copy of the center object
      // This way the caller only gets access to a copy, not the original
      return this.center.copy();
   }
   
   public double getRadius()
   {
      return this.radius;
   }

   // Move the center
   // Use the method in the Point object
   public void moveTo(double x, double y)
   {
      this.center.moveTo(x, y);
      
   }
   
   // Return a String representation
   public String toString()
   {
      return "Radius: " + this.radius + ", Center: " + this.center.toString();
   }
}
