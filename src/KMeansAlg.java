//Imports

import java.util.ArrayList;

/**
 * @author Adam Long
 */
public class KMeansAlg
{
   private ArrayList<Point> points;
   private ArrayList<Centroid> centroids;
   private final int K;
   private int minX, maxX, minY, maxY;

   /**
    * Initializes a new instance of the KMeansAlg class to perform k-means clustering.
    * The object processes input data points, determines the graph bounds, and
    * constructs initial centroids for clustering.
    *
    * @param k the number of clusters (centroids) to initialize the k-means algorithm
    */
   public KMeansAlg(int k)
   {
      this.centroids = new ArrayList<>();
      this.points = FileEditor.sortData();
      this.K = k;
      findGraphBounds();
      buildCentroids();
   }

   /**
    * Retrieves the list of points that are currently part of the dataset
    * being processed by the KMeans algorithm.
    *
    * @return an ArrayList containing Point objects representing the dataset
    */
   public ArrayList<Point> getPoints()
   {
      return points;
   }

   /**
    * Determines the bounds of the metaphorical graph.
    */
   private void findGraphBounds()
   {
      minX = Integer.MAX_VALUE;
      maxX = Integer.MIN_VALUE;
      minY = Integer.MAX_VALUE;
      maxY = Integer.MIN_VALUE;
      for(Point p : points)
      {
         if(p.getX() < minX)
         {
            minX = p.getX();
         }
         else if(p.getX() > maxX)
         {
            maxX = p.getX();
         }
         if(p.getY() < minY)
         {
            minY = p.getY();
         }
         else if(p.getY() > maxY)
         {
            maxY = p.getY();
         }
      }
   }

   /**
    * Initializes the centroids for the k-means algorithm by generating random points
    * within the bounds of the dataset. These bounds are determined by the minimum
    * and maximum x and y coordinates found in the dataset.
    */
   private void buildCentroids()
   {
      for (int i = 0; i < K; i++)
      {
         centroids.add(new Centroid(minX + (int)((maxX - minX) * Math.random()), minY + (int)((maxY - minY) * Math.random()), i));
      }
   }

   /**
    * Associates each point in the dataset with the closest centroid via Euclidean Distance.
    */
   public void bondPointsToCentroids()
   {
      double lowestDistance;
      for(Point p : points)
      {
         lowestDistance = Double.MAX_VALUE;
         for(Centroid c : centroids)
         {
            //Find distance point -> centroid
            double distCalculation = Math.sqrt(Math.pow(p.getX() - c.getX(), 2) + Math.pow(p.getY() - c.getY(), 2));
            lowestDistance = Math.min(lowestDistance, distCalculation);
            if (distCalculation == lowestDistance)
            {
               p.setClosestCentroid(c);
            }
         }
      }
   }

   /**
    * Updates the position of each centroid by calculating the mean of all points
    * currently assigned to it. The centroid is re-centered to the average x and
    * y-coordinates of the associated points.
    */
   public void centerCentroidWithCluster()
   {
      double sumXCoord, sumYCoord;
      int count;

      for(Centroid c : centroids)
      {
         sumXCoord = 0;
         sumYCoord = 0;
         count = 0;
         for(Point p : points)
         {
            if(p.getClosestCentroid() == c)
            {
               sumXCoord += p.getX();
               sumYCoord += p.getY();
               count++;
            }
         }
         if(count != 0)
         {
            c.setX((int)Math.round(sumXCoord / count));
            c.setY((int)Math.round(sumYCoord / count));
         }
      }
   }


}
