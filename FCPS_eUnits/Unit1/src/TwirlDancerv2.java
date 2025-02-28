import edu.fcps.karel2.Display;

public class TwirlDancerv2 extends Dancer{
    public TwirlDancerv2(){
        super(1, 1, Display.NORTH, 0);
    }
    public TwirlDancerv2(int x, int y, int dir, int beep){
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
        turnAround();
        move();
        move();
        turnRight();
        move();
        move();
        turnRight();
        move();
        move();
        turnRight();
        move();
        move();
        turnRight();
    }
}
