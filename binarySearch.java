public class binarySearch {

    public static int binary(int arrays[], int target) {
        int left = 0;
        int right = arrays.length - 1;
        while (left <= right) {
            int mid = (left + right) / 2;
            if (arrays[mid] == target) {
                return mid;
            } else if (arrays[mid] > target) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }

        }

        return -1;

    }

    public static void main(String[] args) {
        int arrays[] = { 1, 2, 3, 4, 5 };
        int target = 3;
        int b = binary(arrays, target);
        System.out.println(b);

    }

}
