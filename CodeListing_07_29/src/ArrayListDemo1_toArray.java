

public class ArrayListDemo1_toArray
{

   public static void main(String[] args)
   {
      // Create an ArrayList to hold some names
      // ArrayList<String> nameList = new ArrayList<String>();
      String[] nameList = new String[3];

      // Add some names to the ArrayList
      // nameList.add("James");
      // nameList.add("Catherine");
      // nameList.add("Bill");
      nameList[0] = "James";
      nameList[1] = "Catherine";
      nameList[2] = "Bill";
      
      // Display size of the ArrayList
      // System.out.println("The ArrayList has " + nameList.size() + " objects stored in it.");
      System.out.println("The array has " + nameList.length + " objects stored in it.");
      
      // Display the items in nameList
      // for (int index = 0; index < nameList.size(); index++)
      // {
      //    System.out.println(nameList.get(index));
      // }
      for (int i = 0; i < nameList.length; i++)
      {
         System.out.println(nameList[i]);
      }

   }

}
