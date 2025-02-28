	//Name______________________________ Date_____________
   import edu.fcps.karel2.Display;
   import edu.fcps.karel2.Robot;
   public class Swimmer extends Robot implements Runnable
   {
      public Swimmer(int x)
      {
         super(x, 1, Display.NORTH, 0);
      }
      public void run() //not swim
      {
         for(int b = 0; b < 10; b++){
            for(int a = 0; a < 8; a++){
               move();
            }
            turnLeft();
            turnLeft();
            for(int a = 0; a < 8; a++){
               move();
            }
            turnLeft();
            turnLeft();
         }
      }
   }