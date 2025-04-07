import edu.fcps.Digit;
import edu.fcps.karel2.Display;

public class Walker extends Athlete implements Runnable{
    public Walker(){
        super(1, 1, Display.NORTH, Display.INFINITY);
    }
    public Walker(int x, int y, int dir, int beep){
        super(x, y, dir, beep);
    }
    public void run() {
        for(int a = 0; a < 4; a++){
            for(int b = 0; b < 4; b++){
                move();
            }
            turnRight();
        }
    }
}
