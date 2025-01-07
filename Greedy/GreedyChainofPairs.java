import java.util.*;
import java.util.Comparator;

public class GreedyChainofPairs {

    public static void indianCoins(int coins[], int value) {
        ArrayList<Integer> ans = new ArrayList<>();

        Arrays.sort(coins);
        int notes = 0;

        for (int i = coins.length - 1; i >= 0; i--) {
            if (coins[i] <= value) {
                while (coins[i] <= value) {
                    ans.add(coins[i]);
                    value = value - coins[i];
                    notes++;
                }

            }

        }
        System.out.println(notes);

        for (int i = 0; i < ans.size(); i++) {
            System.out.print(ans.get(i) + " ");
        }
        System.out.println();

    }

    public static void main(String[] args) {
        int pairs[][] = { { 5, 24 }, { 39, 60 }, { 5, 28 }, { 27, 40 }, { 50, 90 } };
        int coins[] = { 1, 2, 5, 10, 20, 50, 100, 500, 1000 };

        int value = 570;
        indianCoins(coins, value);

        Arrays.sort(pairs, Comparator.comparingDouble(o -> o[1]));

        int chainlen = 1;
        int chainEnd = pairs[0][1];

        for (int i = 0; i < pairs.length; i++)
            if (pairs[i][0] > chainEnd) {
                chainlen++;
                chainEnd = pairs[i][1];

            }
        System.out.println(chainlen);
    }
}
