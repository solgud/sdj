
public class RoundTrip extends Trip
{
   private Harbor harbor;
   
   public RoundTrip(Harbor harbor)
   {
      // Note: call to super() is implicit
      // because the superclass has no defined constructor
      
      this.harbor = harbor;
   }

   @Override
   public Harbor getFrom()
   {
      return this.harbor;
   }

   @Override
   public Harbor getTo()
   {
      return this.harbor;
   }

}
