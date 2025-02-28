import edu.fcps.karel2.Robot;
import edu.fcps.karel2.Display;
import java.awt.Robot;
import javax.swing.JOptionPane;

public class Lab09 {
    public static void main(String[] args){
        String filename = JOptionPane.showInputDialog("What robot world?");
        Display.openWorld("maps/"+filename+".map");
        // Display.openWorld("FCPS_eUnits/Unit1/maps/"+filename+".map");

        Robot apple = new Robot(1, 1, Display.EAST, 0);
        
        for(int a = 0; a < 6; a++){
            apple.move();
        }

        for(int a = 0; a < 7; a++){
        // while(true){
            int beeper_num = 0;
            while(apple.nextToABeeper()){
                apple.pickBeeper();
                beeper_num = beeper_num + 1;
            }
            if(beeper_num > 0){
                apple.move();
                for(int b = 0; b < beeper_num; b++){
                    apple.putBeeper();
                }
                apple.turnLeft();
                apple.turnLeft();
                apple.move();
            }
            else{
                apple.turnLeft();
                apple.turnLeft();
            }
            if(!apple.frontIsClear()){
                break;
            }
            apple.move();
            apple.turnLeft();
            apple.turnLeft();
        }
    }
}
