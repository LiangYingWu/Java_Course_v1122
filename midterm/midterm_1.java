import edu.fcps.karel2.Display;
import edu.fcps.Digit;

public class midterm_1 {
    public static void main(String[] args){
        Display.setSize(40, 40);
        Display.setSpeed(10);
        Thread t1 = new Thread(new E(31, 20));
        Thread t2 = new Thread(new E(24, 20));
        Thread t3 = new Thread(new C(17, 20));
        Thread t4 = new Thread(new S(10, 20));
        Thread t5 = new Thread(new Dash(24, 9));
        Thread t6 = new Thread(new One(17, 9));
        Thread t7 = new Thread(new Zero(10, 9));
        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();
        t6.start();
        t7.start();
    }
}
