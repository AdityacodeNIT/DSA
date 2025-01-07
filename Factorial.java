public class Factorial {

    public static int factorial(int n) {
        while (n != 0) {

            return n * factorial(n - 1);

        }
        return 1;
    }

    public static void main(String[] args) {
        int num = 4;
        int p = factorial(num);
        System.out.println(p);
    }
}
