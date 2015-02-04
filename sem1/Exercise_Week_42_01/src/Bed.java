
public class Bed
{
   // Declare class variables
   private String type;

   // Simple constructor
   public Bed(String type)
   {
      this.type = type;
   }

   // The following methods check for equality
   // against the different things "type" can be set to
   public boolean isSingle()
   {
      return this.type.equals("Single");
   }

   public boolean isDouble()
   {
      return this.type.equals("Double");
   }

   public boolean isKingSize()
   {
      return this.type.equals("King size");
   }
}
