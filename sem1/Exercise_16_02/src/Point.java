
public class Point
{
   // Declare variables
   private double x;
   private double y;

   // Constructor
   public Point(double x, double y)
   {
      this.x = x;
      this.y = y;
   }
   
   // Getter methods
   public double getX()
   {
      return this.x;
   }

   public double getY()
   {
      return this.y;
   }

   // Set x and y to new values
   public void moveTo(double x, double y)
   {
      this.x = x;
      this.y = y;
   }
   
   // Return a String representation
   public String toString()
   {
      return x + "," + y;
   }
   
   // Return a copy of the object
   public Point copy()
   {
      return new Point(this.x, this.y);
   }
   
}
