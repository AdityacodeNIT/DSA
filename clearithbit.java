public class clearithbit {

    public static int clearIthbit(int num, int i) {
        int bitmask = ~(1 << i);

        return num & bitmask;
    }

    public static int clearRangeofBits(int num, int i, int j) {
        int a = (~0) << j + 1;
        int b = (1 << i) - 1;
        int c = a | b;
        return num & c;

    }

    public static void isPowerOfTwo(int num) {
        if ((num & num - 1) == 0) {
            System.out.println(" yes " + num + " is a power of 2");
        } else {
            System.out.println("it is not a power of 2");
        }

    }

    public static int numsetbits(int num) {
        int count = 0;
        while (num != 0) {
            if ((num & 1) != 0) {
                count++;
            }
            num = num >> 1;

        }
        return count;
    }

    public static void main(String[] args) {

        int num = 16;
        int i = 2;
        int j = 4;

        System.out.println(clearIthbit(num, i));
        System.out.println(clearRangeofBits(num, i, j));
        isPowerOfTwo(num);
        System.out.println(numsetbits(num));

    }
}
