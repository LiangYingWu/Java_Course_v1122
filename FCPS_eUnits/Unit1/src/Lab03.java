import edu.fcps.karel2.Display;
import edu.fcps.karel2.Robot;

public class Lab03 {
    public static void main(String[] args) {
        Display.openWorld("maps/mountain.map");
		// Display.openWorld("FCPS_eUnits/Unit1/maps/mountain.map");
        Climber climber1 = new Climber(8);
        Climber climber2 = new Climber(8);
        climber1.putBeeper();
        climber1.turnRight();
        climber1.move();
        climber1.climbUpRight();
        climber1.climbUpRight();
        climber1.climbUpRight();
        climber1.climbDownRight();
        climber1.climbDownRight();
        climber1.pickBeeper();
        climber1.turnAround();
        climber1.climbUpLeft();
        climber1.climbUpLeft();
        climber1.climbDownLeft();
        climber1.climbDownLeft();
        climber1.climbDownLeft();
        climber1.move();
        climber1.turnRight();
        climber1.putBeeper();
    }
}
