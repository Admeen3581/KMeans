/**
 * @author Adam Long
 */
public class Centroid extends Coordinate
{
   private final int CENTROID_ID;

   public Centroid(int x, int y, int centroidNumber)
   {
      super(x, y);
      this.CENTROID_ID = centroidNumber;
   }

   /**
    * Retrieves the unique identifier of the centroid.
    *
    * @return the integer identifier of the centroid
    */
   public int getCENTROID_ID()
   {
      return CENTROID_ID;
   }

   /**
    * Provides a string representation of the Centroid object.
    *
    * @return a string representation of the Centroid object in the format "(x, y)- Centroid{centroidNumber=<CENTROID_ID>}"
    */
   @Override
   public String toString()
   {
      return super.toString() + "- Centroid{" +
            "centroidNumber=" + this.CENTROID_ID +
            '}';
   }
}
