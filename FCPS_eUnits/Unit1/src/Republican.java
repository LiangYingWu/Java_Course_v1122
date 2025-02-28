public class Republican extends MazeEscaper implements Runnable{
    public void walkDownCurrentSegment(){
        if(!rightIsClear() && frontIsClear()){
            move();
        }
        else if(rightIsClear()){
            turnRight();
            move();
        }
        else{
            turnLeft();
        }
    }
    public void turnToTheNextSegment(){

    }
    public void run(){
        while(!nextToABeeper()){
            walkDownCurrentSegment();
            turnToTheNextSegment();
        }
    }
}
