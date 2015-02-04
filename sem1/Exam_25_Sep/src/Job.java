
public class Job
{
   private String title;
   private String employee;
   private double salary;
   
   public Job(String title, String employee, double salary)
   {
      this.title = title;
      this.employee = employee;
      this.salary = salary;
   }
   
   public Job(String title, double salary)
   {
      this.title = title;
      this.salary = salary;
      this.employee = null;
   }
   
   public String getEmployee()
   {
      return this.employee;
   }
   
   // The class diagram shows this returning a String
   // but I think that's a mistake...
   public double getSalary()
   {
      return this.salary;
   }
   
   public String toString()
   {
      if (this.employee != null)
      {
         return "Job Title: " + this.title +
                 ", Employee: " + this.employee +
                 ", Salary: " + this.salary;
      }

      return "Job Title: " + this.title + ", Salary: " + this.salary;
   }
   
   public boolean isAvailable()
   {
      // So, I did this in an amateurish way
      // The elegant solution is:
      // return this.employee == null;
      if (this.employee == null)
      {
         return true;
      }

      return false;
   }
   
   public void hireEmployee(String employee)
   {
      if (isAvailable())
      {
         this.employee = employee;
      }
   }

   // I could do things like check to see if the job is even filled
   // but this is simple enough.
   public void fireEmployee()
   {
      this.employee = null;
   }
}
