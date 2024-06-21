import java.util.Scanner;

public class oddoreven {

    public static void odd(int num) {
        int c = num & 1;
        if (c == 1) {
            System.out.println("the number is odd");
        } else {
            System.out.println("The number is even");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        odd(num);

    }
}
