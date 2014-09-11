import lejos.nxt.MotorPort;
import lejos.nxt.SensorPort;
import lejos.nxt.SoundSensor;


public class ShutUp
{

   public static void main(String[] args) throws InterruptedException
   {
      SoundSensor sound = new SoundSensor(SensorPort.S1);
      boolean stop = false;
      
      while (!stop)
      {
         MotorPort.A.controlMotor(100, 1);
         MotorPort.B.controlMotor(96, 1);

         if (sound.readValue() > 55)
            stop = true;
         
         Thread.sleep(100);
      }
      
   }

}
