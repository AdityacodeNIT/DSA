public class BinarySearchTree {
    public class Node {
        private int value;
        private int Height;
        private Node left;
        private Node right;

        public Node(int value) {
            this.value = value;
        }

        public int getValue() {
            return value;
        }

        private Node root;

        public void display() {
            display(root, "Root Node");
        }

        public boolean isEmpty() {
            return root == null;
        }

        public void display(Node node, String details) {
            if (node == null) {
                return;
            }

            System.out.print(details + node.getValue());

            display(node.left, "Left Child of the node" + node.getValue());
            display(node.right, "right Child of the node" + node.getValue());

        }

    }
}
