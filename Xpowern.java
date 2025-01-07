public class Xpowern {

    public static int power(int i, int n) {
        if (n == 0) {
            return 1;
        }
        return i * power(i, n - 1);

    }

    public static void main(String[] args) {
        int i = 3;
        int j = -1;
        System.err.println(power(i, j));
    }

}
