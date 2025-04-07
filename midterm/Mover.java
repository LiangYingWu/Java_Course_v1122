import edu.fcps.Digit;
import edu.fcps.karel2.Display;

public class Mover extends Athlete implements Runnable{
    public Mover(){
        super(1, 1, Display.NORTH, Display.INFINITY);
    }
    public Mover(int x, int y, int dir, int beep){
        super(x, y, dir, beep);
    }
    public void run() {
        for(int b = 0; b < 2; b++){
            for(int a = 0; a < 6; a++){ 
                move();
            }
            for(int a = 0; a < 6; a++){
                while(nextToABeeper()){
                    pickBeeper();
                }
                move();
                while(hasBeepers()){
                    putBeeper();
                }
                turnAround();
                move();
                move();
                turnAround();
            }
            if(b == 1){
                break;
            }
            turnLeft();
            move();
            turnRight();
        }
    }
}
