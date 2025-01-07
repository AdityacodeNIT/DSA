public class Recursin2 {
    public static void main(String[] args) {
        int n = 5;
        // print(n);
        printReverse(n);
    }

    static void print(int n) {
        if (n == 1) {
            System.out.println(n);
            return;
        }
        System.out.println(n);
        print(n - 1);
    }

    static void printReverse(int n) {
        if (n == 1) {
            System.out.println(n);
            return;
        }
        printReverse(n - 1);
        System.out.println(n);
    }
}
