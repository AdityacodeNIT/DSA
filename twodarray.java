import java.util.Scanner;

public class twodarray {
    public static void main(String[] args) {
        int matrix[][] = new int[3][4];
        Scanner sc = new Scanner(System.in);
        int r = 3;
        int c = 4;
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                System.out.print(matrix[i][j]);
            }
            System.out.println();
        }
    }

}
