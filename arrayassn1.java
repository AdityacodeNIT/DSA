public class arrayassn1 {

    public static boolean notUnique(int nums[]) {
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == nums[i + 1]) {
                return true;
            }

        }
        return false;
    }

    public static void main(String[] args) {
        int nums[] = { 1, 2, 3, 4, 4, 6, 7 };

        boolean uniq = notUnique(nums);

        System.out.println(uniq);

    }
}
