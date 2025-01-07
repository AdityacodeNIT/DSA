public class NRook {

    public static void nqueens(char board[][], int row) {
        if (row == board.length) {

            printBoard(board);
            count++;
            return;
        }
        for (int j = 0; j < board.length; j++) {
            if (issafe(board, row, j)) {
                board[row][j] = 'q';
                nqueens(board, row + 1);
                board[row][j] = '[';
            }
        }
    }

    public static boolean issafe(char board[][], int row, int column) {

        // Vertical UPwards Movement
        // for (int i = row - 1; i >= 0; i--) {
        // if (board[i][column] == 'q') {
        // return false;
        // }
        // }

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

    static int count = 0;

    public static void printBoard(char board[][]) {
        System.out.println("Arrangement " + count);
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {

                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int n = 5;
        char board[][] = new char[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                board[i][j] = '[';
            }
        }

        nqueens(board, 0);

        System.out.println("total ways to place them in the given chess board is " + count);
    }
}
