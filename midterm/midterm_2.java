import edu.fcps.karel2.Display;
import edu.fcps.Digit;

public class midterm_2 {
    public static void main(String[] args){
        
		Display.openWorld("D:/Github/Java_Course_v1122/FCPS_eUnits/Unit1/maps/midterm_2.map");
        Display.setSize(13, 13);
        Display.setSpeed(10);
        Thread t1 = new Thread(new Mover(1, 1, Display.EAST, 0));
        Thread t2 = new Thread(new Walker(8, 8, Display.EAST, 0));
        t1.start();
        t2.start();
    }
}
