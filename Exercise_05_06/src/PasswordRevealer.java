import java.util.Scanner;

public class PasswordRevealer
{

   public static void main(String[] args)
   {
      Scanner key = new Scanner(System.in);
      String username, password, passwordConfirmation;
      
      // Init password and passwordConfirmation to junk values
      passwordConfirmation = "";
      password = " ";

      System.out.println("Give me a username!");
      username = key.nextLine();

      while (!password.equals(passwordConfirmation))
      {
         System.out.println("\nPassword and confirmation need to match!\n");

         System.out.println("Give me a new password!");
         password = key.nextLine();

         System.out.println("Confirm that password!");
         passwordConfirmation = key.nextLine();
      }

      System.out.println("\nUsername: " + username);
      System.out.println("Password: " + password);

   }

}
