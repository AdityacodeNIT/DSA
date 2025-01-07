public class SumOfDigits {
    public static void main(String[] args) {
        int n = 0;
        System.out.println(sumDigit(n));
    }

    static int sumDigit(int n) {
        if (n % 10 == n) {
            return n;
        } else {
            int p = n % 10 + sumDigit(n / 10);
            return p;
        }

    }
}
