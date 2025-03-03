	//Name______________________________ Date_____________
   import edu.fcps.Turtle;
   import java.awt.Color;
   import javax.swing.*;
   public class Driver08
   {
      public static void main(String[] args)
      {
         JFrame frame = new JFrame("flower Turtles");
         frame.setSize(400, 400);
         frame.setLocation(200, 100);
         frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
         frame.setContentPane(new TurtlePanel());
         frame.setVisible(true);
         Turtle.clear(Color.WHITE);
         
         FlowerTurtle flower1 = new FlowerTurtle(100.0, 50.0, Color.RED);
         flower1.drawShape();

         FlowerTurtle flower2 = new FlowerTurtle(220.0, 50.0, Color.PINK);
         flower2.drawShape();

         FlowerTurtle flower3 = new FlowerTurtle(340.0, 50.0, Color.YELLOW);
         flower3.drawShape();

         FlowerTurtle flower4 = new FlowerTurtle(460.0, 50.0, Color.BLUE);
         flower4.drawShape();

      }
   }