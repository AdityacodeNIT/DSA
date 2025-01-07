public class Recursion1 {
    public static void main(String[] args) {
        // write a function that prints hello world
        // print(1);
        int n = 5;
        int fib[] = new int[n + 1];
        System.out.println(fibonacci(n, fib));
    }

    // static void print(int n) {
    // // This is called as base condition in recursion.
    // if (n == 5) {
    // System.out.println(n);
    // return;
    // }
    // System.out.println(n);
    // // if a fucntion is called again and again you can
    // // treat is as a seperate cell in stock;
    // print(n + 1);
    // }

    static int fibonacci(int n, int[] fib) {
        if (n < 2) {
            return n;
        }
        if (fib[n] != 0) {
            return fib[n];
        }
        fib[n] = fibonacci(n - 1, fib) + fibonacci(n - 2, fib);

        return fib[n];
    }

}