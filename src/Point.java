//Imports

/**
 * @author Adam Long
 */
public class Point extends Coordinate
{
   private int x;
   private int y;
   private int closestCentroid;

   public Point(int x, int y)
   {
      super(x,y);
      this.closestCentroid = -1;
   }

   public int getClosestCentroid()
   {
      return closestCentroid;
   }
}
