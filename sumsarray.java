import java.util.Scanner;

public class sumsarray {

    public static int sortedSearch(int matrix[][]) {
        int sum = 0;
        for (int i = 1; i < matrix.length - 1; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                sum = sum + matrix[i][j];
            }

        }

        return sum;
    }

    public static void main(String[] args) {
        int matrix[][] = new int[3][3];
        int key = 3;
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        int result = sortedSearch(matrix);

        System.out.println("the sum of the second row is" + result);
    }

}
