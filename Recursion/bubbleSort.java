public class bubbleSort {
    public static void main(String[] args) {
        int arr[] = { 4, 9, 0, 1 };
        int n = arr.length - 1;
        bubbleSort(arr, n, 0);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    static void bubbleSort(int arr[], int n, int col) {
        if (n == 0) {
            return;
        }
        if (col < n) {
            if (arr[col] > arr[col + 1]) {
                int temp = arr[col];
                arr[col] = arr[col + 1];
                arr[col + 1] = temp;

            }
            bubbleSort(arr, n, col + 1);
        } else {
            bubbleSort(arr, n - 1, 0);
        }
    }
}
