public class SelectionSort {
    public static void main(String[] args) {
        int arr[] = { 1, 4, 2, 6, 5 };
        int n = arr.length;

        sorted(arr, 0, n, 0);

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    static void sorted(int arr[], int max, int n, int index) {
        if (n == 0) {
            return;
        }
        if (index < n) {
            if (arr[index] > arr[max]) {
                sorted(arr, index, n, index + 1);
            } else {
                sorted(arr, max, n, index + 1);
            }
        } else {
            int temp = arr[n - 1];
            arr[n - 1] = arr[max];
            arr[max] = temp;

            sorted(arr, 0, n - 1, 0);
        }
    }
}
