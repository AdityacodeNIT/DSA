public class binarytwodecimal {

    public static void binary(int num) {
        int bineq = 0;
        int i = 0;
        while (num > 0) {
            bineq = bineq + num % 2 * (int) Math.pow(10, i);

            i++;
            num = num / 2;

        }
        System.out.println(bineq);

    }

    public static int fastExpo(int a, int n) {
        int ans = 1;
        while (n > 0) {
            if ((n & 1) != 0) {
                ans = ans * a;

            }
            a = a * a;
            n = n >> 1;
        }
        return ans;
    }

    public static void main(String[] args) {
        int num = 15;
        binary(num);
        System.out.println(fastExpo(5, 3));
    }
}
