
public class CircleTest
{

   public static void main(String[] args)
   {
      // Test the Circle and Point classes
      
      // Make a new Point object, center
      Point center = new Point(100, 100);
      
      // Make two new Circle objects
      Circle smallCircle = new Circle(center, 50);
      Circle bigCircle = new Circle(center, 200);
      
      // Move the center to new coordinate
      smallCircle.moveTo(200, -50);
      
      System.out.println(smallCircle);
      System.out.println(bigCircle);

   }

}
