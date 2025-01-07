import java.util.*;

public class path {
    public static void main(String[] args) {
        int nums[][] = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
        int row = nums.length;
        int col = nums[0].length;
        String p = "";

        // System.out.println(count(row, col, nums));
        step(row, col, p);
        System.out.println(stepint(row, col, p));
        System.out.println(stepintdiagonal(row, col, p));
        boolean maze[][] = {
                { true, true, true },
                { true, false, true },
                { true, true, true }
        };

        pathRestriction(p, 0, 0, maze);
    }

    // static int count(int r, int c, int nums[][]) {
    // if (r < 0 || c < 0) {
    // return 0; // Out of bounds
    // }
    // if (r == 1 && c == 1) {
    // System.out.println(nums[r][c]);
    // return 1;
    // }
    // int right = count(r, c - 1, nums);
    // int down = count(r - 1, c, nums);

    // }

    static void step(int r, int c, String p) {
        if (r == 1 && c == 1) {
            System.out.println(p);
            return;
        }

        if (r > 1) {
            step(r - 1, c, p + 'D');
        }

        if (c > 1) {
            step(r, c - 1, p + 'R');
        }

    }

    static ArrayList<String> stepint(int r, int c, String p) {
        // ArrayList<String> al = new ArrayList<>();

        if (r == 1 && c == 1) {
            ArrayList<String> al = new ArrayList<>();
            al.add(p);
            return al;
        }

        ArrayList<String> al = new ArrayList<>();

        if (r > 1) {
            al.addAll(stepint(r - 1, c, p + 'D'));
        }

        if (c > 1) {

            al.addAll(stepint(r, c - 1, p + 'R'));
        }
        return al;

    }

    static ArrayList<String> stepintdiagonal(int r, int c, String p) {
        // ArrayList<String> al = new ArrayList<>();

        if (r == 1 && c == 1) {
            ArrayList<String> al = new ArrayList<>();
            al.add(p);
            return al;
        }

        ArrayList<String> al = new ArrayList<>();

        if (r > 1 && c > 1) {
            al.addAll(stepintdiagonal(r - 1, c - 1, p + 'V'));
        }

        return al;

    }

    static void pathRestriction(String p, int r, int c, boolean maze[][]) {
        if (r == maze.length - 1 && c == maze[0].length - 1) {
            System.out.println(p);
            return;
        }

        if (!maze[r][c]) {
            return;
        }

        if (r < maze.length - 1) {
            pathRestriction(p + 'D', r + 1, c, maze);
        }

        if (c < maze[0].length - 1) {
            pathRestriction(p + 'R', r, c + 1, maze);
        }

    }
}
