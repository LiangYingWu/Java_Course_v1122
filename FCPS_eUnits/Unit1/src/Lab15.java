import edu.fcps.karel2.Display;

public class Lab15 {
    public static void main(String[] args)
      {
         Dancer dancer1 = new BackAndForthDancer(2, 3, Display.NORTH, 0);
         Dancer dancer2 = new TwirlDancer(6, 2, Display.NORTH, 0);
         Dancer dancer3 = new TwirlDancerv2(8, 3, Display.NORTH, 0);
         Thread t1 = new Thread(dancer1);
         Thread t2 = new Thread(dancer2);
         Thread t3 = new Thread(dancer3);
         t1.start();
         t2.start();
         t3.start();
      }
}
