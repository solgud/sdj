
public class Employee extends Person
{
   // Declare instance variables
   private double salary;
   
   // Three-argument Constructor
   public Employee(String name, int age, double salary)
   {
      // Call the superclass constructor
      super(name, age);

      // Set the remaining instance variables
      this.salary = salary;
   }
   
   // Two-argument Constructor
   public Employee(String name, double salary)
   {
      // Call the superclass constructor
      super(name);
      
      // Set the remaining instance variables
      this.salary = salary;
   }

   // Getters and Setters for salary
   public double getSalary()
   {
      return this.salary;
   }

   public void setSalary(double salary)
   {
      this.salary = salary;
   }
   
   // Return a String representation
   @Override
   public String toString()
   {
      return super.toString() 
            + ", Salary = " + this.salary;
   }
   
   // Check for equality against another Object
   @Override
   public boolean equals(Object employee)
   {
      // Check if employee argument is an Employee instance
      if (employee instanceof Employee)
      {
         // Cast a copy of it as an Employee
         Employee otherEmployee = (Employee) employee;
         // Then check if the fields match
         return this.getName().equals(otherEmployee.getName())
               && this.getAge() == otherEmployee.getAge()
               && this.salary == otherEmployee.salary;
      }
      // In any other case, return false
      return false;
   }
   
   


}
