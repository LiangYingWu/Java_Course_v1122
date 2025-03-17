import edu.fcps.karel2.Display;
import edu.fcps.Digit;

public class Lab11 {
    public static void main(String[] args){
        Display.setSize(54, 48);
        Display.setSpeed(10);
        // Digit first = new One(1, 9);
        // Digit second = new One(7, 9);
        // Digit third = new One(13, 9);
        // Digit fourth = new Zero(19, 9);
        // Digit fifth = new Seven(25, 9);
        // Digit sixth = new One(31, 9);
        // Digit seventh = new One(37, 9);
        // Digit eighth = new Zero(43, 9);
        // first.display();
        // second.display();
        // third.display();
        // fourth.display();
        // fifth.display();
        // sixth.display();
        // seventh.display();
        // eighth.display();
        new One(1, 9).display();
        new One(7, 9).display();
        new One(13, 9).display();
        new Zero(19, 9).display();
        new Seven(25, 9).display();
        new One(31, 9).display();
        new One(37, 9).display();
        new Zero(43, 9).display();
    }
}
