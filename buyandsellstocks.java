public class buyandsellstocks {
    public static int stockprofit(int stocks[]) {
        int maxprofit = 0;
        int buyPrice = Integer.MAX_VALUE;
        for (int i = 0; i < stocks.length; i++) {
            if (buyPrice > stocks[i]) {
                buyPrice = stocks[i];
            } else {
                int profit = stocks[i] - buyPrice;
                maxprofit = Math.max(maxprofit, profit);
            }

        }
        return maxprofit;

    }

    public static void main(String[] args) {

        int stocks[] = { 7, 1, 5, 3, 6, 4 };
        int stockmarket = stockprofit(stocks);
        System.out.println(stockmarket);
    }
}
