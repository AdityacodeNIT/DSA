public class CircularQueue {
    private int data[];
    private static final int DEFAULT_SIZE = 10;

    public CircularQueue() {
        this(DEFAULT_SIZE);
    }

    protected int end = 0;
    protected int front = 0;
    protected int size = 0;

    public CircularQueue(int size) {
        this.data = new int[size];

    }

    public boolean isFull() {
        return size == data.length;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public boolean insert(int item) {
        if (isFull()) {
            return false;
        }
        data[end++] = item;
        end = end % data.length;
        size++;
        return true;

    }

    public int removed() {
        if (isEmpty()) {
            return -1;
        }
        int removed = data[front++];
        front = (front + 1) % data.length;

        size--;
        return removed;

    }

    public void display() {
        if (isEmpty()) {
            System.out.println("Empty");

        }
        int i = front;
        do {
            System.out.print(data[i] + "<-");
            i++;
            i %= data.length;
        } while (i != end);

        System.out.println(end);
    }

    public static void main(String[] args) {
        CircularQueue queue = new CircularQueue(5);
        queue.insert(1);
        queue.insert(2);
        queue.insert(3);
        queue.insert(4);
        queue.insert(5);

        queue.display();
        System.out.println(queue.removed());
    }

}
