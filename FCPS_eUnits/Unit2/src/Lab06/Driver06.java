	//Name______________________________ Date_____________
   import edu.fcps.Turtle;
   import java.awt.Color;
   import javax.swing.*;
    public class Driver06
   {
       public static void main(String[] args)
      {
         JFrame frame = new JFrame("Square Turtles");
         frame.setSize(400, 400);
         frame.setLocation(200, 100);
         frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
         frame.setContentPane(new TurtlePanel());
         frame.setVisible(true);
         
         Turtle.setCrawl(true);     //a class method
      
         SquareTurtle smidge = new SquareTurtle();
         smidge.setColor(Color.BLUE);
         smidge.setThickness(6);
         smidge.drawShape();
         
         smidge = new SquareTurtle(100);
         smidge.drawShape();
         smidge = new SquareTurtle(100, 300, -45, 20);
         smidge.setColor(Color.RED);
         smidge.setThickness(4);
         smidge.drawShape();

         for(int a = 0; a < 4; a++){
            smidge = new SquareTurtle(500, 300, 135, (a + 1) * 10);
            smidge.setColor(Color.YELLOW);
            smidge.setThickness(2);
            smidge.drawShape();
         }
      
      }
   }