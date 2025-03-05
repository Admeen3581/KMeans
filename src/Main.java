//Imports

import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author Adam Long
 */
public class Main
{
    public static void main(String[] args)
    {
        //Terminal test
        System.out.println("\n--System works--\n\n");


        //Recieves K input
        Scanner s = new Scanner(System.in);
        System.out.println("Enter K: ");
        int k = s.nextInt();


        KMeansAlg alg = new KMeansAlg(k);
        while(alg.centroidMovementControl())
        {
            System.out.println("check");
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