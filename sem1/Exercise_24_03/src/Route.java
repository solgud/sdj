
public class Route extends Trip
{
   private Harbor from;
   private Harbor to;
   
   public Route(Harbor from, Harbor to)
   { 
      // Note: call to super() is implicit 
      // because the superclass has no defined constructor
      this.from = from;
      this.to = to;
   }

   @Override
   public Harbor getFrom()
   {
      return this.from;
   }

   @Override
   public Harbor getTo()
   {
      return this.to;
   }

}
