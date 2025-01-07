import java.util.ArrayList;

public class PairSumRealTwo {

    public static Boolean twoPointer(ArrayList<Integer> Sorted, int target) {
        int k = -1;
        int n = Sorted.size();
        for (int i = 0; i < Sorted.size(); i++) {
            if (Sorted.get(i) > Sorted.get(i + 1)) {
                k = i;
                break;
            }
        }
        int lp = k + 1;
        int rp = k;

        while (lp != rp) {
            if (Sorted.get(lp) + Sorted.get(rp) == target) {
                return true;
            }

            if (Sorted.get(lp) + Sorted.get(rp) < target) {
                lp = (lp + 1) % n;
            }

            else {
                rp = (n + rp - 1) % n;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        ArrayList<Integer> Sorted = new ArrayList<>();

        Sorted.add(11);
        Sorted.add(15);
        Sorted.add(6);
        Sorted.add(8);
        Sorted.add(9);
        Sorted.add(10);

        int target = 16;

        if (twoPointer(Sorted, target)) {
            System.out.println("sOLUTION  Exists");
        } else {
            System.out.println("do not exist");
        }

    }
}
