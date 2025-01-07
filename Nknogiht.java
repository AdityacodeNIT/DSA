public class Nknogiht {
    public static void main(String[] args) {
        int n = 4;
        boolean board[][] = new boolean[n][n];
        knight(board, 0, 0, n);
    }

    static void knight(boolean board[][], int row, int col, int knights) {
        if (knights == 0) {
            display(board);
            System.out.println();
            return;

        }
        if (row == board.length - 1 && col == board.length) {
            return;
        }
        if (col == board.length) {
            knight(board, row + 1, 0, knights);
            return;
        }

        if (isSafeBoard(row, col, board)) {
            board[row][col] = true;
            knight(board, row, col + 1, knights - 1);
            board[row][col] = false;
        }
        knight(board, row, col + 1, knights);

    }

    public static void display(boolean board[][]) {
        for (boolean row[] : board) {

            for (boolean element : row) {

                if (element) {
                    System.out.print("K");
                } else {
                    System.out.print("X");
                }

            }
            System.out.println();

        }
    }

    static boolean isSafeBoard(int row, int col, boolean board[][]) {
        if (isValid(row - 2, col - 1, board)) {
            if (board[row - 2][col - 1]) {
                return false;
            }
        }
        if (isValid(row - 2, col + 1, board)) {
            if (board[row - 2][col + 1]) {
                return false;
            }
        }

        if (isValid(row - 1, col + 2, board)) {
            if (board[row - 1][col + 2]) {
                return false;
            }
        }
        if (isValid(row - 1, col - 2, board)) {
            if (board[row - 1][col - 2]) {
                return false;
            }
        }
        return true;
    }

    static boolean isValid(int row, int col, boolean board[][]) {
        if (row > 0 && row < board.length && col > 0 && col < board.length) {
            return true;
        }
        return false;
    }
}
