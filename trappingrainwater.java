public class trappingrainwater {

    public static int trappedWater(int array[]) {
        // caculate left max boundary;
        int leftMax[] = new int[array.length];
        leftMax[0] = array[0];

        for (int i = 1; i < array.length; i++) {
            leftMax[i] = Math.max(array[i], leftMax[i - 1]);
        }

        // calculate right max boundry;

        int RightMax[] = new int[array.length];

        RightMax[array.length - 1] = array[array.length - 1];

        for (int i = array.length - 2; i >= 0; i--) {
            RightMax[i] = Math.max(array[i], RightMax[i + 1]);
        }

        // loop

        int trappedWater = 0;

        if (array.length == 2) {
            trappedWater = 0;
        }

        else {
            for (int i = 0; i < array.length; i++) {
                int waterLevel = Math.min(leftMax[i], RightMax[i]);
                trappedWater += waterLevel - array[i];
            }
        }
        return trappedWater;
    }

    public static void main(String[] args) {
        int array[] = { 12, 2, 0, 1, 0, 7, 9 };
        int water = trappedWater(array);
        System.out.println(water + " m^3");
    }
}
