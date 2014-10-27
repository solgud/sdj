
public class Circle extends Shape
{
   // Declare instance variables
   private double radius;
   
   // Constructor
   public Circle(double radius)
   {
      this.radius = radius;
   }
   
   // Getter and Setter
   public double getRadius()
   {
      return this.radius;
   }

   public void setRadius(double radius)
   {
      this.radius = radius;
   }
   
   // Return the area, as shown in the abstract superclass
   @Override
   public double getArea()
   {
      return Math.PI * this.radius * this.radius;
   }
   
   // Return a String representation
   public String toString()
   {
      return "Radius = " + this.radius;
   }
   

}
