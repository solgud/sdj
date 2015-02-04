
public class JobTest
{

   public static void main(String[] args)
   {
      // Test the Job class
      
      Job[] jobArray = new Job[3];
      
      // Only three jobs, so I'll do them manually
      jobArray[0] = new Job("Regional Manager", "Michael Scott", 30000);
      jobArray[1] = new Job("Assistant Regional Manager", 35000);
      jobArray[2] = new Job("Secretary", 25000);
      
      // Hire an employee
      jobArray[2].hireEmployee("Pam Beesley");
      
      // If the job is available, print that it is
      // if not, print the employee
      for(int i = 0; i < jobArray.length; i++)
      {
         if (jobArray[i].isAvailable())
         {
            System.out.println("The job is available");
         }
         else
         {
            System.out.println("The job is currently held by: " + jobArray[i].getEmployee());
         }
      }
      
      // Another loop
      // Prints objects using toString()
      // I keep wanting to write var i = 0; ... 
      // I guess I wish this was JavaScript :p
      for(int i = 0; i < jobArray.length; i++)
      {
         System.out.println(jobArray[i].toString());
      }
      
      // Find the average salary of all jobs with an employee
      // Is Java one of those languages where you're encouraged to declare
      // variables right before you use them, or all at once 
      // at the beginning of the program?
      double avg = 0;
      double count = 0;
      for(int i = 0; i < jobArray.length; i++)
      {
         if (!jobArray[i].isAvailable())
         {
            avg += jobArray[i].getSalary();
            count++;
         }
      }
      System.out.println("Average salary of held positions: " + (avg / count));

   }

}
