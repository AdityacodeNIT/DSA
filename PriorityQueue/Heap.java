import java.util.ArrayList;
import java.util.PriorityQueue;

public class Heap {

    ArrayList<Integer> Al = new ArrayList<>();

    public void add(int data) {
        Al.add(data);
        int x = (Al.size() - 1);
        int par = (x - 1) / 2;
        while (Al.get(x) < Al.get(par)) {
            int temp = Al.get(x);
            Al.set(x, Al.get(par));
            Al.set(par, temp);
        }

    }

    public int peek() {
        return Al.get(0);
    }

    private void Heapify(int i) {
        int left = 2 * i + 1;
        int right = 2 * i + 2;

        int minIdx = i;
        if (left < Al.size() && Al.get(minIdx) > Al.get(left)) {
            minIdx = left;
        }

        if (right < Al.size() && Al.get(minIdx) > Al.get(right)) {
            minIdx = right;
        }

        if (i != minIdx) {
            int temp = Al.get(i);
            Al.set(i, Al.get(minIdx));
            Al.set(minIdx, temp);
            Heapify(minIdx);

        }

    }

    public boolean isEmpty() {
        return (Al.size() == 0);
    }

    public int remove() {
        int first = 0;
        int last = Al.size() - 1;

        int temp = Al.get(last);
        Al.set(last, Al.get(first));
        Al.set(first, temp);

        int p = Al.remove(Al.size() - 1);
        return p;

    }

    public static void main(String[] args) {
        Heap pq = new Heap();
        pq.add(1);
        pq.add(2);
        pq.add(3);
        pq.add(4);
        pq.add(5);

        System.out.println(pq.peek());

    }

}
