import java.util.*;

public class MajorityElement {
    public static void main(String[] args) {
        int nums[] = { 1, 3, 3, 5, 7, 3 };
        HashMap<Integer, Integer> hm = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {

            hm.put(nums[i], hm.getOrDefault(nums[i], 0) + 1);
        }

        System.out.println(hm.get(3));
    }
}
