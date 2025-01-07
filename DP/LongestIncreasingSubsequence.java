import java.util.Arrays;
import java.util.HashSet;

public class LongestIncreasingSubsequence {

    public static void main(String[] args) {
        // Array of districts from the image
        String[] districts = {
                "Saharanpur",
                "Shamli",
                "Sitapur",
                "SiddharthNagar",
                "Sultanpur",
                "Sonbhadra",
                "Shrawasti",
                "Sambhal",
                "Sultanpur",
                "Shahjahanpur"
        };

        // Sort the array in ascending order
        Arrays.sort(districts);

        // Print the sorted array
        System.out.println("Sorted districts starting with 'S': " + Arrays.toString(districts));

        // Get the first element
        String firstElement = districts[0];

        // Find the integer equivalent (ASCII value sum) of the first element
        int integerEquivalent = firstElement.chars().sum();

        // Print the integer equivalent
        System.out.println("Integer equivalent of first element: " + integerEquivalent);
    }
}