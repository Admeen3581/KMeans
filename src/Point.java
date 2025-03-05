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

   /**
    * Retrieves the closest centroid associated with the point.
    *
    * @return the Centroid object representing the closest centroid to this point
    */
   public Centroid getClosestCentroid()
   {
      return this.closestCentroid;
   }

   /**
 * Updates the closest centroid associated with this point.
 *
 * @param c the centroid to be set as the closest*/
   public void setClosestCentroid(Centroid c)
   {
      this.closestCentroid = c;
   }

   /**
    * Provides a string representation of the Point object.
    *
    * @return a string representing the Point object in the format "(x, y)- closest Centroid: <closestCentroid>"
    */
   @Override
   public String toString()
   {
      return super.toString() + "- closest Centroid: " + this.closestCentroid;
   }
}
