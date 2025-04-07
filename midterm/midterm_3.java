import edu.fcps.karel2.Display;
import edu.fcps.Digit;

public class midterm_3 {
    public static void main(String[] args){
        
		Display.openWorld("D:/Github/Java_Course_v1122/FCPS_eUnits/Unit1/maps/midterm_3.map");
        Display.setSize(13, 13);
        Display.setSpeed(10);
        Athlete apple = new Athlete(8, 1, Display.WEST, Display.INFINITY);
        start_move(apple);
    }
    public static void start_move(Athlete apple){
        for(int a = 0; a < 10; a++){ 
            while(apple.frontIsClear()){
                apple.putBeeper();
                apple.move();
            }
            apple.putBeeper();
            apple.turnAround();
            if(a % 2 == 0){
                while(!apple.leftIsClear()){
                    apple.move();
                }
                apple.turnLeft();
                apple.move();
                apple.turnLeft();
                while(apple.frontIsClear()){
                    apple.move();
                }
                apple.turnAround();
            }
            else if(a != 9){
                while(!apple.rightIsClear()){
                    apple.move();
                }
                apple.turnRight();
                apple.move();
                apple.turnRight();
                while(apple.frontIsClear()){
                    apple.move();
                }
                apple.turnAround();
            }
        }
        for(int a = 0; a < 10; a++){ 
            while(apple.frontIsClear()){
                apple.pickBeeper();
                apple.move();
            }
            apple.pickBeeper();
            apple.turnAround();
            if(a % 2 == 0){
                while(!apple.rightIsClear()){
                    apple.move();
                }
                apple.turnRight();
                apple.move();
                apple.turnRight();
                while(apple.frontIsClear()){
                    apple.move();
                }
                apple.turnAround();
            }
            else if(a != 9){
                while(!apple.leftIsClear()){
                    apple.move();
                }
                apple.turnLeft();
                apple.move();
                apple.turnLeft();
                while(apple.frontIsClear()){
                    apple.move();
                }
                apple.turnAround();
            }
        }
    }
}
