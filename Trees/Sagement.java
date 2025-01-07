
public class Sagement {

    public static void main(String args[]) {
        int arr[] = { 3, 8, 6, 7, -2, -8, 4, 9 };
        Sagement tree = new Sagement(arr);
        tree.display();
    }

    private class Node {
        int data;
        int startInterval;
        int endInterval;
        Node left;
        Node right;

        public Node(int startInterval, int endInterval) {
            this.startInterval = startInterval;
            this.endInterval = endInterval;
        }

    }

    Node root;

    public Sagement(int arr[]) {
        this.root = constructTree(arr, 0, arr.length - 1);
    }

    private Node constructTree(int arr[], int start, int end) {
        if (start == end) {
            Node leaf = new Node(start, end);
            leaf.data = arr[start];
            return leaf;
        }

        Node node = new Node(start, end);

        int mid = (start + end) / 2;

        node.left = new Node(start, mid);
        node.right = new Node(mid, end);
        node.data = node.left.data + node.right.data;
        return node;

    }

    public void display() {
        display(this.root);
    }

    private void display(Node node) {
        String Str = "";
        if (node.left != null) {
            Str = Str + "Interval=[" + node.left.startInterval + "-" + node.left.endInterval + "]and data:"
                    + node.left.data + "=>";
        } else {
            Str = Str + "No left Child";
        }

        // for current data;
        Str = Str + "Interval=[" + node.startInterval + "-" + node.endInterval + "]and data:"
                + node.data + "=>";

        // for the right section
        if (node.right != null) {
            Str = Str + "Interval=[" + node.right.startInterval + "-" + node.right.endInterval + "]and data:"
                    + node.right.data + "=>";
        } else {
            Str = Str + "No left Child";
        }

        System.out.println(Str);

        if (node.left != null) {
            display(node.left);
        }

        if (node.right != null) {
            display(node.right);
        }

    }

    // Querry
    public int query(int qsi, int qei) {
        return this.query(this.root, qsi, qei);

    }

    private int query(Node node, int qsi, int qei) {
        if (node.startInterval >= qsi && node.endInterval <= qei) {
            // node is compltely inside the Querry
            return node.data;
        }

        else if (node.startInterval >= qei || node.endInterval <= qsi) {
            // node is compltely inside the Querry
            return 0;
        }

        else {
            return this.query(node.left, qsi, qei) + this.query(node.right, qsi, qei);
        }
    }

    public void update(int index, int value) {
        this.root.data = update(this.root, index, value);
    }

    public int update(Node node, int index, int value) {
        if (index >= node.startInterval && index <= node.endInterval) {
            if (index == node.startInterval && index == node.endInterval) {
                node.data = value;
                return node.data;
            } else {
                int leftAns = update(node.left, index, value);
                int rightAns = update(node.right, index, value);

                node.data = leftAns + rightAns;

                return node.data;

            }
        }
        return node.data;

    }

}
