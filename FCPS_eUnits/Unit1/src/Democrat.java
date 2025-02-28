public class Democrat extends MazeEscaper implements Runnable{
    public void walkDownCurrentSegment(){
        if(!leftIsClear() && frontIsClear()){
            move();
        }
        else if(leftIsClear()){
            turnLeft();
            move();
        }
        else{
            turnRight();
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
