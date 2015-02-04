
public class PolygonTest
{

   public static void main(String[] args)
   {
      int[] xs = {1,1,5,5};
      int[] ys = {2,6,6,2};
      
      Polygon square = new Polygon(xs, ys);
      System.out.println(square.getCircumference());

   }

}
