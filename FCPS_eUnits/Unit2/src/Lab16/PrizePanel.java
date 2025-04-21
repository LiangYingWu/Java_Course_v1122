//Name:    Date:
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.image.*;
import java.lang.Math;

public class PrizePanel extends JPanel
{
   private static final int FRAME = 400;
   private static final Color BACKGROUND = new Color(204, 204, 204);
   private BufferedImage myImage;
   private Graphics myBuffer;
   private Ball ball;
   private Polkadot pd;
   private int count;
   private Timer t; 
   //constructor   
   public PrizePanel(){
      myImage =  new BufferedImage(FRAME, FRAME, BufferedImage.TYPE_INT_RGB);
      myBuffer = myImage.getGraphics();
      myBuffer.setColor(BACKGROUND);
      myBuffer.fillRect(0, 0, FRAME,FRAME);
      int xPos = (int)(Math.random()*(FRAME-100) + 50);
      int yPos = (int)(Math.random()*(FRAME-100)+ 50);
      ball = new Ball(xPos, yPos, 50, Color.GREEN);
      pd = new Polkadot(xPos, yPos, 50, Color.RED);
      count = 0;
     
      addMouseListener(new Mouse());

      t = new Timer(5, new Listener());
      t.start();
   }
   public void paintComponent(Graphics g){
      g.drawImage(myImage, 0, 0, getWidth(), getHeight(), null);
      g.drawString("Count: " + count, 10, 20);
   }
   private class Listener implements ActionListener{
      public void actionPerformed(ActionEvent e){
         collide(ball, pd);
         myBuffer.setColor(BACKGROUND);    //cover the 
         myBuffer.fillRect(0,0,FRAME,FRAME);   //old ball
         ball.move(FRAME,FRAME);
         ball.draw(myBuffer);
         pd.draw(myBuffer);
         repaint();
      }
   }
   private class Mouse extends MouseAdapter{
      public void mousePressed(MouseEvent e){
         if (SwingUtilities.isRightMouseButton(e)) {
             ball.setX(e.getX());
             ball.setY(e.getY());
         } 
         else if (e.isShiftDown() && SwingUtilities.isLeftMouseButton(e)) {
            ball.setdx(Math.random() * 10 + 1);
            ball.setdy(Math.random() * 10 + 1);
         } 
         else if(SwingUtilities.isLeftMouseButton(e)) {
             pd.setX(e.getX());
             pd.setY(e.getY());
         }
      }
   }
   private void collide(Ball b, Polkadot pd){
      double d = distance(b.getX(), b.getY(), pd.getX(), pd.getY());  
      if(d <= (b.getDiameter() + pd.getDiameter()) / 2){
         ball.setdx(Math.random() * 10 + 1);
         ball.setdy(Math.random() * 10 + 1);
         pd.setX(Math.random() * FRAME);
         pd.setY(Math.random() * FRAME);
         count = count + 1;
      }

   }
   private double distance(double x1, double y1, double x2, double y2){
      return Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));	 // enter the calculation here.
   }
}