/**
 * @author Adam Long
 */

public abstract class Coordinate
{
   private int x;
   private int y;

   public Coordinate(int x, int y) {
      this.x = x;
      this.y = y;
   }

   /**
    * Retrieves the x-coordinate value.
    *
    * @return the x-coordinate as an integer
    */
   public int getX() {
      return x;
   }

   /**
    * Retrieves the y-coordinate value.
    *
    * @return the y-coordinate as an integer
    */
   public int getY() {
      return y;
   }

   /**
    * Representation of the coordinate in the format "(x, y)".
    *
    * @return a string representing the x and y values of the coordinate
    */
   @Override
   public String toString()
   {
      return "(" + x + ", " + y + ")";
   }
}


