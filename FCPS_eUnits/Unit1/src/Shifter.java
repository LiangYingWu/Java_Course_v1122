	//Name______________________________ Date_____________
   import edu.fcps.karel2.Display;
   import edu.fcps.karel2.Robot;
import javax.sound.midi.MetaEventListener;
   public class Shifter extends Robot implements Runnable, Workable
   {
      private int myBeepers;
      public Shifter(int y)
      {
         super(1, y, Display.EAST, 0);
      
      }
   	public void run(){
         for(int a = 0; a < 5; a++){
            move();
         }
         for(int a = 0; a < 6; a++){
            workCorner();
         }
      }
      public void workCorner(){
         myBeepers = 0;
         while(nextToABeeper()){
            pickBeeper();
            myBeepers++;
         }
         moveOneBlock();
         for(int a = 0; a < myBeepers; a++){
            putBeeper();
         }
         turnLeft();
         turnLeft();
         moveOneBlock();
         if(frontIsClear()){
            moveOneBlock();
            turnLeft();
            turnLeft();
         }
      }
      public void moveOneBlock(){
         move();
      }
      public void turnToTheRight(){
         turnLeft();
         turnLeft();
         turnLeft();
      }
      public void turnToTheNorth(){
         while(!facingNorth()){
            turnLeft();
         }
      }
   }