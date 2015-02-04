public class LengthWidthDemo
{
   public static void main(String[] args)
   {
      Rectangle box = new Rectangle();
      
      box.setLength(10.0);
      box.setWidth(20.0);
      
      System.out.println("The length of the box is: " + box.getLength());
      System.out.println("The width of the box is: " + box.getWidth());

   }
}