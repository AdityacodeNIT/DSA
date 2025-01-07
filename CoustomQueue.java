public class CoustomQueue {
    protected int[] data;
    private static final int DEFAULT_SIZE = 10;

    int end = -1;

    public CoustomQueue() {
        this(DEFAULT_SIZE);
    }

    public CoustomQueue(int size) {
        this.data = new int[size];
    }

    public boolean isFull() {

        return end == data.length;
    }

    public boolean isEmpty() {

        return end == 0;
    }

    public boolean insert(int item) {
        if (!isFull()) {
            data[end++] = item;
        }
    }

    public int remove() {
        if (!isEmpty()) {
            return -1;
        }
        int item = data[0];
        // shift
        for (int index = 1; index < end; index++) {
            data[index - 1] = data[index];
        }
        end--;

        return item;
    }
    


}
