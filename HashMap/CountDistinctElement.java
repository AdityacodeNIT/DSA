import java.util.HashSet;

public class CountDistinctElement {

    public static void countDistinctElement(int nums[]) {
        HashSet<Integer> hs = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            hs.add(nums[i]);
        }

        System.out.println(hs.size());

    }

    public static void main(String[] args) {
        int nums[] = { 1, 2, 3, 4, 5, 6, 5, 6, 7, 6, 7, 8 };
        countDistinctElement(nums);
    }
}
