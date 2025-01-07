import java.util.Scanner;

public class ComplexDemo {
    public static void main(String[] args) {
        Complex c = new Complex();
        Scanner sc = new Scanner(System.in);
        c.sum(3, 4, 5, 6);
        System.out.println();
        c.diff(3, 4, 5, 6);
        System.out.println();
        c.mul(3, 4, 5, 6);
    }
}

class Complex {
    void sum(int x1, int x2, int z1, int z2) {
        int sumReal = x1 + x2;
        int sumImaginary = z1 + z2;
        System.out.print(sumReal + " + " + sumImaginary + "i");
    }

    void diff(int x1, int x2, int z1, int z2) {
        int diffReal = x1 - x2;
        int diffImaginary = z1 - z2;
        System.out.print(diffReal + " + " + diffImaginary + "i");
    }

    void mul(int x1, int x2, int z1, int z2) {
        int mulReal = x1 * x2 - z1 * z2;
        int mulImaginary = x1 * z2 + x2 * z1;
        System.out.print(mulReal + " + " + mulImaginary + "i");
    }
}
