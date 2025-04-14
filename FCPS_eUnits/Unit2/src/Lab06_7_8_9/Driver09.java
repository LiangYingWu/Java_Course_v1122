	//Name______________________________ Date_____________
   import edu.fcps.Turtle;
   import java.awt.Color;
   import javax.swing.*;
   public class Driver09
   {
      public static void main(String[] args)
      {
         JFrame frame = new JFrame("flower Turtles");
         frame.setSize(600, 600);
         frame.setLocation(200, 100);
         frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
         frame.setContentPane(new TurtlePanel());
         frame.setVisible(true);
         Turtle.clear(Color.WHITE);
         
         TwistyTurtle flower1 = new TwistyTurtle(200.0, 200.0, Color.BLUE);
         // flower1.drawShape();
         Thread t1 = new Thread(flower1);
         t1.start();

         TwistyTurtle2 flower2 = new TwistyTurtle2(300.0, 300.0, Color.RED);
         // flower2.drawShape();
         Thread t2 = new Thread(flower2);
         t2.start();

         TwistyTurtle3 flower3 = new TwistyTurtle3(400.0, 400.0, Color.BLACK);
         // flower3.drawShape();
         Thread t3 = new Thread(flower3);
         t3.start();

      }
   }