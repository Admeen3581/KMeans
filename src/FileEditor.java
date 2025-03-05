//Imports
import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author Adam Long
 */

public class FileEditor
{

   private static final String INPUT_PATH = "inputData.txt";
   private static final String OUTPUT_PATH = "outputData.txt";
   private static final File FILE = new File(INPUT_PATH);

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
      }
      catch (FileNotFoundException e)
      {
         e.printStackTrace();
         return null;
      }

      ArrayList<Point> data = new ArrayList<>();

      while (scan.hasNextLine())
      {
         data.add(new Point(scan.nextInt(), scan.nextInt()));
      }

      return data;
   }

   /**
    * Appends the given data in the format "x, y, cluster" to a text file.
    * Each data entry is written on a new line and separated by tab characters.
    *
    * @param x the x-coordinate value to be written to the file
    * @param y the y-coordinate value to be written to the file
    * @param cluster the cluster number associated with the coordinates
    */
   public static void fileData(int x, int y, int cluster)
   {
      try (BufferedWriter writer = new BufferedWriter(new FileWriter(OUTPUT_PATH, true)))
      {
         // Write data in the format "x,y,cluster"
         writer.write(x + "\t\t" + y + "\t\t" + cluster);
         writer.newLine();
      }
      catch (IOException e)
      {
         e.printStackTrace();
      }
   }

   /**
    * Clears the content of a file by overwriting it with an empty string.
    */
   public static void clearFile()
   {
      try (BufferedWriter writer = new BufferedWriter(new FileWriter(OUTPUT_PATH, false)))
      {
         writer.write("");
      }
      catch (IOException e)
      {
         e.printStackTrace();
      }
   }
}
