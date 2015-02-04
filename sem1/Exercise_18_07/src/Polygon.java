
public class Polygon
{
   // Declare class variable
   private Point[] vertices;
   
   // Two argument constructor
   // Take an array of x values and an array of y values
   public Polygon(int[] xValues, int[] yValues)
   {
      // Set the length of the vertices array
      this.vertices = new Point[xValues.length];
      
      // Loop through the arrays
      for (int i = 0; i < vertices.length; i++)
      {
         // Set the indexed element to a new Point object
         // That holds the corresponding x and y values
         vertices[i] = new Point(xValues[i], yValues[i]);
      }
   }
   
   // Single argument constructor
   // Takes an array of Point objects
   public Polygon(Point[] pointsArray)
   {
      // Set the length of the vertices array
      this.vertices = new Point[pointsArray.length];
      
      // Copy the values of the argument to the vertices array
      // This is just one possible way to do that
      // Loop through the arrays
      for (int i = 1; i < vertices.length; i++)
      {
         // Copy the indexed element from the argument array
         // to the vertices array
         vertices[i] = pointsArray[i];
      }
   }
   
   // Get the circumference (perimeter) of the Polygon
   public double getCircumference()
   {
      double circumference = 0;
      
      // Loop through the array
      // Note: this isn't very robust. All elements need to be sequential,
      // or this will probably break.
      for (int i = 0; i < this.vertices.length; i++)
      {
         // Find the distance from the current index element to the next
         // Add that distance to the circumference
         
         // For the very first element
         if (i == 0)
         {
            // Find distance between that and the last element
            circumference += this.vertices[i].getDistance(this.vertices[this.vertices.length - 1]);
         }
         else
         {
            // Then find the distance between all the other elements and the one that comes before
            circumference += this.vertices[i].getDistance(this.vertices[i-1]);
         }
      }
      
      // Return the final circumference
      return circumference;
   }

}
