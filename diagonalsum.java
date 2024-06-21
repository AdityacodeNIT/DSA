import java.util.Scanner;

public class diagonalsum {

    public static void diagonals(int matrix[][]) {
        int primarydiagonalSu = 0;
        int secondary = 0;

        for (int i = 0; i < matrix.length; i++) {
            // for (int j = 0; j < matrix[0].length; j++) {
            // if (i == j) {
            // primarydiagonalSu = primarydiagonalSu + matrix[i][j];

            // }
            // if (matrix.length == matrix[0].length) {
            // if (i + j == matrix.length-1) {
            // secondary = secondary + matrix[i][j];
            // }
            // } else if (i + j == matrix.length - 1 && i != j) {
            // secondary = secondary + matrix[i][j];
            // }

            // }
            primarydiagonalSu += matrix[i][i];
            if (i != matrix.length - i - 1)

                secondary += matrix[i][matrix.length - i - 1];

        }
        System.out.println(primarydiagonalSu + secondary);
    }

    public static void main(String[] args) {
        int matrix[][] = new int[3][3];
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        diagonals(matrix);
    }
}
