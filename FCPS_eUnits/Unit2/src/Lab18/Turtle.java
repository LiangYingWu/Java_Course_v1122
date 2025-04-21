// Torbert, 7.20.06

   import java.awt.*;
   import java.awt.image.*;

    public class Turtle
   {
      private static BufferedImage img;
      private static Graphics myBuffer;
      private static int black = 0;
      private static int blue = 255;       // 2^8-1
      private static int green = 65280;    //(2^8-1)*2^8
      private static int red = 16711680;   //(2^8-1)*2^16
      private static int white = 16777215; // 2^24-1
      private double x,y,theta;            // what does a Turtle know?
      static									 	 // a static initializer list
      {
         img = new BufferedImage(800,600,BufferedImage.TYPE_INT_RGB);
         myBuffer = img.getGraphics();
      }
       public Turtle()
      {
        // img = new BufferedImage(800,600,BufferedImage.TYPE_INT_RGB);
         x=img.getWidth()/2;           //start at center
         y=img.getHeight()/2;          //start at center
         theta=90;                     //start facing north
      }
       public static Image getImage()
      {
         return img;
      }
       public void turnLeft(double a)
      {
         theta+=a;
      }
       public void forward(double r)
      {
         double newX = 0;
         double newY = 0;
         for(int a = 0; a < (int)r; a++){
            newX = x + a * Math.cos(theta * Math.PI / 180);
            newY = y - a * Math.sin(theta * Math.PI / 180);

            img.setRGB((int)newX, (int)newY, white);
         }
        x = newX;
        y = newY;
      }
      public void drawLine(int x1, int y1, int x2, int y2) {
         int sx = x1 < x2 ? 1 : -1;
         int sy = y1 < y2 ? 1 : -1;
     
         while (true) {
            if (x1 >= 0 && y1 >= 0 && x1 < img.getWidth() && y1 < img.getHeight())
               img.setRGB(x1, y1, white);
            if (x1 == x2 && y1 == y2) break;
            x1 += sx;
            y1 += sy;
         }
      }
      public void drawCircle(int cx, int cy, int r) {
         int x = r;
         int y = 0;
         int d = 1 - r;
     
         while (x >= y) {
            plotCircle(cx, cy, x, y, white);
            y++;
            if (d < 0) {
               d += 2 * y + 1;
            }
            else {
               x--;
               d += 2 * (y - x) + 1;
            }
         }
      }
      private void plotCircle(int cx, int cy, int x, int y, int color) {
         int[][] points = {
             {cx + x, cy + y}, {cx - x, cy + y},
             {cx + x, cy - y}, {cx - x, cy - y},
             {cx + y, cy + x}, {cx - y, cy + x},
             {cx + y, cy - x}, {cx - y, cy - x}
         };
         for (int[] p : points) {
             int px = p[0], py = p[1];
             if (px >= 0 && py >= 0 && px < img.getWidth() && py < img.getHeight()) {
                 img.setRGB(px, py, color);
             }
         }
      }
      public void drawOval(int x, int y, int w, int h) {
         int cx = x + w / 2;
         int cy = y + h / 2;
         int a = w / 2;
         int b = h / 2;
   
         for (double theta = 0; theta < 2 * Math.PI; theta += 0.001) {
            int px = (int) (cx + a * Math.cos(theta));
            int py = (int) (cy + b * Math.sin(theta));
            if (px >= 0 && py >= 0 && px < img.getWidth() && py < img.getHeight()) {
               img.setRGB(px, py, white);
            }
         }
      }
   }