
import java.util.*;

public class MaximumSlidingWindow {
    static class Pair implements Comparable<Pair> {
        int value;
        int idx;

        public Pair(int value, int idx) {
            this.value = value;
            this.idx = idx;
        }

        @Override
        public int compareTo(Pair p2) {
            // descending
            return p2.value - this.value;
        }
    }

    public static void main(String[] args) {
        int arr[] = { 1, 3, -1, -3, 5, 3, 6, 7 };
        int n = arr.length;
        int k = 3;
        int result[] = new int[n - k + 1];
        PriorityQueue<Pair> pq = new PriorityQueue<>();
        for (int i = 0; i < k; i++) {
            pq.add(new Pair(arr[i], i));

        }
        result[0] = pq.peek().value;

        for (int i = k; i < arr.length; i++) {
            if (pq.peek().idx <= i - k && pq.size() > 0) {
                pq.remove();
            }
            pq.add(new Pair(arr[i], i));

            result[i - k + 1] = pq.peek().value;
        }
        for (int i = 0; i < result.length; i++) {
            System.out.println(result[i]);
        }
    }
}
