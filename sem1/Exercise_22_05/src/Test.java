
public class Test
{

   public static void main(String[] args)
   {
      // Test Vehicle and its derived classes
      
      Car car1 = new Car("Alice", 20000, "A113");
      Car car2 = new Car("Bob", 15000, "A113");
      Car car3 = new Car("Alice", 20000, "A113");
      
      System.out.println(car1.equals(car2));
      System.out.println(car1.equals(car3));

   }

}
