import java.util.ArrayList;
import java.util.Collections;

public class MergeBst {
    static class Node {
        int data;
        Node left;
        Node right;

        public Node(int data) {
            this.data = data;
            this.left = this.right = null;
        }
    }

    public static void InorderReversal(Node root, ArrayList<Integer> Al) {
        if (root == null) {
            return;
        }
        InorderReversal(root.left, Al);
        Al.add(root.data);
        InorderReversal(root.right, Al);

    }

    public static void PreOrder(Node root) {
        if (root == null) {
            return;
        }

        System.out.println(root.data);
        PreOrder(root.left);
        PreOrder(root.right);

    }

    public static Node mErgedBst(Node root1, Node root2) {
        ArrayList<Integer> Al = new ArrayList<>();
        InorderReversal(root1, Al);
        InorderReversal(root2, Al);
        Collections.sort(Al);

        Node root = createBst(Al, 0, Al.size() - 1);
        return root;

    }

    public static Node createBst(ArrayList<Integer> al, int st, int end) {
        if (st > end) {
            return null;
        }
        int mid = findMid(st, end);

        Node root3 = new Node(al.get(mid));
        root3.left = createBst(al, st, mid - 1);
        root3.right = createBst(al, mid + 1, end);
        return root3;
    }

    public static int findMid(int st, int end) {
        return (st + end) / 2;
    }

    public static void main(String[] args) {
        Node root1 = new Node(2);
        root1.left = new Node(1);
        root1.right = new Node(4);

        Node root2 = new Node(9);
        root2.left = new Node(3);
        root2.right = new Node(12);
        Node root = mErgedBst(root1, root2);
        PreOrder(root);

    }
}
