import edu.fcps.karel2.Display;
import edu.fcps.karel2.Robot;

public class Lab04 {
    public static void takeTheField(Athlete arg) {
        arg.move();
        arg.move();
        arg.move();
        arg.move();
        arg.turnRight();
        arg.move();
        arg.move();
    }

    public static void main(String[] args) {
        Display.openWorld("maps/arena.map");
		// Display.openWorld("FCPS_eUnits/Unit1/maps/arena.map");
        Athlete player1 = new Athlete();
        Athlete player2 = new Athlete();
        Athlete player3 = new Athlete();
        Athlete player4 = new Athlete();
        Athlete player5 = new Athlete();
        Athlete player6 = new Athlete();
        Athlete coach = new Athlete();
        takeTheField(player1);
        player1.move();
        player1.move();
        player1.move();
        player1.turnLeft();
        player1.move();
        player1.move();
        player1.turnAround();

        takeTheField(player2);
        player2.move();
        player2.move();
        player2.move();
        player2.move();
        player2.move();
        player2.turnLeft();
        player2.move();
        player2.turnAround();

        takeTheField(player3);
        player3.move();
        player3.move();
        player3.move();
        player3.move();
        player3.turnRight();

        takeTheField(player4);
        player4.move();
        player4.move();
        player4.move();
        player4.turnRight();

        takeTheField(player5);
        player5.move();
        player5.move();
        player5.turnRight();

        takeTheField(player6);
        player6.move();
        player6.turnLeft();
        player6.move();
        player6.turnAround();

        coach.move();
        coach.move();
        coach.move();
        coach.move();
        coach.move();
        coach.move();
        coach.turnRight();
        coach.move();
    }
}
