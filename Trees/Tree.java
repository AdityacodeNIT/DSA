import java.util.Scanner;

public class Tree {

    private static class Node {
        int value;
        Node left;
        Node right;

        public Node(int value) {
            this.value = value;

        }

    }

    private Node root;

    public void populate(Scanner sc) {
        System.out.println("Enter the root Node :");
        int value = sc.nextInt();
        root = new Node(value);
        populates(sc, root);

    }

    public void populates(Scanner sc, Node node) {
        System.out.println("Do you want to enter left of node.value : " + node.value);
        boolean left = sc.nextBoolean();
        if (left) {
            System.out.println("Enter the Values " + node.value);
            int value = sc.nextInt();
            node.left = new Node(value);
            populates(sc, node.left);
        }
        System.out.println("Do you want to enter right of node.value " + node.value);
        boolean right = sc.nextBoolean();
        if (right) {
            System.out.println("Enter the Values " + node.value);
            int value = sc.nextInt();
            node.right = new Node(value);
            populates(sc, node.right);
        }
    }

    public void display() {
        display(root, "");
    }

    private void display(Node node, String indent) {
        if (node == null) {
            return;

        }
        System.out.println(indent + node.value);
        display(node.left, indent + "\t");
        display(node.right, indent + "\t");

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Tree tree = new Tree();
        tree.populate(sc);
        tree.display();

    }
}
