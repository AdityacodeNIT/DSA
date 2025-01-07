import java.util.ArrayList;

public class MostWatertwoPointer {
    public static int storeWater(ArrayList<Integer> height) {

        int maxWater = 0;

        int fp = 0;
        int lp = height.size() - 1;

        while (fp < lp) {

            int ht = Math.min(height.get(fp), height.get(lp));
            int width = lp - fp;
            int currWater = ht * width;

            maxWater = Math.max(maxWater, currWater);

            if (height.get(fp) < height.get(lp)) {
                fp++;
            }

            else {
                lp--;
            }

        }

        return maxWater;
    }

    public static void main(String[] args) {
        ArrayList<Integer> Water = new ArrayList<>();

        Water.add(1);
        Water.add(8);
        Water.add(6);
        Water.add(2);
        Water.add(5);
        Water.add(4);
        Water.add(8);
        Water.add(3);
        Water.add(7);

        System.out.println(storeWater(Water));
    }
}
