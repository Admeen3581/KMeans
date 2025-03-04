//Imports
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author Adam Long
 */

public class FileEditor
{

   private static final String PATH = "inputData.txt";
   private static final File FILE = new File(PATH);

   /**
    * Creates a new Scanner object for reading data files.
    *
    * @return a Scanner object initialized with the specified file
    * @throws FileNotFoundException if the file cannot be found
    */
   private static Scanner createScannerObject() throws FileNotFoundException
   {
      return new Scanner(FILE);
   }

   private static void exportResultsFile()
   {
      //implement results to file.
   }

   /**
    * Reads data from a file and parses it into a HashMap. Each line in the file
    * is expected to be a comma-separated pair of integers. The first integer
    * is used as the key and the second as the value in the resulting HashMap.
    *
    * @return a HashMap containing the parsed integer key-value pairs from the file
    * @throws FileNotFoundException if the file cannot be found
    */
   public static ArrayList<Point> sortData()
   {
      Scanner scan;
      try
      {
         scan = createScannerObject();
      } catch (FileNotFoundException e)
      {
         throw new RuntimeException("Data file not found: " + PATH);
      }

      ArrayList<Point> data = new ArrayList<>();

      while (scan.hasNextLine())
      {
         data.add(new Point(scan.nextInt(), scan.nextInt()));
      }

      return data;
   }
}
