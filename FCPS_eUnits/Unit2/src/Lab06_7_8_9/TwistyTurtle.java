	//Name______________________________ Date_____________
   import edu.fcps.Turtle;
   import java.awt.Color;
   public class TwistyTurtle extends Turtle implements Runnable
   {
      private double mySize;
      private Color myColor;
      public TwistyTurtle()
      {
         mySize = 50.0;
         myColor = Color.RED;
      }
      public TwistyTurtle(double x, double y, Color c)
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
         for(int a = 5; a < 400; a+=10){
            forward(a);
            turnLeft(123);
         }
      }
      public void run(){
         drawShape();
      }
   }