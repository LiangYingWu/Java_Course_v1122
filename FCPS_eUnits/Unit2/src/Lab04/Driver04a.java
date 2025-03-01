import edu.fcps.Bucket;
import javax.swing.*;

public class Driver04a{
    public static void main(String[] args){
        JFrame frame = new JFrame("Buckets");
        frame.setSize(600, 400);
        frame.setLocation(100, 100);   
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setContentPane(new BucketPanel());
        frame.setVisible(true);
        Bucket.setSpeed(5);
        Bucket.useTotal(true);

        Bucket b1 = new Bucket(5);
        Bucket b2 = new Bucket(3);

        // b1.fill();
        // b1.pourInto(b2);
        // b2.spill();
        // b1.pourInto(b2);
        // b1.fill();
        // b1.pourInto(b2);
        // b2.spill();

        // 1 ~ 8
        b1.fill(); // 5
        b1.pourInto(b2);
        b2.spill(); // 2
        b1.pourInto(b2);
        b1.fill(); // 7
        b1.pourInto(b2);
        b2.spill(); // 4
        b1.pourInto(b2);
        b2.spill(); // 1
        b1.spill();
        b2.fill(); // 3
        b2.pourInto(b1);
        b2.fill(); // 6
        b1.fill();
    }
}
