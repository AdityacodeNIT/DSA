import java.util.ArrayList;

public class MostWater {
    public static int storeWater(ArrayList<Integer> height) {
        int maxWater = 0;

        for (int i = 0; i < height.size(); i++) {
            for (int j = i + 1; j < height.size(); j++) {
                int ht = Math.min(height.get(i), height.get(j));
                int width = j - i;
                int currWater = ht * width;

                maxWater = Math.max(maxWater, currWater);

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
