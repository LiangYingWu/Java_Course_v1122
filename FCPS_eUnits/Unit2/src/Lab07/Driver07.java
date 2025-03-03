	//Name______________________________ Date_____________
   import edu.fcps.Turtle;
   import java.awt.Color;
   import javax.swing.*;
   public class Driver07
   {
      public static void main(String[] args)
      {
         JFrame frame = new JFrame("Polygon Turtles");
         frame.setSize(400, 400);
         frame.setLocation(200, 100);
         frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
         frame.setContentPane(new TurtlePanel());
         frame.setVisible(true);
      
         PolygonTurtle smidge = new PolygonTurtle(100.0, 3);
         smidge.setColor(Color.BLUE);
         smidge.setThickness(6);
         smidge.drawShape();
         smidge = new PolygonTurtle(100.0, 5);
         smidge.setColor(Color.BLACK);
         smidge.setThickness(4);
         smidge.drawShape();

         smidge = new PolygonTurtle(250, 450, -45, 20, 6);
         smidge.setColor(Color.RED);
         smidge.setThickness(4);
         smidge.drawShape();

         for(int a = 0; a < 4; a++){
            smidge = new PolygonTurtle(500, 300, 135, (a + 1) * 10, 8);
            smidge.setColor(Color.YELLOW);
            smidge.setThickness(2);
            smidge.drawShape();
         }
      
      }
   }