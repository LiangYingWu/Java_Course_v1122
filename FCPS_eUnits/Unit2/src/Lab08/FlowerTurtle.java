	//Name______________________________ Date_____________
   import edu.fcps.Turtle;
   import java.awt.Color;
   public class FlowerTurtle extends Turtle
   {
      private double mySize;
      private Color myColor;
      public FlowerTurtle()
      {
         mySize = 50.0;
         myColor = Color.RED;
      }
      public FlowerTurtle(double x, double n, Color c)
      {
         super(x, 300.0, 90.0);
         mySize = n;
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
      private void drawPetals() //starts and ends at center facing north
      {
         super.setColor(myColor);
         for(int a = 0; a < 30; a++){
            setPenDown(true);
            forward(mySize);
            back(mySize);
            turnLeft(12);
         }
      }
      private void drawStem() //starts at top of stem facing south, ends at bottom
      {
         turnLeft(180);
         super.setColor(myColor);
         forward(mySize);
         super.setColor(Color.GREEN);
         forward(1.5 * mySize);
         back(0.5 * mySize);
         turnLeft(135);
         forward(mySize);
         back(mySize);
         turnLeft(90);
         forward(0.5 * mySize);
         back(0.5 * mySize);
      }
      public void drawShape()
      {
         drawPetals();
         drawStem();
      }
   }