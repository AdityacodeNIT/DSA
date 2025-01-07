import java.util.PriorityQueue;

public class pqBasics {
    public static void main(String[] args) {
        int arr[] = { 1, 3, 4, 5, 6, 3, 9 };
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for (int i = 0; i < arr.length; i++) {
            pq.add(arr[i]);
        }
        System.out.println(pq);
    }
}
