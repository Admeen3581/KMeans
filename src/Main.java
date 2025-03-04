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

        ArrayList<Point> list = FileEditor.sortData();

        for (Point p : list)
        {
            System.out.println(p);
        }

        KMeansAlg alg = new KMeansAlg(2);
        for (int k=0; k<5; k++)
        {
            alg.bondPointsToCentroids();
            alg.centerCentroidWithCluster();
        }


    }
}