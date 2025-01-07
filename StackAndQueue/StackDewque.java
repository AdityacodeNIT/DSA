import java.util.*;

public class StackDewque {

    static class Stack {
        static Deque<Integer> Dq = new LinkedList<>();

        public static boolean isEmpty() {
            return Dq == null;
        }

        public static void push(int data) {
            Dq.addFirst(data);
        }

        public static int pop() {
            return Dq.removeFirst();
        }

        public static int peek() {

            return Dq.removeFirst();

        }
    }

    public static void main(String[] args) {
        Stack s = new Stack();

        s.push(3);
        s.push(4);
        s.push(5);
        s.push(6);

        System.out.println(s.peek());

    }
}
