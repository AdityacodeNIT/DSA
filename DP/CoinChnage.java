import java.util.ArrayList;
public class CoinChnage {public static void main(String[] args) {
        int coins[] = { 2, 5, 3, 6 };
        int sum = 10;
        int n = coins.length;
        int dp[][] = new int[n + 1][sum + 1];}
        public static void coin(int n, int dp[][], int sum, int coins[]) {
        ArrayList<ArrayList<Integer>> al = new ArrayList<>();
        ArrayList<Integer> bl = new ArrayList<>();
        for (int i = 0; i < n + 1; i++) {
        dp[i][0] = 1;}
      for (int i = 1; i < n + 1; i++) {
        for (int j = 1; j < sum + 1; j++) {
    int val = coins[i - 1];
                if (val <= j) {
dp[i][j] = dp[i][j - val] + dp[i - 1][j];
} else {
dp[i][j] = dp[i - 1][j];
 }
 bl.add(dp[i][j]);
 }
al.add(bl);
}
System.out.println(al);
System.out.println(dp[n][sum]);}

}
