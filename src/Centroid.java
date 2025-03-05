/**
 * @author Adam Long
 */
public class Centroid extends Coordinate
{
   private final int CENTROID_ID;
   private boolean hasXMoved, hasYMoved;

   public Centroid(int x, int y, int centroidNumber)
   {
      super(x, y);
      this.CENTROID_ID = centroidNumber;
      this.hasXMoved = true;
      this.hasYMoved = true;
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
    * Updates the x-coordinate of the Centroid; tracks whether it has moved.
    *
    * @param x the new x-coordinate value to be set for the Centroid
    */
   @Override
   public void setX(int x)
   {
      this.hasXMoved = x != this.getX();
      super.setX(x);
   }

   /**
    * Updates the y-coordinate of the Centroid; tracks whether it has moved.
    *
    * @param y the new y-coordinate value to be set for the Centroid
    */
   @Override
   public void setY(int y)
   {
      this.hasYMoved = y != this.getY();
      super.setY(y);
   }

   /**
    * Checks if the centroid has moved along either the x-axis or y-axis.
    *
    * @return true if the centroid has moved on the x-axis or y-axis, false otherwise
    */
   public boolean hasMoved()
   {
      return this.hasXMoved || this.hasYMoved;
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
