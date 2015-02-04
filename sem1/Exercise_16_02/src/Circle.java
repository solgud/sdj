
public class Circle
{
   // Declare fields
   private double radius;
   private Point center;

   // Constructor
   public Circle(Point center, double radius)
   {
      this.radius = radius;
      this.center = center;
   }
   
   // Getters
   public Point getCenter()
   {
      return this.center;
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
