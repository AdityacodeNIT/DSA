public class countingsort {

    public static void arrayprint(int array[]) {
        for (int i = 0; i <= array.length - 1; i++) {
            System.out.print(array[i]);
        }
    }

    public static void counting(int array[]) {
        int largest = Integer.MIN_VALUE;
        for (int i = 0; i < array.length; i++) {

            largest = Math.max(largest, array[i]);
        }
        int count[] = new int[largest + 1];

        for (int i = 0; i < array.length; i++) {
            count[array[i]]++;

        }
        // sorting
        int j = 0;
        for (int k = 0; k < count.length; k++) {
            while (count[k] > 0) {
                array[j] = k;
                j++;
                count[k]--;
            }
        }
        arrayprint(array);

    }

    public static void main(String[] args) {
        int array[] = { 1, 1, 2, 4, 5, 3, 7 };
        counting(array);

    }
}
