public class Name
{
   // Declare fields
   private String firstName;
   private String lastName;
   
   // Make a two-argument constructor
   // to initialize both fields
   public Name(String firstName, String lastName)
   {
      this.firstName = firstName;
      this.lastName = lastName;
   }
   
   // Make a one-argument constructor
   // that takes a full name (i.e. one string)
   // and parses that into a first and last name
   public Name(String fullName)
   {
      int divider = fullName.indexOf(" ");
      // First name is everything from the beginning until the space
      this.firstName = fullName.substring(0, divider);
      // Last name is everything from the space to the end
      this.lastName = fullName.substring(divider+1, fullName.length());
   }
   
   // Basic getter methods
   public String getFirstName()
   {
      return this.firstName;
   }

   public String getLastName()
   {
      return this.lastName;
   }

   // Return the full name
   // which is first + last
   public String getFullName()
   {
      return this.firstName + " " + this.lastName;
   }

   // Return the formal name
   // Which is last, first
   public String getFormalName()
   {
      return this.lastName + ", " + this.firstName;
   }

}