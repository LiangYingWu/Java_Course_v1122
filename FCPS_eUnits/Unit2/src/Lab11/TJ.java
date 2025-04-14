import java.awt.*;
import javax.swing.ImageIcon;

public class TJ extends Ball{
    private double dx;
    private double dy;

    public TJ() {
       super(200, 200, 50, Color.BLACK);
       dx = Math.random() * 12 - 6;          // to move vertically
       dy = Math.random() * 12 - 6;          // to move sideways
    }
     public TJ(double x, double y, double dia, Color c) {
       super(x, y, dia, c);
       dx = Math.random()* 12 - 6;
       dy = Math.random() * 12 - 6;
    }

    public void draw(Graphics myBuffer) {
        ImageIcon thomas = new ImageIcon("FCPS_eUnits/Unit2/src/Lab02/tj.jpg");
        myBuffer.drawImage(thomas.getImage(), (int)getX(), (int)getY(), (int)getDiameter(), (int)(getDiameter() * 4 / 3), null);
    }
}
