public class HeapSort {

    // The code that is written below is for the Max-Heap in which the parent element is greater than the child element.


    public static void Heapify(int arr[], int i, int n) {
        int maxIdx = i;
        int left = 2 * i + 1;
        int right = 2 * i + 2;

        if (left < n && arr[left] > arr[maxIdx]) {
            maxIdx = left;
        }
        if (right < n && arr[right] > arr[maxIdx]) {
            maxIdx = right;
        }
        if (maxIdx != i) {
            int temp = arr[i];
            arr[i] = arr[maxIdx];
            arr[maxIdx] = temp;
        }

    }

    public static void heapSort(int arr[]) {
        int n = arr.length;
        for (int i = n / 2; i >= 0; i--) {
            Heapify(arr, i, n);
        }

        for (int i = n - 1; i >= 0; i--) {
            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;
            Heapify(arr, 0, i);

        }
    }

    public static void main(String[] args) {
        int arr[] = { 1, 4, 3, 8, 5 };
        heapSort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

    }
}
