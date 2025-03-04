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

   public int getCENTROID_ID()
   {
      return CENTROID_ID;
   }

   @Override
   public String toString()
   {
      return super.toString() + "- Centroid{" +
            "centroidNumber=" + this.CENTROID_ID +
            '}';
   }
}
