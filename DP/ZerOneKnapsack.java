
import java.util.ArrayList;
import java.util.Arrays;

public class ZerOneKnapsack {

    public static void print(int dp[][]) {
        for (int i = 0; i < dp.length; i++) {
            for (int j = 0; j < dp[0].length; j++) {
                System.out.print(dp[i][j] + "  ");
            }
            System.out.println();
        }
    }

    public static void printbool(boolean dp[][]) {
        for (int i = 0; i < dp.length; i++) {
            for (int j = 0; j < dp[0].length; j++) {
                System.out.print(dp[i][j] + "  ");
            }
            System.out.println();
        }
    }

    public static boolean targetSum(int subset[], int Sum, boolean dpbool[][], int m) {
        for (int i = 0; i < dpbool.length; i++) {
            dpbool[i][0] = true;
        }

        for (int i = 1; i < m + 1; i++) {
            for (int j = 1; j < Sum + 1; j++) {

                int v = subset[i - 1];

                if (v <= j && dpbool[i - 1][j - v]) {
                    dpbool[i][j] = true;
                }

                else if (dpbool[i - 1][j]) {
                    dpbool[i][j] = true;
                }
            }
        }
        printbool(dpbool);
        return dpbool[m][Sum];
    }

    public static int tabulationZeroOne(int val[], int wt[], int W, int n, int dp[][]) {
        for (int i = 0; i < dp.length; i++) {
            dp[i][0] = 0;
        }

        for (int j = 0; j < dp[0].length; j++) {
            dp[0][j] = 0;
        }

        for (int i = 1; i < n + 1; i++) {
            for (int j = 1; j < W + 1; j++) {
                int v = val[i - 1];
                int w = wt[i - 1];

                if (w <= j) {
                    int incProfit = v + dp[i - 1][j - w];

                    int excProfit = dp[i - 1][j];
                    dp[i][j] = Math.max(incProfit, excProfit);
                } else {
                    int excProfit = dp[i - 1][j];
                    dp[i][j] = excProfit;
                }

            }

        }
        print(dp);
        return dp[n][W];
    }

    public static int tabulationZeroOneUn(int val[], int wt[], int W, int n, int dp[][]) {
        for (int i = 0; i < dp.length; i++) {
            dp[i][0] = 0;
        }

        for (int j = 0; j < dp[0].length; j++) {
            dp[0][j] = 0;
        }

        for (int i = 1; i < n + 1; i++) {
            for (int j = 1; j < W + 1; j++) {
                int v = val[i - 1];
                int w = wt[i - 1];

                if (w <= j) {
                    int incProfit = v + dp[i][j - w];

                    int excProfit = dp[i - 1][j];
                    dp[i][j] = Math.max(incProfit, excProfit);
                } else {
                    int excProfit = dp[i - 1][j];
                    dp[i][j] = excProfit;
                }

            }

        }
        print(dp);
        return dp[n][W];
    }

    public static int zeroOne(int val[], int wt[], int W, int n, int dp[][]) {
        if (W == 0 || n == 0) {
            return 0;
        }

        if (dp[n][W] != -1) {
            return dp[n][W];
        }

        if (wt[n - 1] <= W) {
            // include

            int ans1 = val[n - 1] + zeroOne(val, wt, W - wt[n - 1], n - 1, dp);

            int ans2 = zeroOne(val, wt, W, n - 1, dp);

            dp[n][W] = Math.max(ans1, ans2);
            return dp[n][W];

        } else {
            dp[n][W] = zeroOne(val, wt, W, n - 1, dp);

            return dp[n][W];
        }
    }

    public static int roadCutting(int length[], int price[], int rodLength, int n, int dp2[][]) {

        if (rodLength == 0 || n == 0) {
            return 0;
        }

        if (dp2[n][rodLength] != -1) {
            return dp2[n][rodLength];
        }

        if (length[n - 1] <= rodLength) {
            int ans1 = price[n - 1] + roadCutting(length, price, rodLength - length[n - 1], n, dp2);

            int ans2 = roadCutting(length, price, rodLength, n - 1, dp2);
            int p = Math.max(ans1, ans2);

            return p;

        } else {
            int c = roadCutting(length, price, rodLength, n - 1, dp2);

            return c;

        }

    }

    public static void main(String[] args) {
        // int val[] = { 15, 14, 20, 45, 30 };
        // int wt[] = { 2, 5, 1, 3, 4 };
        // int n = val.length;

        // int W = 7;
        // int dp[][] = new int[n + 1][W + 1];

        // int Sum = 8;
        // int subset[] = { 1, 2, 4, 5, 3, 6, 8 };

        // int m = subset.length;

        // boolean dpbool[][] = new boolean[m + 1][Sum + 1];

        // System.out.println(targetSum(subset, Sum, dpbool, m));

        // Arrays.fill(dp, -1);ll

        // for (int i = 0; i < dp.length; i++) {
        // for (int j = 0; j < dp[0].length; j++) {
        // dp[i][j] = -1;
        // }
        // }

        // System.out.println(zeroOne(val, wt, W, n, dp));

        // System.out.println(tabulationZeroOneUn(val, wt, W, n, dp));

        int length1[] = { 1, 2, 3, 4, 5, 6, 7, 8 };
        int o = length1.length;

        int price[] = { 1, 5, 9, 9, 10, 17, 20, 13 };
        int rodlength = 8;

        int dp2[][] = new int[o + 1][rodlength + 1];

        for (int i = 0; i < dp2.length; i++) {
            for (int j = 0; j < dp2[0].length; j++) {
                dp2[i][j] = -1;
            }
        }

        System.out.println(roadCutting(length1, price, rodlength, o, dp2));

    }
}