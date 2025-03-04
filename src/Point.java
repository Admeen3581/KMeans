//Imports

/**
 * @author Adam Long
 */
public class Point
{
   private int x;
   private int y;
   private int cluster;

   public Point(int x, int y)
   {
      this.x = x;
      this.y = y;
      this.cluster = -1;
   }

   public int getX()
   {
      return this.x;
   }

   public int getCluster()
   {
      return cluster;
   }

   public int getY()
   {
      return y;
   }

   @Override
   public String toString()
   {
      return "Point{" +
            "x=" + x +
            ", y=" + y +
            ", cluster=" + cluster +
            '}';
   }
}
