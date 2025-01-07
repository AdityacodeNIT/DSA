public class Reverse {
    public static void main(String[] args) {
        int n = 1;
        System.out.println(rev(n));
        ;
    }

    static int rev(int n) {
        int digit = (int) (Math.log10(n)) + 1;
        return helper(n, digit);
    }

    static int helper(int n, int digits) {
        if (n % 10 == n) {
            return n;
        }
        return (int) ((n % 10) * Math.pow(10, digits - 1)) + helper(n / 10, digits - 1);
    }

    static boolean palindrome(int n) {
        if (n == rev(n)) {
            return true;
        } else {
            return false;
        }
    }
}
