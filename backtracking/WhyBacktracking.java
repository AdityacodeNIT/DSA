import java.util.Arrays;

public class WhyBacktracking {
    public static void main(String[] args) {

        String p = "";
        boolean maze[][] = {
                { true, true, true },
                { true, true, true },
                { true, true, true }
        };

        int path[][] = new int[maze.length][maze[0].length];

        pathRestriction(p, 0, 0, maze);
        pathR(p, 0, 0, maze, 1, path);

    }

    static void pathRestriction(String p, int r, int c, boolean maze[][]) {
        if (r == maze.length - 1 && c == maze[0].length - 1) {
            System.out.println(p);
            return;
        }

        if (!maze[r][c]) {
            return;
        }

        maze[r][c] = false;

        if (r < maze.length - 1) {
            pathRestriction(p + 'D', r + 1, c, maze);
        }

        if (c < maze[0].length - 1) {
            pathRestriction(p + 'R', r, c + 1, maze);
        }

        if (r > 0) {
            pathRestriction(p + 'U', r - 1, c, maze);
        }
        if (c > 0) {
            pathRestriction(p + 'L', r, c - 1, maze);
        }

        // if we try to go into all the paths this is causing the stackoverflow in the
        // function why it is happening that we will know further but it is causing so
        // that we know
        // this is happening because the finction stucks in a loop so
        // we use a method to marks the changes , what we have done is we make every
        // cell that is visited as true.

        // 5) But this will also pose an issue that we are not able to get through each
        // and every path so that's why we use backtracking
        // after every function call back we revert the changes and make the cell as
        // true;

        maze[r][c] = true;

    }

    static void pathR(String p, int r, int c, boolean maze[][], int step, int path[][]) {
        if (r == maze.length - 1 && c == maze[0].length - 1) {
            path[r][c] = step;
            for (int arr[] : path) {
                System.out.println(Arrays.toString(arr));
            }
            System.out.println(p);
            System.out.println();
            return;
        }

        if (!maze[r][c]) {
            return;
        }

        maze[r][c] = false;
        path[r][c] = step;

        if (r < maze.length - 1) {
            pathR(p + 'D', r + 1, c, maze, step + 1, path);
        }

        if (c < maze[0].length - 1) {
            pathR(p + 'R', r, c + 1, maze, step, path);
        }

        if (r > 0) {
            pathR(p + 'U', r - 1, c, maze, step + 1, path);
        }
        if (c > 0) {
            pathR(p + 'L', r, c - 1, maze, step + 1, path);
        }

        // if we try to go into all the paths this is causing the stackoverflow in the
        // function why it is happening that we will know further but it is causing so
        // that we know
        // this is happening because the finction stucks in a loop so
        // we use a method to marks the changes , what we have done is we make every
        // cell that is visited as true.

        // 5) But this will also pose an issue that we are not able to get through each
        // and every path so that's why we use backtracking
        // after every function call back we revert the changes and make the cell as
        // true;

        maze[r][c] = true;
        path[r][c] = 0;

    }
}
