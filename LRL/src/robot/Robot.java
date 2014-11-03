package robot;

public class Robot
{
   // Collects and uses the abstractions made in other Classes 
   private Motion motion;
   private Sensor sensor;
   private Screen screen;
   
   public Robot()
   {
      this.motion = new Motion();
      this.sensor = new Sensor();
   }
}
