public class arrayassn {
    public static int search(int array[], int left, int right, int target) {
        int l = left;
        int r = right;

        while (l <= r) {
            int mid = l + (r - l) / 2;
            if (array[mid] == target) {
                return mid;
            } else if (array[mid] > target) {
                r = mid - 1;
            } else {
                l = mid + 1;
            }
        }
        return -1;
    }

    // smallest element
    public static int minSearch(int array[]) {
        int left = 0;
        int right = array.length - 1;
        while (left < right) {

            int mid = left + (right - left) / 2;

            if (mid > 0 && array[mid - 1] > array[mid]) {
                return mid;
            } else if (array[left] <= array[mid] && array[mid] > array[right]) {
                left = mid + 1;
            } else {
                right = mid - 1;

            }

        }
        return left;
    }

    public static int find(int array[], int target) {
        int min = minSearch(array);

        // find in sorted left
        if (array[min] < target && target <= array[array.length - 1]) {
            return search(array, min, array.length - 1, target);
        }
        // find in sorted right
        else {
            return search(array, 0, min, target);

        }

        // binary search in find target in left to right boundary
    }

    public static void main(String[] args) {
        int array[] = { 1, 2, 3, 4, 5, 6, 7 };
        int target = 5;
        int aalu = find(array, target);
        System.out.println(aalu);

    }
}
