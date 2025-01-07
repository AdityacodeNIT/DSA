public class GridWays {

    public static int gridWays(int row, int col, int n, int m) {

        if (row == n - 1 && col == m - 1) {
            // printGrid(grid, n, m);
            return 1;

        }

        else if (row == n || col == m) {

            return 0;

        }

        // for (int j = col; j < m; j++) {
        int w1 = gridWays(row + 1, col, n, m);
        // }

        int w2 = gridWays(row, col + 1, n, m);
        return w1 + w2;
    }

    // public static void printGrid(char grid[][], int n, int m) {
    // for (int i = 0; i < n; i++) {
    // for (int j = 0; j < m; j++) {
    // System.out.print(grid[i][j]);

    // }
    // System.out.println();
    // }
    // }

    public static void main(String[] args) {
        int n = 3;
        int m = 3;
        int row = 0;
        int column = 0;
        // char grid[][] = new char[n][m];
        int h = gridWays(row, column, n, m);
        System.out.println(h);

    }
}
