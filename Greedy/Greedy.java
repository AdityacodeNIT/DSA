public class Greedy {
    public static void main(String[] args) {

        /*** Approach ***/
        // sorted on the basis of end time
        // check if start[i]>=end[i-1] if not change the end of the time stamps to older
        // one
        // because that task has not been done .

        int[] start = { 1, 3, 0, 5, 8, 5 };
        int[] end = { 2, 4, 6, 7, 9, 9 };
        int tasks = 1;

        for (int i = 1; i < start.length; i++) {

            if (start[i] > end[i - 1]) {
                tasks = tasks + 1;
            } else {
                end[i] = end[i - 1];
            }

        }
        System.out.println(tasks);
    }
}
