import edu.fcps.karel2.Display;
import javax.swing.JOptionPane;

public class Lab10 {
    public static void followWallsRight(Athlete arg){
        while(!arg.nextToABeeper()){
            if(arg.rightIsClear()){
                arg.turnRight();
            }
            else if(arg.frontIsClear()){
            }
            else if(arg.leftIsClear()){
                arg.turnLeft();
            }
            else{
                arg.turnAround();
            }
            arg.move();
        }
    }
    public static void main(String[] args){
        String filename = JOptionPane.showInputDialog("What robot world?");
        Display.openWorld("maps/"+filename+".map");
        // Display.openWorld("FCPS_eUnits/Unit1/maps/"+filename+".map");
        Display.setSpeed(10);
        
        Athlete apple = new Athlete(1, 1, Display.EAST, Display.INFINITY);

        followWallsRight(apple);
    }
}
