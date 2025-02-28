import edu.fcps.karel2.Display;

public class BackAndForthDancer extends Dancer{
    public BackAndForthDancer(){
        super(1, 1, Display.NORTH, 0);
    }
    public BackAndForthDancer(int x, int y, int dir, int beep){
        super(x, y, dir, beep);
    }
    public void danceStep(){
        move();
        turnAround();
        move();
        move();
        turnAround();
        move();
    }
}