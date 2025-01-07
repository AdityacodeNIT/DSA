
public class Sudokusolver {

    public static boolean sudokuSolver(int sudoku[][], int row, int col) {

        if (row == 9 && col == 0) {
            return true;
        }

        int nextrow = row;
        int nextcol = col + 1;

        if (col + 1 == 9) {
            nextrow = row + 1;
            nextcol = 0;
        }

        if (sudoku[row][col] != 0) {
            return sudokuSolver(sudoku, nextrow, nextcol);
        }

        for (int digit = 1; digit <= 9; digit++) {
            if (isRightInput(sudoku, row, col, digit)) {
                sudoku[row][col] = digit;
                if (sudokuSolver(sudoku, nextrow, nextcol)) {
                    return true;
                }

            }
            sudoku[row][col] = 0;
        }
        return false;
    }

    public static void printSudoku(int board[][]) {
        // System.out.println("Arrangement " + count);
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {

                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static boolean isRightInput(int sudoku[][], int row, int col, int digit) {
        // row
        for (int i = 0; i < 9; i++) {
            if (sudoku[i][col] == digit) {
                return false;
            }
        }
        // col
        for (int j = 0; j < 9; j++) {
            if (sudoku[row][j] == digit) {
                return false;
            }
        }
        // Grid
        int sr = (row / 3) * 3;
        int sl = (col / 3) * 3;
        for (int k = sr; k < sr + 3; k++) {
            for (int m = sl; m < sl + 3; m++) {
                if (sudoku[k][m] == digit) {
                    return false;
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        // int n = 9;
        int sudoku[][] = { { 3, 4, 0, 0, 0, 7, 0, 2, 6 },
                { 0, 2, 0, 0, 0, 4, 8, 0, 1 },
                { 0, 0, 1, 2, 0, 5, 0, 0, 0, },

                { 2, 5, 0, 6, 0, 0, 0, 0, 0 },

                { 6, 8, 0, 9, 0, 0, 3, 4, 0 },

                { 0, 1, 0, 4, 0, 2, 0, 0, 8 },

                { 1, 6, 0, 0, 8, 9, 0, 3, 0 },
                { 4, 0, 9, 0, 2, 0, 6, 0, 0 },
                { 0, 0, 8, 7, 4, 6, 2, 0, 0 } };

        int row = 0;
        int col = 0;

        if (sudokuSolver(sudoku, row, col)) {
            System.out.println("solution exists");
            printSudoku(sudoku);
        } else {
            System.out.println("solution does not exist");
        }

    }
}
