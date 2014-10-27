
public class Car extends Vehicle
{
   // Declare instance variables
   private String regNo;

   // Constructor
   public Car(String owner, double thePrice, String regNo)
   {
      // Call the superclass constructor
      super(owner, thePrice);
      // Then set the remaining variables
      this.regNo = regNo;
   }

   // Getter and Setter for regNo
   public String getRegNo()
   {
      return regNo;
   }

   public void setRegNo(String registrationNumber)
   {
      this.regNo = registrationNumber;
   }
   
   // Return a String representation
   @Override
   public String toString()
   {
      return super.toString() + ", "
            + "Registration Number = " + this.regNo;
   }
   
   // Check for equality against another Object
   @Override
   public boolean equals(Object arg)
   {
      // Check to see if arg is a Car
      if (arg instanceof Car)
      {
         // Cast it to a Car
         Car car = (Car) arg;
         // Then check fields for equality
         return super.equals(car) 
               && this.regNo == car.regNo;
      }
      // In any other case, return false
      return false;
   }
   
   

}
