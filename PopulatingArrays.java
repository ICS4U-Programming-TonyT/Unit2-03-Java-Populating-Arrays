import java.util.Random;
import java.util.Arrays;

/**
 * Generates 5 lines of random numbers, each containing 10 integers.
 * @author Tony Tran
 * @version 1.0
 * @since 2025-03-18
 */
final class PopulatingArrays {
    /**
     * This is a private constructor to satisfy style checker.
     *
     * @exception IllegalStateException Utility class.
     * @see IllegalStateException
     */
    private PopulatingArrays() {
        throw new IllegalStateException("Utility class");
    }
    /**
     * This is the main method to run the program.
     * @param args
     */
    public static void main(final String[] args) throws Exception {
        // Create a Random object to generate random numbers
        Random rand = new Random();
        // Create an array to hold the random numbers
        int[][] randomNumbers = new int[5][10];

        // Generate 5 lines of random numbers
        System.out.println("Generating random numbers:");
        for (int lines = 0; lines < 5; lines++) {
            // Fill each line with 10 random numbers
            for (int numBracket = 0; numBracket < 10; numBracket++) {
                randomNumbers[lines][numBracket] =
                 rand.nextInt(101); // Random number between 0 and 100
            }
            System.out.println(Arrays.toString(
                randomNumbers[lines])); // Print to console for debugging
        }

        // Sort each line of random numbers and calculate the average
        System.out.println("\nSorted arrays and their averages:");
        for (int lines = 0; lines < 5; lines++) {
            Arrays.sort(randomNumbers[lines]);
            double sum = 0;
            // Calculate the sum of the sorted array to compute the average
            for (int numBracket = 0; numBracket < 10; numBracket++) {
                sum += randomNumbers[lines][numBracket];
            }
            double average = sum / 10;

            // Display the sorted array and average
            System.out.print(Arrays.toString(randomNumbers[lines])
             + " Average: " + average + "\n");
        }
    }
}
