public class Rectangle
{
   // Declare fields
   private double width;
   private double height;
   
   // Class methods
   
   // Set width field to a value that is input as an argument
   public void setWidth(double width)
   {
      this.width = width;
   }
   
   // Return the value in the width field
   public double getWidth()
   {
      return this.width;
   }
   
   // Set height field to a value that is input as an argument
   public void setHeight(double height)
   {
      this.height = height;
   }
   
   // Return the value in the height field
   public double getHeight()
   {
      return this.height;
   }
   
   // Return an area
   // Which is calculated with the values in both fields
   public double getArea()
   {
      return this.height * this.width;
   }

}
