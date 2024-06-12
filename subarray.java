public class subarray {

    public static void subarry(int arrays[]) {

        for (int i = 0; i < arrays.length; i++) {
            for (int j = i; j < arrays.length; j++) {
                int sum = 0;
                for (int k = i; k < j; k++) {
                    sum = sum + arrays[k];
                    System.out.print(arrays[k]);

                }
                System.out.print(" " + sum);
                System.out.println();

            }
            System.out.println();

        }
    }

    public static void main(String[] args) {
        int arrays[] = { 1, 2, 3, 4, 5, 6, 7 };
        subarry(arrays);
    }
}
