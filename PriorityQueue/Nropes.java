import java.util.PriorityQueue;

public class Nropes {
    public static void main(String[] args) {
        int rope[] = { 2, 3, 3, 4, 6 };
        int n = rope.length;
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for (int i = 0; i < rope.length; i++) {
            pq.add(rope[i]);
        }
        int sum = 0;

        while (pq.size() > 1) {

            int p1 = pq.remove();
            int p2 = pq.remove();

            sum += p1 + p2;
            pq.add(p1 + p2);
        }
        System.out.println(" Cost of Connecting " + n + " ropes is " + sum);

    }
}
