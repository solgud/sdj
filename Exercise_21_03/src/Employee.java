
public class Employee extends Person
{
   // Declare instance variables
   private double salary;

   // Three-argument Constructor
   public Employee(String name, int age, double salary)
   {
      // Call the superclass's constructor first
      super(name, age);
      // Then set the instance variables
      this.salary = salary;
   }

   // Two-argument Constructor
   public Employee(String name, double salary)
   {
      // Call the superclass's constructor first
      super(name);
      // Then set the instance variables
      this.salary = salary;
   }
   
   // Getter and Setter for salary
   public double getSalary()
   {
      return this.salary;
   }
   
   public void setSalary(double salary)
   {
      this.salary = salary;
   }

   // Return a String representation
   public String toString()
   {
      return this.getName() + ", " + this.getAge() + ", " + this.getSalary();
   }
   
   // Check for equality against another Employee
   public boolean equals(Employee employee)
   {
      return this.getName().equals(employee.getName())
            && this.getAge() == employee.getAge()
            && this.getSalary() == employee.getSalary();
   }


}
