import java.util.Scanner;

public class countmatrix {

    public static int sortedSearch(int matrix[][], int key) {
        int count = 0;
        for (int i = 0; i < matrix.length; i++) {

            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix[i][j] == key) {
                    count++;
                }
            }

        }
        return count;
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

        int result = sortedSearch(matrix, key);

        if (result != 0) {
            System.out.println("the number of " + key + "'s are" + result);
        } else {
            System.out.println(key + " is not found in the matrix");
        }
    }

}
