import java.awt.*;
import javax.swing.*;

public class Panel02 extends JPanel{
    public void paintComponent(Graphics g){
        g.setColor(Color.BLACK);
        g.fillRect(0, 0, 400, 400);

        for(int x = 0; x < 8; x++){
            for(int y = 0; y < 10; y++){
                g.setColor(Color.GRAY);
                g.fillOval(72 + x * 28, 40 + y * 28, 40, 40);
            }
        }

        // ImageIcon thomas = new ImageIcon("tj.jpg");
        ImageIcon thomas = new ImageIcon("FCPS_eUnits/Unit2/src/Lab02/tj.jpg");
        // g.drawImage(thomas.getImage(), 50, 50, null);
        g.drawImage(thomas.getImage(), 100, 60, 180, 240, null);
        
        g.setFont(new Font("Serif", Font.ITALIC, 20));
        g.setColor(Color.WHITE);
        g.drawString("Our Fearless Leader", 105, 320);

    }
}