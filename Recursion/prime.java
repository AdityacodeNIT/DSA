public class prime {
    public static void main(String[] args) {
        int n = 40;
        boolean prime[] = new boolean[n + 1];
        isprime(n, prime);
    }

    static void isprime(int n, boolean prime[]) {
        if (n <= 1) {
            return;
        }
        // int c = 2;
        // while (c * c < n) {
        // if (n % c != 0) {
        // System.out.println(n);
        // }
        // c++;
        // n = n - 1;
        // }
        for (int i = 2; i * i <= n; i++) {
            if (!prime[i]) {
                for (int j = i * 2; j <= n; j = j + i) {
                    prime[j] = true;
                }
            }
        }

        for (int i = 2; i <= n; i++) {
            if (!prime[i]) {
                System.out.println(i);
            }
        }
    }
}
