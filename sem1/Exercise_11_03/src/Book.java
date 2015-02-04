
public class Book
{
   // Declare fields
   private String author;
   private String title;
   private double price;
   private int pages;
   
   // Constructor method
   public Book(String author, String title, double price, int pages)
   {
      // Set the fields to the arguments
      // Remember that you can reference fields in the class
      // using this.
      this.author = author;
      this.title = title;
      this.price = price;
      this.pages = pages;
   }
   
   // Getter methods
   public String getAuthor()
   {
      return this.author;
   }

   public String getTitle()
   {
      return this.title;
   }

   public double getPrice()
   {
      return this.price;
   }

   public int getPages()
   {
      return this.pages;
   }

   // Allow setting of price
   // after object is created
   public void setPrice(double price)
   {
      this.price = price;
   }
   
   // Returns all the fields at once
   public String toString()
   {
      return "Author: " + this.author + ", " +
             "Title: " + this.title + ", " +
             "Pages: " + this.pages + ", " +
             "Price: $" + this.price;
   }
}
