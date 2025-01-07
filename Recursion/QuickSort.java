import java.util.Arrays;

public class QuickSort {
    public static void main(String[] args) {
        int nums[] = { 1, 4, 2, 3, 7, 5 };
        int high = nums.length - 1;
        quickSort(nums, 0, high);
        Arrays.sort(args);

        System.out.print(Arrays.toString(nums));

    }

    static void quickSort(int nums[], int low, int high) {
        if (low >= high) {
            return;
        }
        int s = low;
        int e = high;
        int mid = s + (e - s) / 2;
        int pivot = nums[mid];

        while (s <= e) {
            while (nums[s] < pivot) {
                s++;
            }
            while (nums[e] > pivot) {
                e--;
            }

            if (s <= e) {
                int temp = nums[e];
                nums[e] = nums[s];
                nums[s] = temp;
                s++;
                e--;
            }

            quickSort(nums, low, e);
            quickSort(nums, s, high);
        }
    }
}
