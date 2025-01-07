import java.util.PriorityQueue;

public class abc {

    public static int nthUglyNumber(int n) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for (int i = 1; i < n; i++) {
            if (i % 2 == 0 || i % 3 == 0 || i % 4 == 0) {
                pq.add(i);
            }

        }
        return pq.peek();
    }

    public static void main(String[] args) {
        int n = 10;
        System.out.println(nthUglyNumber(n));
    }
}


         
       