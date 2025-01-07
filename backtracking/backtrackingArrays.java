public class backtrackingArrays {

    public static void backtracking(int nums[], int index, int val) {
        if (index == nums.length) {
            return;
        }
        nums[index] = val;
        backtracking(nums, index + 1, val + 1);
        nums[index] = nums[index] - 2;
    }

    public static void main(String[] args) {
        int nums[] = new int[5];
        backtracking(nums, 0, 1);

        for (int i = 0; i < nums.length; i++) {
            System.out.println(nums[i]);
        }

    }
}
