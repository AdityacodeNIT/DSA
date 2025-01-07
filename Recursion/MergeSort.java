import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
        int arr[] = { 5, 4, 3, 7, 2 };
        int start = 0;
        int end = arr.length;

        int ary[] = mergeSort(arr);
        for (int i = 0; i < ary.length; i++) {
            System.out.println(ary[i]);
        }
        mergersortedArray(arr, start, end);
        System.err.println(Arrays.toString(arr));
    }

    static int[] mergeSort(int arr[]) {
        if (arr.length == 1) {
            return arr;
        }
        int mid = arr.length / 2;

        int left[] = mergeSort(Arrays.copyOfRange(arr, 0, mid));

        int right[] = mergeSort(Arrays.copyOfRange(arr, mid, arr.length));

        return merge(left, right);
    }

    private static int[] merge(int first[], int second[]) {
        int newArr[] = new int[first.length + second.length];

        int i = 0, j = 0, k = 0;
        while (i < first.length && j < second.length) {
            if (first[i] < second[j]) {
                newArr[k] = first[i];
                i++;
            } else {
                newArr[k] = second[j];
                j++;
            }
            k++;
        }
        while (i < first.length) {
            newArr[k] = first[i];
            k++;
            i++;
        }
        //

        while (j < second.length) {
            newArr[k] = second[j];
            k++;
            j++;
        }
        return newArr;

    }

    static void mergersortedArray(int arr[], int s, int e) {
        if (e - s == 1) {
            return;
        }
        int mid = s + (e - s) / 2;

        mergersortedArray(arr, s, mid);
        mergersortedArray(arr, mid, e);

        mergePlace(arr, s, mid, e);

    }

    static void mergePlace(int arr[], int s, int mid, int e) {
        int mix[] = new int[e - s];

        int i = s;
        int j = mid;
        int k = 0;
        while (i < mid && j < e) {
            if (arr[i] > arr[j]) {
                mix[k] = arr[j];
                j++;
            } else {
                mix[k] = arr[i];
                i++;
            }
            k++;
        }
        while (i < mid) {
            mix[k] = arr[i];
            i++;
            k++;
        }
        while (j < e) {
            mix[k] = arr[j];
            j++;
            k++;
        }
        for (int l = 0; l < mix.length; l++) {
            arr[s + l] = mix[l];
        }

    }

}
