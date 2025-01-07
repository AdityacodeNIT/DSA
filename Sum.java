public class Sum {

    public static int nsum(int num) {
        while (num > 0) {
            return num + nsum(num - 1);
        }
        return 0;
    }

    public static void main(String[] args) {
        int num = 8;
        int sum = nsum(num);
        System.out.println(sum);
        System.out.println(fib(num));

    }

    public static int fib(int n) {
        if (n == 0 || n == 1) {
            return n;
        }
        int fibnm1 = fib(n - 1);
        int fibnm2 = fib(n - 2);
        int fn = fibnm1 + fibnm2;
        return fn;
    }
}
