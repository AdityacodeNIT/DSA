import java.util.*;

public class Graphunderstanding {
    public static void main(String[] args) {
        int[][] prerequisites = { { 1, 0 }, { 2, 1 }, { 3, 2 } }; // Corrected prerequisites
        List<List<Integer>> al = new ArrayList<>();
        for (int i = 0; i < 4; i++) { // Adjusted to match the number of courses
            al.add(new ArrayList<>());
        }
        for (int[] prerequisite : prerequisites) {
            al.get(prerequisite[1]).add(prerequisite[0]);
        }
        System.out.println(al.get(0));
    }
}
