import java.util.ArrayList;

public class Notebook
{
   // Declare class variable
   // This is compositional
   private ArrayList<PriorityNote> notes;
   
   // Constructor
   public Notebook(int capacity)
   {
      // Make a new ArrayList of PriorityNotes
      // With the capacity passed in the constructor
      this.notes = new ArrayList<PriorityNote>(capacity);
   }
   
   // Return the number of notes
   public int getSize()
   {
      return this.notes.size();
   }
   
   // Add a note (object)
   public void addNote(PriorityNote note)
   {
      // Add a copy, this is compositional
      this.notes.add(note.copy());
   }
   
   // Add a note (String)
   public void addNote(String note)
   {
      // Add a new PriorityNote object
      this.notes.add(new PriorityNote(note));
   }
   
   // Add a high priority note
   public void addHighPriorityNote(String note)
   {
      // Make a new PriorityNote object
      PriorityNote newNote = new PriorityNote(note);
      // Set the new note to high priority
      newNote.setHighPriority();
      // Then add it to the ArrayList
      this.notes.add(newNote);
   }
   
   // Get a note by index
   public String getNote(int index)
   {
      return this.notes.get(index).getNote();
   }
   
   // See if note at index is high priority
   public boolean isHighPriorityNote(int index)
   {
      return this.notes.get(index).isHighPriorityNote();
   }
   
   // Get the index of the most important note
   // My assumption is that this is the first important note
   public int indexOfMostImportantNote()
   {
      // Loop through the array
      for (int i = 0; i < this.notes.size(); i++)
      {
         // If the note at the current index is high priority
         if (this.notes.get(i).isHighPriorityNote())
         {
            // Return the index
            return i;
         }
      }
      // If none are important, return the first note
      // That's important, right?
      return 0;
   }
   
   // Actually get that most important note
   // using its index
   public String getMostImportantNote()
   {
      return this.notes.get(this.indexOfMostImportantNote()).getNote();
   }
   
   // Remove a note by its index
   public void removeNote(int index)
   {
      this.notes.remove(index);
   }
   
   // Return a String representation
   public String toString()
   {
      // Start with an empty String
      String str = "";
      
      // Loop through the ArrayList
      for (int i = 0; i < this.notes.size(); i++)
      {
         // Add to the collector string
         // the toString() value of the note
         // at the current index
         str += this.notes.get(i).toString();
      }
      // Return the collector string
      return str;
   }


}
