import java.util.Arrays;

public class GreedyMinSum {
    public static void main(String[] args) {
        int a[] = { 1, 2, 3 };
        int b[] = { 4, 5, 6 };

        Arrays.sort(a);
        Arrays.sort(b);

        int minSum = 0;
        for (int i = 0; i < a.length; i++) {
            minSum += Math.abs(b[i] - a[i]);
        }

        System.out.println(minSum);

    }
}
