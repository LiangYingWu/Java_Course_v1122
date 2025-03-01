import edu.fcps.karel2.Display;

public class Dorothy extends Athlete{
    public Dorothy(){
        super(2, 2, Display.EAST, 0);
    }
    public boolean findPath(){
        move();
        boolean next_to_beeper = nextToABeeper();
        if(!nextToABeeper()){
            turnAround();
            move();
        }
        return next_to_beeper;
    }
    public void followPath(){
        while(true){
            if(frontIsClear()){
                if(!findPath()){
                    turnLeft();
                    if(frontIsClear()){
                        if(!findPath()){
                            if(frontIsClear()){
                                if(!findPath()){
                                    turnLeft();
                                    break;
                                }
                            }
                        }
                    }
                    else{
                        turnAround();
                    }
                }
            }
            else{
                turnLeft();
            }
        }
    }
}
