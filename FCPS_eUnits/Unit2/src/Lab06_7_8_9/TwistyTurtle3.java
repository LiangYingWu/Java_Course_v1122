	//Name______________________________ Date_____________
   import edu.fcps.Turtle;
   import java.awt.Color;
   public class TwistyTurtle3 extends Turtle implements Runnable
   {
      private double mySize;
      private Color myColor;
      public TwistyTurtle3()
      {
         mySize = 50.0;
         myColor = Color.RED;
      }
      public TwistyTurtle3(double x, double y, Color c)
      {
         super(x, y, 90.0);
         // mySize = n;
         myColor = c;
      }
      public void setSize(double n)
      {
         mySize = n;
      }
      public void setColor(Color c)
      {
         myColor = c;
      }
      public void drawShape() //starts at top of stem facing south, ends at bottom
      {
         setPenDown(true);
         super.setColor(myColor);
         for(int a = 25; a < 150; a+=5){
            for(int b = 0; b < 4; b++){
               forward(a);
               turnLeft(90);
            }
            turnLeft(45);
         }
      }
      public void run(){
         drawShape();
      }
   }