import java.util.*;

public class BST {
    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    public static Node insert(Node root, int val) {
        if (root == null) {
            root = new Node(val);
            return root;
        }
        if (root.data > val) {
            root.left = insert(root.left, val);
        } else {
            root.right = insert(root.right, val);
        }

        return root;
    }

    public static void InorderReversal(Node root) {
        if (root == null) {
            return;
        }
        InorderReversal(root.left);
        System.out.print(root.data);
        InorderReversal(root.right);
    }

    public static boolean bstSearch(Node root, int key) {
        if (root == null) {
            return false;
        }
        if (root.data == key) {
            return true;
        }
        if (root.data < key) {
            return bstSearch(root.right, key);
        } else {
            return bstSearch(root.left, key);
        }

    }

    public static Node deleteNode(Node root, int val) {
        if (root.data > val) {
            root.left = deleteNode(root.left, val);
        } else if (root.data < val) {
            root.right = deleteNode(root.right, val);
        } else {
            // leaf Node
            if (root.left == null && root.right == null) {
                return null;
            }
            // one child
            if (root.left == null) {
                return root.right;
            } else if (root.right == null) {
                return root.left;
            }

            // case 3
            Node Is = inorderSuccessor(root.right);
            root.data = Is.data;
            root.right = deleteNode(root.right, Is.data);
        }
        return root;
    }

    public static Node inorderSuccessor(Node root) {
        while (root.left != null) {
            root = root.left;
        }
        return root;
    }

    public static void PrintINrange(Node root, int n1, int n2) {
        if (root == null) {
            return;
        }

        if (n1 < root.data) {
            PrintINrange(root.left, n1, n2);
        }

        if (n1 <= root.data && n2 >= root.data) {
            System.out.println(root.data + " datat");
        }

        if (n2 > root.data) {
            PrintINrange(root.right, n1, n2);
        }
    }

    public static void PrintPath(ArrayList<Integer> path) {
        for (int i = 0; i < path.size(); i++) {
            System.out.println(path.get(i));
        }
    }

    public static boolean ValidateBst(Node root, int minLeft, int maxRight) {
        if (root == null) {
            return true;
        }

        if (root.data <= minLeft || root.data >= maxRight) {
            return false;
        }
        return ValidateBst(root.left, minLeft, root.data) &&
                ValidateBst(root.right, root.data, maxRight);
    }

    public static void rootToLeafPath(Node root, ArrayList<Integer> path) {
        if (root == null) {
            return;
        }
        path.add(root.data);
        if (root.left == null && root.right == null) {
            System.out.println(path);
        }

        rootToLeafPath(root.left, path);
        rootToLeafPath(root.right, path);

        path.remove(path.size() - 1);

    }

    static class Info {
        boolean isBst;
        int size;
        int min;
        int max;

        public Info(boolean isBst, int size, int min, int max) {
            this.isBst = isBst;
            this.size = size;
            this.min = min;
            this.max = max;

        }

    }

    public static int maxBst = 0;

    public static Info largestBst(Node root) {
        if (root == null) {
            return new Info(true, 0, Integer.MAX_VALUE, Integer.MIN_VALUE);
        }
        Info leftInfo = largestBst(root.left);
        Info rightInfo = largestBst(root.right);
        int size = leftInfo.size + rightInfo.size + 1;
        int min = Math.min(root.data, Math.min(leftInfo.min, rightInfo.min));
        int max = Math.max(root.data, Math.min(leftInfo.max, rightInfo.max));
        if (root.data <= leftInfo.max || root.data >= rightInfo.max) {
            return new Info(false, size, min, max);
        }
        if (leftInfo.isBst && rightInfo.isBst) {
            maxBst = Math.max(maxBst, size);
            return new Info(true, size, min, max);
        }

        return new Info(false, size, min, max);

    }

    public static void main(String[] args) {
        int values[] = { 8, 5, 3, 6, 10, 11, 14 };
        Node root = null;
        int min = Integer.MIN_VALUE;
        int max = Integer.MAX_VALUE;
        ArrayList<Integer> path = new ArrayList<>();

        for (int i = 0; i < values.length; i++) {
            root = insert(root, values[i]);

        }
        InorderReversal(root);
        System.out.println(root.data);
        System.out.println(bstSearch(root, 8));
        // deleteNode(root, 1);
        // deleteNode(root, 5);
        // deleteNode(root, 3);

        InorderReversal(root);
        System.out.println();
        PrintINrange(root, 1, 8);
        rootToLeafPath(root, path);
        System.out.println(ValidateBst(root, min, max));
        System.out.println(largestBst(root).size);

    }

}
