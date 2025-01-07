public class AVLTrees {
    static class Node {
        private int value;
        private int height;
        private Node left, right;

        public Node(int value) {
            this.value = value;
        }
    }

    private Node root;

    public int height() {
        return height(root);
    }

    private int height(Node node) {
        if (node == null) {
            return -1;

        }
        return node.height;
    }

    public void insert(int value) {
        root = insert(value, root);
    }

    private Node insert(int value, Node node) {
        if (node == null) {
            node = new Node(value);
            return node;
        }

        if (value < node.value) {
            node.left = insert(value, node.left);
        }

        if (value > node.value) {
            node.right = insert(value, node.right);

        }

        node.height = Math.max(height(root.left), height(root.right)) + 1;

        return rotate(node);

    }

    private Node rotate(Node node) {
        if (height(node.left) - height(node.right) > 1) {
            // lefgt heavy
            if (height(node.left.left) - height(node.left.right) > 0) {
                return rightRotate(node);
            }

            if (height(node.left.left) - height(node.left.right) < 0) {
                node.left = leftRotate(node.left);
                return rightRotate(node);

            }

            // rgiht right case

        }

        if (height(node.left) - height(node.right) < -1) {
            // lefgt heavy
            if (height(node.right.left) - height(node.right.right) > 0) {
                return leftRotate(node);
            }

            if (height(node.right.left) - height(node.right.right) > 0) {
                node.right = rightRotate(node.left);
                return leftRotate(node);

            }

            // right right case'

        }
        return node;
    }

    public Node rightRotate(Node p) {
        Node c = p.left;
        Node t = c.right;

        c.right = p;
        p.left = t;

        p.height = Math.max(height(p.left), height(p.right) + 1);

        c.height = Math.max(height(c.left), height(c.right) + 1);
        return c;

    }

    public Node leftRotate(Node c) {
        Node p = c.right;
        Node t = p.left;

        p.left = c;
        c.right = t;

        p.height = Math.max(height(p.left), height(p.right) + 1);
        c.height = Math.max(height(c.left), height(c.right) + 1);
        return p;

    }

    public void populate(int nums[]) {
        for (int i = 0; i < nums.length; i++) {
            insert(nums[i]);
        }
    }

    public static void main(String[] args) {
        AVLTrees trees = new AVLTrees();

        for (int i = 0; i <= 1000; i++) {
            trees.insert(i);
        }

        System.out.println(trees.height());

    }
}