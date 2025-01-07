import java.util.ArrayList;

public class PairSumTwoPointerApproach {

    public static Boolean twoPointer(ArrayList<Integer> Sorted, int target) {
        int lp = 0;
        int rp = Sorted.size();

        while (lp != rp) {
            if (lp + rp == target) {
                return true;
            }

            if (lp + rp < target) {
                lp++;
            }

            if (lp + rp > target) {
                rp--;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        ArrayList<Integer> Sorted = new ArrayList<>();

        Sorted.add(1);
        Sorted.add(2);
        Sorted.add(3);
        Sorted.add(4);
        Sorted.add(5);
        Sorted.add(6);

        int target = 5;

        if (twoPointer(Sorted, target)) {
            System.out.println("sOLUTION  Exists");
        }

    }
}
