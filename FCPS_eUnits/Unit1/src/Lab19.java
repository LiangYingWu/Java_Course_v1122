import edu.fcps.karel2.Display;
import javax.swing.JOptionPane;

public class Lab19 {
    public static void main(String[] args){
        String filename = JOptionPane.showInputDialog("What robot world?");
        Display.openWorld("maps/"+filename+".map");
        // Display.openWorld("FCPS_eUnits/Unit1/maps/"+filename+".map");
        Display.setSpeed(10);

        Dorothy apple = new Dorothy();
        apple.followPath();
    }
}
