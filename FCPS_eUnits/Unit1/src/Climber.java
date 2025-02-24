import edu.fcps.karel2.Display;
import edu.fcps.karel2.Robot;

public class Climber extends Athlete {
    public Climber(){
        super();
    }
    public Climber(int x){
        super(x, 1, Display.NORTH, 1);
    }
    public void moveRight(){
        turnRight();
        move();
        turnLeft();
    }
    public void moveLeft(){
        turnLeft();
        move();
        turnRight();
    }
    public void climbUpRight(){
        move();
        move();
        turnRight();
        move();
        turnLeft();
    }
    public void climbDownRight(){
        turnRight();
        move();
        turnRight();
        move();
        move();
        turnAround();
    }
    public void climbUpLeft(){
        move();
        move();
        turnLeft();
        move();
        turnRight();
    }
    public void climbDownLeft(){
        turnLeft();
        move();
        turnLeft();
        move();
        move();
        turnAround();
    }
}
