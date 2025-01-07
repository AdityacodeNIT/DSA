public class Pattern {
    public static void main(String[] args) {
        int r = 4;
        pattern(r, 0);
    }

    static void pattern(int row, int col) {
        if (row == 0) {
            return;
        }
        if (col < row) {

            pattern(row, col + 1);
            System.out.print("*");
        } else {

            pattern(row - 1, 0);
            System.err.println();

        }

    }
}
