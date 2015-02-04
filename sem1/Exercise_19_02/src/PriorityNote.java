
public class PriorityNote
{
   // Declare class variables
   private String note;
   private boolean highPriority;
   
   // Constructor
   public PriorityNote(String note)
   {
      this.note = note;
      // I guess we could leave high priority alone...
      // But I think it's reasonable to assume false
      // unless set to be true
      this.highPriority = false;
   }
   
   // Getter and setter
   public String getNote()
   {
      return this.note;
   }
   
   public void setNote(String note)
   {
      this.note = note;
   }
   
   // Check if high priority
   public boolean isHighPriorityNote()
   {
      return this.highPriority;
   }
   
   // Set to low/high priority
   public void setHighPriority()
   {
      this.highPriority = true;
   }
   public void setLowPriority()
   {
      this.highPriority = false;
   }
   
   // Return a copy
   public PriorityNote copy()
   {
      return new PriorityNote(this.note);
   }
   
   // Return a string representation
   public String toString()
   {
      if(this.highPriority)
      {
         return this.note + ", high priority";
      }
      return this.note;
   }
   
}
