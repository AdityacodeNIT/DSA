public class Doublell {

    public class Node {
        int data;
        Node next;
        Node prev;

        public Node(int data) {
            this.data = data;
            this.next = null;
            this.prev = null;
        }
    }

    public void addFirst(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = tail = newNode;
            return;
        }
        newNode.next = head;
        head.prev = newNode;
        head = newNode;

    }

    public void addlastst(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = tail = newNode;
            return;
        }
        tail.next = newNode;
        newNode.prev = tail;
        tail = newNode;

    }

    // Remove First
    public int removeFirst() {
        if (head == null) {
            System.out.println("Dll is empty");
            return Integer.MIN_VALUE;
        }
        int val = head.data;
        head = head.next;
        head.prev = null;
        return val;
    }

    public int removeLast() {
        if (tail == null) {
            System.out.println("Dll is empty");
            return Integer.MIN_VALUE;
        }

        int val = tail.data;
        tail = tail.prev;
        tail.next = null;
        return val;
    }

    public void revPrint() {
        Node preva = null;
        Node curr = tail = head;
        Node next;

        while (curr != null) {
            next = curr.next;
            curr.next = preva;
            preva = curr;
            curr = next;
        }
        head = preva;
    }

    public void revaPrint() {
        Node temp = tail;
        while (temp != null) {
            System.out.print(temp.data + " <-> ");
            temp = temp.prev;
        }
        System.out.println();

    }

    public void print() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " <-> ");
            

            temp = temp.next;
        }
        System.out.print("null");
    }

    

    public static Node head;
    public static Node tail;
    public static Node size;

    public static void main(String[] args) {
        Doublell dll = new Doublell();
        dll.addFirst(1);
        dll.addFirst(2);
        dll.addFirst(3);
        dll.addFirst(4);
        dll.addlastst(5);

        System.out.println(dll.removeFirst());
        dll.revaPrint();

        dll.print();

    }
}
