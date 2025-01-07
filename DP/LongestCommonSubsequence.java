public class LongestCommonSubsequence {
    public static void main(String[] args) {
        String str1 = "abcde";
        String str2 = "abce";

        int n = str1.length() - 1;

        int m = str2.length() - 1;

        int dp[][] = new int[n + 1][m + 1];

        int dp2[][] = new int[n + 1][m + 1];

        for (int i = 0; i < n + 1; i++) {
            for (int j = 0; j < m + 1; j++) {
                dp[i][j] = -1;
            }
        }

        for (int i = 0; i < n + 1; i++) {
            dp2[i][0] = 0;
        }

        for (int j = 0; j < m + 1; j++) {
            dp2[j][0] = 0;
        }

        int strLength = 0;

        System.out.println(longestCommonSubsequence(n, m, str1, str2, strLength));
        System.out.println("the value is " + longestCommonSubstring(n, m, str1, str2, strLength));
        System.out.println(longestCommonSubsequenceWithMemoization(n, m, str1, str2, strLength, dp));
        int ans = 0;
        System.out.println(longestCommonSubstringTabulation(n, m, str1, str2, strLength, dp2, ans));

    }

    public static int longestCommonSubsequence(int n, int m, String str1, String str2, int strLength) {
        if (n == -1 || m == -1) {
            return strLength;
        }

        if (str1.charAt(n) != str2.charAt(m)) {
            int l1 = longestCommonSubsequence(n - 1, m, str1, str2, strLength);
            int l2 = longestCommonSubsequence(n, m - 1, str1, str2, strLength);

            return Math.max(l1, l2);

        } else {
            int l3 = longestCommonSubsequence(n - 1, m - 1, str1, str2, strLength + 1);
            return l3;
        }
    }

    public static int longestCommonSubsequenceWithMemoization(int n, int m, String str1, String str2, int strLength,
            int dp[][]) {
        if (n == -1 || m == -1) {
            return strLength;
        }

        if (dp[n][m] != -1) {
            return dp[n][m];
        }

        if (str1.charAt(n) != str2.charAt(m)) {
            int l1 = longestCommonSubsequenceWithMemoization(n - 1, m, str1, str2, strLength, dp);
            int l2 = longestCommonSubsequenceWithMemoization(n, m - 1, str1, str2, strLength, dp);

            dp[n][m] = Math.max(l1, l2);
            return dp[n][m];

        } else {
            dp[n][m] = longestCommonSubsequenceWithMemoization(n - 1, m - 1, str1, str2, strLength + 1, dp);
            return dp[n][m];
        }
    }

    public static int longestCommonSubstring(int n, int m, String str1, String str2, int strLength) {
        if (n == -1 || m == -1) {
            return strLength;
        }

        if (str1.charAt(n) != str2.charAt(m)) {
            int l1 = longestCommonSubstring(n - 1, m, str1, str2, 0);
            int l2 = longestCommonSubstring(n, m - 1, str1, str2, 0);

            return Math.max(l1, l2);
        } else {
            int l3 = longestCommonSubstring(n - 1, m - 1, str1, str2, strLength + 1);
            return l3;
        }

    }

    public static int longestCommonSubstringTabulation(int n, int m, String str1, String str2, int strLength,
            int dp2[][], int ans) {

        for (int i = 1; i < n + 1; i++) {
            for (int j = 1; j < m + 1; j++) {

                if (str1.charAt(n) != str2.charAt(m)) {
                    dp2[i][j] = 0;
                } else {
                    dp2[i][j] = dp2[i - 1][j - 1] + 1;
                    ans = Math.max(ans, dp2[i][j]);
                }
            }

        }
        return ans;
    }
}
