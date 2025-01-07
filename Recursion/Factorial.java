public class Factorial {
    public static void main(String[] args) {
        int n = 5;
        int p = factorial(n);
        System.out.println(p);
    }

    static int factorial(int n) {
        if (n == 1) {
            return 1;
        }
        int p = n * factorial(n - 1);
        return p;
    }
}
