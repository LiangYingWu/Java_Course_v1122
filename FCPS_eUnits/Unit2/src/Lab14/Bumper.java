// Name: 				Date:

   import java.awt.*;
   
    public class Bumper
   {
    //private fields, all ints, for a Bumper
    //hint: the "location" of the bumper begins at its top left corner.      
	   private int xPos, yPos, xWidth, yWidth; 
      private Color color;
   
   
     //constructors
       public Bumper()         //default constructor
      {
         this.xPos = 0;
         this.yPos = 0;
         this.xWidth = 100;
         this.yWidth = 100;
         this.color = Color.CYAN; 
      }
       public Bumper(int x, int y, int xWidth, int yWidth, Color c)
      {
         this.xPos = x;
         this.yPos = y;
         this.xWidth = xWidth;
         this.yWidth = yWidth;
         this.color = Color.CYAN; 
      }
      
     // accessor methods  (one for each field)
      public int getX(){
         return xPos;
      }
      public int getY(){
         return yPos;
      }
      public int getXWidth(){
         return xWidth;
      }
      public int getYWidth(){
         return yWidth;
      }
      public Color getColor(){
         return color;
      }
     // modifier methods  (one for each field)
      public void setX(int x){
         xPos = x;
      }
      public void setY(int y){
         yPos = y;
      }
      public void setXWidth(int width){
         xWidth = width;
      }
      public void setYWidth(int height){
         yWidth = height;
      }
      public void setColor(Color color){
         this.color = color;
      }
   
     // instance methods
     // chooses a random (x,y) location.  Bumper stays entirely in the window.
        public void jump(int rightEdge, int bottomEdge)
      {
         // moves location to random (x, y) within the edges
         setX((int)(Math.random() * (rightEdge - getXWidth())));
         setY((int)(Math.random() * (bottomEdge - getYWidth())));
      }
      
       // draws a rectangular bumper on the buffer
       public void draw(Graphics myBuffer) 
      {
         myBuffer.setColor(getColor());
         myBuffer.fillRect(getX(), getY(), getXWidth(), getYWidth());
      }   
   	// returns true if any part of the polkadot is inside the bumper
       public boolean inBumper(Polkadot dot)
      {
         for(int x = getX(); x <= getX() + getXWidth(); x++)   //starts at upper left corner(x,y)
            for(int y = getY(); y <= getY() + getYWidth(); y++)
               if(distance(x, y, dot.getX(), dot.getY()) <= dot.getRadius() ) //checks every point on the bumper
                  return true;            
         return false;
      }  
      // returns distance between (x1, y1) and (x2, y2)
       private double distance(double x1, double y1, double x2, double y2)
      {
         return Math.sqrt(Math.pow(x1 - x2, 2) + Math.pow(y1 - y2, 2));
      }	
   }
