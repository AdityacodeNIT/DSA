import java.util.Comparator;
import java.util.PriorityQueue;

public class PriorityWueue {
    public static void main(String[] args) {
        // PriorityQueue<Integer> pq = new PriorityQueue<>();
        // reverse Order
        PriorityQueue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder());
        pq.add(8);
        pq.add(4);
        pq.add(5);
        pq.add(6);
        pq.add(7);

        while (!pq.isEmpty()) {
            System.out.println(pq.peek());
            pq.remove();
        }

    }
}