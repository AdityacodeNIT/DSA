public class ClimbingStairs {
    public static void main(String[] args) {
        int n = 4;
        int dp[] = new int[n + 1];

        System.out.println(waysToClimb(n, dp));

        // System.out.println(waysToClimb2(n));
    }

    public static int waysToClimb(int n, int dp[]) {
        if (n == 0) {
            return 1;
        }
        if (n < 0) {
            return 0;
        }

        if (dp[n] != 0) {
            return dp[n];
        }

        dp[n] = waysToClimb(n - 1, dp) + waysToClimb(n - 2, dp) + waysToClimb(n - 3, dp);
        return dp[n];
    }

    public static int waysToClimb2(int n) {
        if (n == 0) {
            return 1;
        }
        if (n < 0) {
            return 0;
        }

        int dp = waysToClimb2(n - 1) + waysToClimb2(n - 2);
        return dp;
    }

}
