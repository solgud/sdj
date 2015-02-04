
public class Circle
{
   private double radius;
   
   // Create a no-argument constructor
   public Circle()
   {
      this.radius = 0;
   }

   // Create an overloaded constructor
   public Circle(double radius)
   {
      this.radius = radius;
   }
   
   public double getArea()
   {
      return Math.PI * this.radius * this.radius;
   }
   
   public double getRadius()
   {
      return this.radius;
   }

   // Return a String representation
   public String toString()
   {
      return "radius: " + this.radius + ", area: " + this.getArea();
   }
   
   // Check for equality with another Circle object
   public boolean equals(Circle other)
   {
      return this.radius == other.radius;
   }
}
