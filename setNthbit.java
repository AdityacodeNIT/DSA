public class setNthbit {

    public static int setbit(int num, int i) {
        int bitmask = 1 << i;

        return num | bitmask;
    }

    public static int getNthbit(int num, int i) {

        int bitmask = 1 << i;
        int getValue = num & bitmask;
        if (getValue == 0) {
            return 0;
        } else {
            return 1;
        }

    }

    public static int clearibits(int num, int i) {
        int bitmask = -1 << i;
        return num & bitmask;

    }

    public static int updateNthbit(int num, int i, int update) {

        int bitmask = 1 << i;
        int updateValue = num & bitmask;
        if (updateValue == 0) {
            return 0;
        } else {
            return 1;
        }

    }

    public static void main(String[] args) {
        int num = 15;
        int i = 2;
        int update = 1;
        System.out.println(setbit(num, i));
        System.out.println(getNthbit(num, i));
        System.out.println(updateNthbit(num, i, update));
        System.out.println(clearibits(num, i));
    }
}
