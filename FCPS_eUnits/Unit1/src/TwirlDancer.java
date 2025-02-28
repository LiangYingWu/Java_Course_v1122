import edu.fcps.karel2.Display;

public class TwirlDancer extends Dancer{
    public TwirlDancer(){
        super(1, 1, Display.NORTH, 0);
    }
    public TwirlDancer(int x, int y, int dir, int beep){
        super(x, y, dir, beep);
    }
    public void danceStep(){
        move();
        move();
        turnLeft();
        move();
        move();
        turnLeft();
        move();
        move();
        turnLeft();
        move();
        move();
        turnLeft();
    }
}
