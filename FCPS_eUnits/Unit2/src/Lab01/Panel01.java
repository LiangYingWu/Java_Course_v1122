import java.awt.*;
import javax.swing.*;

public class Panel01 extends JPanel{
    public void paintComponent(Graphics g){
        g.setColor(Color.gray);
        g.fillRect(0, 0, 400, 400);

        g.setFont(new Font("Serif", Font.ITALIC, 15));
        // g.setColor(new Color(255, 255, 255));
        g.setColor(Color.WHITE);
        g.drawString("Welcome Home", 40, 40);
        g.fillOval(300, 75, 50, 50);

        int[] xPoints = {75, 175, 275};  
        int[] yPoints = {200, 150, 200};
        int nPoints = 3;
        g.setColor(Color.BLACK);
        g.drawPolygon(xPoints, yPoints, nPoints);
        g.drawRect(100, 200, 150, 150);
        g.fillRect(150, 275, 50, 75);

        g.drawLine(0, 350, 400, 350);
    }
}