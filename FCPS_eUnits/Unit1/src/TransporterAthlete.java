import edu.fcps.karel2.Display;
import java.util.ArrayList;
import java.util.List;

public class TransporterAthlete extends Athlete{
    public TransporterAthlete(){
        super(1, 1, Display.NORTH, Display.INFINITY);
    }
    public TransporterAthlete(int x, int y, int dir, int beep){
        super(x, y, dir, beep);
    }
    public void transportBeeper(){
        int[] beeper_num = new int[4];
        int column_num = 0;
        for(int a = 0; a < 4; a++){
            if(nextToABeeper()){
                column_num++;
                pickBeeper();
                beeper_num[a]++;
                turnLeft();
                move();
                while(nextToABeeper()){
                    pickBeeper();
                    move();
                    beeper_num[a]++;
                }
                turnAround();
                for(int b = 0; b < beeper_num[a]; b++){
                    move();
                }
                turnLeft();
                move();
            }
            else{
                break;
            }
        }
        if(column_num > 0){
            turnAround();
        }
        for(int a = 0; a < column_num; a++){
            move();
        }
        if(column_num > 0){
            turnRight();
        }
        for(int a = 0; a < column_num - 1; a++){
            move();
        }
        if(column_num > 0){
            turnRight();
        }
        for(int a = 0; a < column_num; a++){
            for(int b = 0; b < beeper_num[a]; b++){
                putBeeper();
                move();
            }
            turnAround();
            for(int b = 0; b < beeper_num[a]; b++){
                move();
            }
            turnLeft();
            if(frontIsClear()){
                move();
            }
            turnLeft();
        }
    }
}
