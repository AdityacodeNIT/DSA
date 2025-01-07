import java.util.ArrayList;

public class Stackk {
    static class Stack {

        static ArrayList<Integer> list = new ArrayList<>();

        public static Boolean isEmpty() {
            return list.size() == 0;
        }

        public static void push(int data) {
            list.add(data);
        }

        public static int pop() {

            if (isEmpty()) {
                return -1;
            }
            int a = list.remove(list.size() - 1);
            return a;

        }

        public static int peak() {

            if (isEmpty()) {
                return -1;
            }
            return list.get(list.size() - 1);

        }
    }

    public static void main(String[] args) {
        Stack s = new Stack();

        s.push(1);
        s.push(2);
        s.push(3);

        while (!s.isEmpty()) {
            System.out.println(s.peak());
            s.pop();

        }

    }

}
