import edu.fcps.karel2.Display;
import edu.fcps.karel2.Robot;

public class Lab05 {
    public static void runTheRace(Racer arg){
        arg.shuttle(2, 7);
        arg.shuttle(4, 5);
        arg.shuttle(6, 3);
        arg.move();
    }
    public static void main(String[] args) {
		Display.openWorld("maps/shuttle.map");
        // Display.openWorld("FCPS_eUnits/Unit1/maps/shuttle.map");
        Racer player1 = new Racer(1);
        Racer player2 = new Racer(4);
        Racer player3 = new Racer(7);
        runTheRace(player1);
        runTheRace(player2);
        runTheRace(player3);
    }
}
