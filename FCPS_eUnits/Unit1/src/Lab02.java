import edu.fcps.karel2.Display;
import edu.fcps.karel2.Robot;

public class Lab02 {
    
    public static void main(String[] args) {
        Display.openWorld("maps/maze.map");
		// Display.openWorld("FCPS_eUnits/Unit1/maps/maze.map");
        Athlete Robot = new Athlete();
        Robot.putAndMove(0);
        Robot.putAndMove(1);
        Robot.putAndMove(1);
        Robot.putAndMove(2);
        Robot.putAndMove(2);
        Robot.putAndMove(1);
        Robot.putAndMove(0);
        Robot.putAndMove(1);
        Robot.putAndMove(2);
        Robot.putAndMove(2);
        Robot.putAndMove(0);
        Robot.putAndMove(0);
        Robot.putAndMove(0);
        Robot.putAndMove(1);
        Robot.putAndMove(0);
    }
}
