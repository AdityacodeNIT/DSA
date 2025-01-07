public class RotatedSorted {
    public static void main(String[] args) {
        int arr[] = { 5, 6, 8, 9, 1, 2, 3 };
        int target = 7;
        int s = 0;
        int e = arr.length;

        System.out.println(isHavingTarget(arr, target, s, e));
    }

    static boolean isHavingTarget(int arr[], int target, int s, int e) {
        int mid = s + (e - s) / 2;
        if (arr[mid] == target) {
            return true;
        }
        if (s > e) {
            return false;
        }

        if (arr[s] <= arr[mid]) {
            if (target >= arr[s] && target <= arr[mid]) {

                return isHavingTarget(arr, target, s, mid - 1);
            } else {
                return isHavingTarget(arr, target, mid + 1, e);
            }
        }
        if (target <= arr[e] && target >= arr[mid]) {
            return isHavingTarget(arr, target, mid + 1, e);
        }
        return isHavingTarget(arr, target, s, mid - 1);

    }
}
