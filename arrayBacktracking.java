public class arrayBacktracking {

    public static void printArrays(int array[]) {
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }

    public static void backTrack(int arr[], int i, int val) {

        if (i == arr.length) {
            printArrays(arr);
            return;
        }

        arr[i] = val;
        backTrack(arr, i + 1, val + 1);
        arr[i] = arr[i] - 2;
    }

    public static void main(String[] args) {

        int arr[] = new int[4];
        backTrack(arr, 0, 1);
        printArrays(arr);

    }
}
