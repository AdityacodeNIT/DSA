public class quicksort {

    public static void printarr(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    public static void quickSort(int quick[], int si, int li) {
        if (si >= li) {
            return;
        }

        int pidx = partition(quick, si, li);
        quickSort(quick, si, pidx - 1);

        quickSort(quick, pidx + 1, li);

    }

    public static int binarysearch(int arr[], int si, int tar, int li) {
        if (si > li) {
            return -1;
        }

        int mid = si + (li - si) / 2;

        if (arr[mid] == tar) {
            return mid;
        }

        // for l1
        if (arr[si] <= tar) {
            if (arr[si] <= tar && tar <= li) {
                return binarysearch(arr, si, tar, mid - 1);
            } else {
                return binarysearch(arr, mid + 1, tar, li);
            }
        }

        else {

            // for line 2

            if (arr[mid] <= tar && tar <= li) {
                return binarysearch(arr, si, tar, mid - 1);
            } else {
                return binarysearch(arr, mid + 1, tar, li);

            }
        }
    }

    public static int partition(int quick[], int si, int li) {

        int i = si - 1;
        int pivot = quick[li];

        for (int j = si; j < li; j++) {
            if (quick[j] < pivot) {
                i++;
            }
        }
        i++;
        int temp = pivot;
        quick[li] = quick[i];
        quick[i] = temp;
        return i;

    }

    public static void main(String[] args) {
        int quick[] = { 1, 3, 2, 5, 8, 7, 9 };
        int target = binarysearch(quick, 0, 7, quick.length - 1);
        System.out.println(target);
        // quickSort(quick, 0, quick.length - 1);
        // printarr(quick);
    }

}
