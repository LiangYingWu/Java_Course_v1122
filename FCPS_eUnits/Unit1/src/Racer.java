import edu.fcps.karel2.Display;
import edu.fcps.karel2.Robot;

public class Racer extends Athlete{
    public Racer(int y){
        super(1, y, Display.EAST, Display.INFINITY);
    }
    public void jumpRight(){
        turnLeft();
        move();
        turnRight();
        move();
        turnRight();
        move();
        turnLeft();
    }
    public void jumpLeft(){
        turnRight();
        move();
        turnLeft();
        move();
        turnLeft();
        move();
        turnRight();
    }
    public void sprint(int a){
        for(int b = 0; b < a; b++){
            move();
        }
    }
    public void pick(int a){
        for(int b = 0; b < a; b++){
            pickBeeper();
        }
    }
    public void put(int a){
        for(int b = 0; b < a; b++){
            putBeeper();
        }
    }
    public void shuttle(int spaces, int beepers){
        move();
        jumpRight();
        sprint(spaces);
        pick(beepers);
        turnAround();
        sprint(spaces);
        jumpLeft();
        move();
        put(beepers);
        turnAround();
    }
}
