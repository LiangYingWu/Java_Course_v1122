import edu.fcps.karel2.Display;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Lab10 {
    // public static void followWallsRight(Athlete arg){
    //     while(!arg.nextToABeeper()){
    //         if(arg.rightIsClear()){
    //             arg.turnRight();
    //         }
    //         else if(arg.frontIsClear()){
    //         }
    //         else if(arg.leftIsClear()){
    //             arg.turnLeft();
    //         }
    //         else{
    //             arg.turnAround();
    //         }
    //         arg.move();
    //     }
    // }
    public static void followWallsRight(Athlete arg){
        ArrayList<Integer[]> apple = new ArrayList<>();
        int n = 0;
        boolean end = false;
        boolean goback = false;

        while(!end){
            if(apple.isEmpty()){
                apple.add(new Integer[]{0, 0});
            }
            if(!goback && !(apple.getLast()[0] == 1 && apple.getLast()[1] == 0)){
                if(arg.rightIsClear()){
                    System.out.println("rightIsClear");
                    n++;
                }
                if(arg.frontIsClear()){
                    System.out.println("frontIsClear");
                    n++;
                }
                if(arg.leftIsClear()){
                    System.out.println("leftIsClear");
                    n++;
                }
                if(n > 1){
                    apple.add(new Integer[]{n, 0});
                }
            }
            n = 0;

            if(arg.rightIsClear()){
                arg.turnRight();
            }
            else if(arg.frontIsClear()){
            }
            else if(arg.leftIsClear()){
                arg.turnLeft();
            }
            else{
                goback = true;
                arg.turnAround();
            }

            if(!goback){
                if(!arg.nextToABeeper()){
                    arg.putBeeper();
                }
                arg.move();
                if(arg.nextToABeeper()){
                    if(arg.frontIsClear()){
                        arg.move();
                        if(!arg.nextToABeeper() && arg.frontIsClear() && arg.rightIsClear() && arg.leftIsClear()){
                            end = true;
                            break;
                        }
                        else{
                            arg.turnAround();
                            arg.move();
                            arg.turnAround();
                        }
                    }
                }
                Integer[] apple_last = apple.get(apple.size() - 1);
                apple_last[1] = apple_last[1] + 1;
                apple.set(apple.size() - 1, apple_last);
            }
            else{
                if(apple.getLast()[1] > 0){
                    if(arg.nextToABeeper()){
                        arg.pickBeeper();
                    }
                    arg.move();
                    Integer[] apple_last = apple.get(apple.size() - 1);
                    apple_last[1] = apple_last[1] - 1;
                    apple.set(apple.size() - 1, apple_last);
                }
                if(apple.getLast()[1] <= 0){
                    Integer[] banana = apple.get(apple.size() - 1);
                    banana[0] = banana[0] - 1;
                    apple.set(apple.size() - 1, banana);
                    if(apple.getLast()[0] <= 0){
                        apple.removeLast();
                        goback = true;
                    }
                    else{
                        goback = false;
                    }
                }
            }
            System.out.println("======goback:" + goback + "======");
            for(int a = 0; a < apple.size(); a++){
                System.out.println("======" + "apple: " + apple.get(a)[0] + "," +apple.get(a)[1] + "======");

            }
        }
    }
    // public static void followWallsLeft(Athlete arg){
    //     while(!arg.nextToABeeper()){
    //         if(arg.leftIsClear()){
    //             arg.turnLeft();
    //         }
    //         else if(arg.frontIsClear()){
    //         }
    //         else if(arg.rightIsClear()){
    //             arg.turnRight();
    //         }
    //         else{
    //             arg.turnAround();
    //         }
    //         arg.move();
    //     }
    // }
    public static void followWallsLeft(Athlete arg){
        ArrayList<Integer[]> apple = new ArrayList<>();
        int n = 0;
        boolean end = false;
        boolean goback = false;

        while(!end){
            if(apple.isEmpty()){
                apple.add(new Integer[]{0, 0});
            }
            if(!goback && !(apple.getLast()[0] == 1 && apple.getLast()[1] == 0)){
                if(arg.rightIsClear()){
                    System.out.println("rightIsClear");
                    n++;
                }
                if(arg.frontIsClear()){
                    System.out.println("frontIsClear");
                    n++;
                }
                if(arg.leftIsClear()){
                    System.out.println("leftIsClear");
                    n++;
                }
                if(n > 1){
                    apple.add(new Integer[]{n, 0});
                }
            }
            n = 0;

            if(arg.leftIsClear()){
                arg.turnLeft();
            }
            else if(arg.frontIsClear()){
            }
            else if(arg.rightIsClear()){
                arg.turnRight();
            }
            else{
                goback = true;
                arg.turnAround();
            }

            if(!goback){
                if(!arg.nextToABeeper()){
                    arg.putBeeper();
                }
                arg.move();
                if(arg.nextToABeeper()){
                    if(arg.frontIsClear()){
                        arg.move();
                        if(!arg.nextToABeeper() && arg.frontIsClear() && arg.rightIsClear() && arg.leftIsClear()){
                            end = true;
                            break;
                        }
                        else{
                            arg.turnAround();
                            arg.move();
                            arg.turnAround();
                        }
                    }
                }
                Integer[] apple_last = apple.get(apple.size() - 1);
                apple_last[1] = apple_last[1] + 1;
                apple.set(apple.size() - 1, apple_last);
            }
            else{
                if(apple.getLast()[1] > 0){
                    if(arg.nextToABeeper()){
                        arg.pickBeeper();
                    }
                    arg.move();
                    Integer[] apple_last = apple.get(apple.size() - 1);
                    apple_last[1] = apple_last[1] - 1;
                    apple.set(apple.size() - 1, apple_last);
                }
                if(apple.getLast()[1] <= 0){
                    Integer[] banana = apple.get(apple.size() - 1);
                    banana[0] = banana[0] - 1;
                    apple.set(apple.size() - 1, banana);
                    if(apple.getLast()[0] <= 0){
                        apple.removeLast();
                        goback = true;
                    }
                    else{
                        goback = false;
                    }
                }
            }
            System.out.println("======goback:" + goback + "======");
            for(int a = 0; a < apple.size(); a++){
                System.out.println("======" + "apple: " + apple.get(a)[0] + "," +apple.get(a)[1] + "======");

            }
        }
    }
    public static void main(String[] args){
        String filename = JOptionPane.showInputDialog("What robot world?");
        // Display.openWorld("maps/"+filename+".map");
        Display.openWorld("FCPS_eUnits/Unit1/maps/"+filename+".map");
        Display.setSpeed(10);
        
        Athlete apple = new Athlete(1, 1, Display.EAST, Display.INFINITY);

        if(Math.random() > 0.5){
            followWallsRight(apple);
        }
        else{
            followWallsLeft(apple);
        }
    }
}
