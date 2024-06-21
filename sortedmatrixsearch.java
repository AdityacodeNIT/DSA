import java.util.Scanner;

public class sortedmatrixsearch {

    public static int[] sortedSearch(int matrix[][], int key) {

        for (int i = 0; i < matrix.length; i++) {

            int colStart = 0;

            int colEnd = matrix.length - 1;
            while (colStart <= colEnd) {

                int mid = (colStart + colEnd) / 2;
                if (matrix[i][mid] == key) {
                   
                }

                else if (matrix[i][mid] > key) {
                    colEnd = mid - 1;
                }

                else {
                    colStart = mid + 1;
                }

            }

        }
        return null;
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

        int result[] = sortedSearch(matrix, key);

        if (result != null) {
            System.out.println(key + " is found at index " + result[0] + "," + result[1]);
        } else {
            System.out.println(key + " is not found in the matrix");
        }
    }
}
