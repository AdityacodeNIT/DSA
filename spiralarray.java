import java.util.Scanner;

public class spiralarray {
    public static void spiral(int matrix[][]) {
        int rowStart = 0;
        int colStart = 0;
        int rowEnd = matrix.length - 1;
        int colEnd = matrix[0].length - 1;

        while (rowStart <= rowEnd && colStart <= colEnd) {
            for (int i = colStart; i <= colEnd; i++) {
                System.out.print(matrix[rowStart][i]);

            }
            rowStart++;

            for (int i = rowStart; i <= rowEnd; i++) {
                System.out.print(matrix[i][colEnd]);
            }
            colEnd--;

            if (rowStart <= rowEnd)
                for (int i = colEnd; i >= colStart; i--) {
                    System.out.print(matrix[rowEnd][i]);
                }
            rowEnd--;

            if (colStart <= colEnd)
                for (int i = rowEnd; i >= rowStart; i--) {
                    System.out.print(matrix[i][colStart]);
                }
            colStart++;

        }
    }

    public static void main(String[] args) {
        int matrix[][] = new int[3][3];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        spiral(matrix);
    }
}
