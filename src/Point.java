//Imports

/**
 * @author Adam Long
 */
public class Point extends Coordinate
{
   private Centroid closestCentroid;

   public Point(int x, int y)
   {
      super(x,y);
      this.closestCentroid = null;
   }

   public Centroid getClosestCentroid()
   {
      return this.closestCentroid;
   }

   public void setClosestCentroid(Centroid c)
   {
      this.closestCentroid = c;
   }

   @Override
   public String toString()
   {
      return super.toString() + "- closest Centroid: " + this.closestCentroid;
   }
}
