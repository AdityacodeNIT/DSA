public class maxarraysumkadane {

    public static void maxarray(int array[]) {
        int currentSum = 0;
        int maxSum = Integer.MIN_VALUE;
        for (int i = 0; i < array.length; i++) {

            currentSum = currentSum + array[i];
            if (currentSum < 0) {
                currentSum = 0;
            }
            if (maxSum < currentSum) {
                maxSum = currentSum;
            }
        }
        System.out.println(maxSum);
    }

    public static void main(String[] args) {
        int array[] = { 1, 2, -3, -4, 5, 6, 7 };
        maxarray(array);
    }
}
