import java.util.Scanner;

public class transpose {

    public static void sortedSearch(int matrix[][]) {

        for (int i = 0; i < matrix[0].length; i++) {

            for (int j = 0; j < matrix.length; j++) {
                System.out.print(matrix[j][i]);
            }
            System.out.println();
        }

    }

    public static void main(String[] args) {
        int matrix[][] = new int[3][2];

        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        sortedSearch(matrix);

    }

}
