import java.util.HashSet;
import java.util.*;

public class Hashset {
    public static void main(String[] args) {
        HashSet<Integer> hs = new HashSet<>();
        hs.add(5);
        hs.add(2);
        hs.add(1);
        hs.add(6);
        System.out.println(hs);

        System.out.println(hs.contains(4));
        System.out.println(hs.size());
        System.out.println(hs.isEmpty());

     

        for (Integer num : hs) {
            System.out.println(num);
        }

        // linked HashSet()

        LinkedHashSet<Integer> lhs = new LinkedHashSet<>();
        lhs.add(3);
        lhs.add(4);
        lhs.add(5);
        lhs.add(6);
        lhs.add(7);
        lhs.add(8);

        for (Integer nums : lhs) {
            System.out.println(nums);
        }
        lhs.remove(4);
        System.out.println(lhs);

    }
}
