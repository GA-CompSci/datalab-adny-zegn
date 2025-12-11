import java.util.ArrayList;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

/**
 * CerealRunner2 - CSV File Parser
 *
 * Activity 2: Complete this class to read cerealSubset.csv
 *
 * Goal: Read the CSV file and create Cereal objects for each row
 * Expected output: "76 records created."
 */
public class CerealRunner2 {
    // Declare your instance variable here
    // You need an ArrayList to store Cereal objects
    ArrayList<Cereal> cereals;


    /**
     * Constructor - reads the CSV file and populates the cereals ArrayList
     *
     * Steps:
     * 1. Initialize your ArrayList
     * 2. Create a File object for "cerealSubset.csv"
     * 3. Create a Scanner to read from that file
     * 4. Loop while the scanner has more lines
     * 5. For each line:
     *    - Split by comma
     *    - Parse the values (use Integer.parseInt and Double.parseDouble)
     *    - Create a Cereal object
     *    - Add to ArrayList
     * 6. Close the scanner
     * 7. Handle FileNotFoundException with try-catch
     */
    public CerealRunner2() {
        cereals = new ArrayList<Cereal>();

        try {
            File cerealList = new File("cerealSubset.csv");
            Scanner fileScanner = new Scanner(cerealList);

            while (true) {
                if (!fileScanner.hasNextLine()) {
                    fileScanner.close();
                    System.out.println("Loaded " + cereals.size() + " cereals.\n");
                    break;
                }

                String nextLine = fileScanner.nextLine();
                String[] splitData = nextLine.split(",");
                String name = splitData[0];
                int calories = Integer.parseInt(splitData[1]);
                int fiber = Integer.parseInt(splitData[2]);
                int carbohydrates = Integer.parseInt(splitData[3]);
                double cups = Double.parseDouble(splitData[4]);
                
                cereals.add(new Cereal(name, calories, fiber, carbohydrates, cups));
            }
        } catch (FileNotFoundException e) {
            System.out.println("UH-OH! NO FILE TO BE FOUND! - " + e);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("MAMMA MIA! NOT ENOUGH COLUMNS IN THE DATA! - " + e);
        } catch (NumberFormatException e ) {
            System.out.println("AY CARAMBA! ARE YOU SURE THE DATA IS NUMBERS? - " + e);
        }
        

    }

    /**
     * Getter method for the cereals ArrayList
     */
    public ArrayList<Cereal> getCereals() {
        return cereals;  // Fix this
    }

    /**
     * Main method - creates runner and prints number of records
     */
    public static void main(String[] args) {
        // Create a CerealRunner2 object
        CerealRunner2 cRunner2 = new CerealRunner2();

        // Print the number of records created
        // Should output: "76 records created."


    }
}
