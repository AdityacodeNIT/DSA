import java.util.Arrays;

public class MinimumPathSum {

    public static void main(String[] args) {
        // Define the entire confusion matrix based on the image
        double[][] matrix = {
                { 0.58, 0.01, 0.10, 0.04, 0.14, 0.02, 0.10 }, // Angry
                { 0.21, 0.63, 0.06, 0.04, 0.02, 0.00, 0.00 }, // Disgust
                { 0.09, 0.01, 0.52, 0.04, 0.17, 0.08, 0.09 }, // Fear
                { 0.02, 0.00, 0.02, 0.85, 0.03, 0.02, 0.05 }, // Happy
                { 0.10, 0.00, 0.12, 0.05, 0.29, 0.02, 0.05 }, // Sad
                { 0.03, 0.13, 0.07, 0.01, 0.73, 0.03, 0.03 }, // Surprise
                { 0.06, 0.00, 0.06, 0.08, 0.16, 0.02, 0.62 } // Neutral
        };

        // Calculate the row-wise sums
        double[] rowSums = calculateRowSums(matrix);

        // Sort the sums in increasing order
        Arrays.sort(rowSums);

        // Print the sorted row sums
        System.out.println("Row-wise sums in increasing order:");
        for (double sum : rowSums) {
            System.out.printf("%.2f%n", sum);
        }
    }

    public static double[] calculateRowSums(double[][] matrix) {
        double[] sums = new double[matrix.length];

        // Calculate the sum of each row
        for (int i = 0; i < matrix.length; i++) {
            double sum = 0;
            for (int j = 0; j < matrix[i].length; j++) {
                sum += matrix[i][j];
            }
            sums[i] = sum;
        }

        return sums;
    }
}