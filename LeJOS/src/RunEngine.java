import lejos.nxt.MotorPort;

public class RunEngine
{

   public static void main(String[] args) throws InterruptedException
   {
      int counter = 3;
      
      // Forward
      MotorPort.A.controlMotor(100, 1);
      MotorPort.B.controlMotor(100, 1);
      Thread.sleep(2000);
      
      // Loop
      while (counter > 0) {
         // Turn
         MotorPort.A.controlMotor(100, 3);
         MotorPort.C.controlMotor(90, 1);
         Thread.sleep(500);
         
         // Forward
         MotorPort.C.controlMotor(100, 3);
         MotorPort.A.controlMotor(100, 1);
         Thread.sleep(2000);
         
         // Decrement counter
         counter--;
      }
   }
}
