import java.util.*;

public class DequeA {
    public static void main(String[] args) {
        Deque<Integer> Dq = new LinkedList<>();

        Dq.addFirst(3);
        Dq.addLast(4);
        Dq.addFirst(6);
        System.out.println(Dq);

    }
}
