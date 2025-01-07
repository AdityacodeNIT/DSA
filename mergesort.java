import LinkList.Node;

public class mergesort {

    public static void mergeasort(int array[], int si, int ei) {
        if (si >= ei) {
            return;
        }
        int mid = si + (ei - si) / 2;
        mergeasort(array, si, mid);
        mergeasort(array, mid + 1, ei);
        merge(array, si, mid, ei);

    }

    public static void merge(int arr[], int si, int mid, int ei) {
        int temp[] = new int[ei - si + 1];
        int i = si;
        int j = mid + 1;
        int k = 0;

        while (i <= mid && j <= ei) {
            if (arr[i] < arr[j]) {
                temp[k] = arr[i];
                i++;

            } else {
                temp[k] = arr[j];
                j++;

            }
            k++;
        }

        while (i <= mid) {
            temp[k++] = arr[i++];

        }

        while (j <= ei) {

            temp[k++] = arr[j++];

        }

        for (i = 0, k = si; i < temp.length - 1; i++, k++) {
            arr[k] = temp[i];
        }

   
    public static void main(String[] args) {
        int sort[] = { 1, 2, 3, 4, 5 };

        mergeasort(sort, 0, sort.length - 1);
    }
}
