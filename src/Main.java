//Imports

import java.util.ArrayList;

/**
 * @author Adam Long
 */
public class Main
{
    public static void main(String[] args)
    {
        //Terminal test
        System.out.println("\n--System works--\n\n");


        KMeansAlg alg = new KMeansAlg(4);
        for (int k=0; k<12; k++)
        {
            alg.bondPointsToCentroids();
            alg.centerCentroidWithCluster();
        }

        ArrayList<Point> points = alg.getPoints();
        FileEditor.clearFile();
        for (Point p : points)
        {
            FileEditor.fileData(p.getX(), p.getY(), p.getClosestCentroid().getCENTROID_ID());
        }

    }
}