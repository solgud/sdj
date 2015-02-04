
public class Rectangle
{
   // Note the lack of a static void main method
   // This is in a different class (in this case LengthWidthDemo.java)

   // Declaring fields
   // Fields store data
   private double length;
   private double width;
   
   
   // Writing methods
   // Methods perform actions on data (a.k.a fields)
   
   // Takes an argument len
   // Stores value in length field
   public void setLength(double len)
   {
      length = len;
   }

   // Takes an argument w
   // Stores value in width field
   public void setWidth(double w)
   {
      width = w;
   }
   
   // Returns value in length field
   public double getLength()
   {
      return length;
   }

   // Returns value in width field
   public double getWidth()
   {
      return width;
   }
}
