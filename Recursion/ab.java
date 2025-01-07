import java.util.*;

public class ab {

    public static List<List<Integer>> permute(int[] nums) {

        List<List<Integer>> l1 = new ArrayList<>();
        ArrayList<Integer> al = new ArrayList<>();

        permutation(nums, al, l1, 0); // Added extra param depth for analysis
        return l1;

    }

    @SuppressWarnings("rawtypes")
    public static void permutation(int nums[], ArrayList<Integer> al, List<List<Integer>> l1, int depth) {

        // Track the depth of the recursion
        String indent = "  ".repeat(depth); // Indent the logs based on depth

        // Log the current state before checking the base case
        System.out.println(indent + "-> Entering depth " + depth + ", al: " + al);

        if (al.size() == nums.length) {
            System.out.println(indent + "Base case reached, adding " + al + " to l1");
            l1.add(new ArrayList(al));
            System.out.println(indent + "<- Returning from depth " + depth);
            return;
        }

        for (int i = 0; i < nums.length; i++) {
            if (al.contains(nums[i])) {
                System.out.println(indent + "Skipping " + nums[i] + " as it's already in " + al);
                continue;
            }

            al.add(nums[i]);
            System.out.println(indent + "Added " + nums[i] + ", al now: " + al);

            // Recursion
            permutation(nums, al, l1, depth + 1);

            // Backtracking step
            al.remove(al.size() - 1);
            System.out.println(indent + "Backtracking: Removed last element, al now: " + al);
        }

        System.out.println(indent + "<- Returning from depth " + depth);
    }

    public static void main(String[] args) {
        int nums[] = { 1, 2, 3 };
        List<List<Integer>> al = new ArrayList<>();
        al = permute(nums);
        System.out.println("Final permutations: " + al);
    }
}
