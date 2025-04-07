import edu.fcps.Digit;

public class S extends Digit implements Runnable{
    public S(int x, int y) {
        super(x, y);
    }

    @Override
    public void display() {
        segment1_On();
        segment2_On();
        segment3_Off();
        segment4_On();
        segment5_On();
        segment6_Off();
        segment7_On();
    }
    
    public void run() {
        display();
    }
}
