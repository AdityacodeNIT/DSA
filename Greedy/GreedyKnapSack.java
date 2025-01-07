import java.util.Arrays;
import java.util.Comparator;

public class GreedyKnapSack {
    public static void main(String[] args) {
        int W = 50;
        int[] weight = { 10, 20, 30 };
        int value[] = { 60, 140, 120 };
        int n = weight.length;
        double ratio[][] = new double[n][n];

        for (int i = 0; i < n; i++) {
            ratio[i][0] = i;
            ratio[i][1] = value[i] / (double) weight[i];
        }
        Arrays.sort(ratio, Comparator.comparingDouble(o -> o[1]));
        int totalCapacity = 0;
        int capacity = W;

        for (int i = ratio.length - 1; i >= 0; i--) {
            int idx = (int) ratio[i][0];
            if (capacity >= weight[idx]) {
                totalCapacity += value[idx];
                capacity -= weight[idx];
            } else {
                totalCapacity += ratio[i][1] * capacity;
                capacity = 0;
            }

        }
        System.out.println(totalCapacity);
    }
}
