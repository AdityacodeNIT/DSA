public class subaaraymax {

    public static void subarrymax(int arrays[]) {
        int maxSum = Integer.MIN_VALUE;
        int prefix[] = new int[arrays.length];

        prefix[0] = arrays[0];
        for (int l = 1; l < prefix.length; l++) {
            prefix[l] = prefix[l - 1] + arrays[l];
        }

        for (int i = 0; i < arrays.length; i++) {
            for (int j = i; j < arrays.length; j++) {
                int sum = 0;
                if (i == 0) {
                    sum = prefix[j];
                } else {
                    sum = prefix[j] - prefix[i - 1];
                }
                // for (int k = i; k < j; k++) {
                // sum = sum + arrays[k];

                // }

                if (maxSum < sum) {
                    maxSum = sum;
                }

            }

        }
        System.out.println(maxSum);
    }

    public static void main(String[] args) {
        int arrays[] = { 1, 2, -3, -4, 5, 6, 7 };
        subarrymax(arrays);
    }

}