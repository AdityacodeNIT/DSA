public class price {

    public static int maximumProfit(int array[]) {
        int buyprice = Integer.MAX_VALUE;
        int maxProfit = 0;

        for (int i = 0; i < array.length; i++) {
            if (buyprice > array[i]) {
                buyprice = array[i];
            } else {
                int profit = array[i] - buyprice;
                maxProfit = Math.max(maxProfit, profit);

            }

        }
        return maxProfit;

    }

    public static void main(String[] args) {
        int array[] = { 7, 1, 5, 3, 6, 4 };
        int prof = maximumProfit(array);
        System.out.println(prof);

    }
}
