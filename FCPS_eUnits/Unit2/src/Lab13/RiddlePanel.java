import java.awt.*;
import java.awt.event.*;
import java.awt.image.*;
import javax.swing.*;

public class RiddlePanel extends JPanel{
    private static final ImageIcon thomas = new ImageIcon("FCPS_eUnits/Unit2/src/Lab02/tj.jpg");
    private BufferedImage myImage;
    private Graphics2D myBuffer;
    private Timer t1, t2;
    private int xPos, yPos;
    private double t;
    private boolean answerShowed;
    public RiddlePanel(){
        xPos = 30;
        yPos = 250;
        t = 0;
        answerShowed = false;
        myImage =  new BufferedImage(640, 480, BufferedImage.TYPE_INT_RGB);
        myBuffer = (Graphics2D)myImage.getGraphics();
        myBuffer.setColor(Color.CYAN);
        myBuffer.fillRect(0, 0, 640, 480);
        t1 = new Timer(10, new Listener1());
        t2 = new Timer(1000, new Listener2());
        t1.start();

    }
    public void paintComponent(Graphics g){
        g.drawImage(myImage, 0, 0, getWidth(), getHeight(), null);
    }
    private class Listener1 implements ActionListener{
        public void actionPerformed(ActionEvent e){
            myBuffer.setColor(Color.CYAN);
            myBuffer.fillRect(0, 0, 1280, 960);

            myBuffer.setColor(Color.BLACK);
            myBuffer.setStroke(new BasicStroke(10.0f));
            myBuffer.drawLine(xPos + 30, yPos + 80, xPos + 30, yPos + 100);
            myBuffer.drawLine(xPos + 30, yPos + 100, xPos + 10, yPos + 120);
            myBuffer.drawLine(xPos + 30, yPos + 100, xPos + 50, yPos + 120);
            myBuffer.drawLine(xPos + 15, yPos + 80, xPos + 5, yPos + 90);
            myBuffer.drawLine(xPos + 45, yPos + 80, xPos + 55, yPos + 90);


            myBuffer.setColor(Color.RED);
            myBuffer.setFont(new Font("Serif", Font.BOLD, 20)); 
            myBuffer.drawString("Do you know why people with higher education", 200, 100);
            myBuffer.drawString("have higher body temperature?", 200, 120);

            if(answerShowed){
                myBuffer.setColor(Color.RED);
                myBuffer.setFont(new Font("Serif", Font.BOLD, 20)); 
                myBuffer.drawString("Because they have Higher degrees.", 200, 300);
            }
            else{
                t = t + 0.2;
                xPos = xPos + 1; 
                yPos = (int)(Math.sin(t) * 20 + 120);
            }

            myBuffer.drawImage(thomas.getImage(), xPos, yPos, 60, 80, null);
            t2.start();
            repaint();
        }
    }
    private class Listener2 implements ActionListener{
        public void actionPerformed(ActionEvent e){
            answerShowed = true;
            t2.stop();
        }
    }
}
