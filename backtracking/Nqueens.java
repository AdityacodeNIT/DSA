public class Nqueens {

    public static void main(String[] args) {
        int n = 4;
        char board[][] = new char[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                board[i][j] = 'X';
            }
        }

        nqueens(board, 0);

        System.out.println("total ways to place them in the given chess board is " + count);
    }

    static int count = 0;

    public static void nqueens(char board[][], int row) {

        if (row == board.length) {
            count++; // the count is incremented before printing itjust for fun it will we printed no issues
            printBoard(board);

            return;
        }
        for (int col = 0; col < board.length; col++) {
            if (issafe(board, row, col)) {
                board[row][col] = 'q';
                nqueens(board, row + 1);
                board[row][col] = 'X'; // the backtracking step that we are doing
            }
        }
    }

    public static boolean issafe(char board[][], int row, int column) {

        // Vertical Upwards Movement

        for (int i = row - 1; i >= 0; i--) {
            if (board[i][column] == 'q') {
                return false;
            }
        }

        // diagonal left up movements
        for (int i = row - 1, j = column - 1; i >= 0 && j >= 0; i--, j--) {

            if (board[i][j] == 'q') {
                return false;
            }
        }

        // digonal right upward movements

        for (int i = row - 1, j = column + 1; i >= 0 && j < board.length; i--, j++) {

            if (board[i][j] == 'q') {
                return false;
            }
        }

        return true;

    }

    public static void printBoard(char board[][]) {
        System.out.println("Arrangement " + count);
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {

                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }

}
