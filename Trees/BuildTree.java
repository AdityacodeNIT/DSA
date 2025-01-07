import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class BuildTree {
    static class Node {
        int value;
        Node left;
        Node right;

        Node(int value) {
            this.value = value;
            this.left = null;
            this.right = null;
        }

        static class BinaryTree {

            static int index = -1;

            private Node root;

            // insert elements

            public void populate(Scanner sc) {
                System.out.println("Enter the root node value");
                int value = sc.nextInt();
                root = new Node(value);
                populates(sc, root);
            }

            public void populates(Scanner sc, Node node) {
                System.out.println("Do you want to enter left of node.value" + node.value);
                boolean left = sc.nextBoolean();
                if (left) {
                    System.out.println("Enter the Values" + node.value);
                    int value = sc.nextInt();
                    node.left = new Node(value);
                    populates(sc, node.left);
                }
                System.out.println("Do you want to enter left of node.value" + node.value);
                boolean right = sc.nextBoolean();
                if (right) {
                    System.out.println("Enter the Values" + node.value);
                    int value = sc.nextInt();
                    node.right = new Node(value);
                    populates(sc, node.right);
                }
            }

            Node buildTree(int nodes[]) {
                index++;
                if (nodes[index] == -1) {
                    return null;
                }

                Node newNode = new Node(nodes[index]);
                newNode.left = buildTree(nodes);
                newNode.right = buildTree(nodes);

                return newNode;
            }

            public static void preOrderTraversal(Node root) {
                if (root == null) {
                    return;
                }
                System.out.print(root.value + ", ");
                preOrderTraversal(root.left);
                preOrderTraversal(root.right);
            }

            public static void inOrderTraversal(Node root) {
                if (root == null) {
                    return;
                }
                inOrderTraversal(root.left);
                System.out.print(root.value + ", ");
                inOrderTraversal(root.right);
            }

            public static void postOrderTraversal(Node root) {
                if (root == null) {
                    return;
                }
                postOrderTraversal(root.left);
                postOrderTraversal(root.right);
                System.out.print(root.value + ", ");
            }

            public static void levelOrderTraversal(Node root) {
                if (root == null) {
                    return;
                }
                Queue<Node> q = new LinkedList<>();
                q.add(root);
                q.add(null);

                while (!q.isEmpty()) {
                    Node currNode = q.remove();

                    if (currNode == null) {
                        System.out.println();
                        if (q.isEmpty()) {
                            break;
                        } else {
                            q.add(null);
                        }
                    } else {
                        System.out.print(currNode.value + " ");
                        if (currNode.left != null) {
                            q.add(currNode.left);
                        }
                        if (currNode.right != null) {
                            q.add(currNode.right);
                        }
                    }
                }
            }

            public static void kthNode(Node root, int level, int k) {
                if (root == null) {
                    return;
                }

                if (level == k) {
                    System.out.print(root.value);
                    return;
                }
                kthNode(root.left, level + 1, k);
                kthNode(root.right, level + 1, k);
            }

            public static int treeHeight(Node root) {
                if (root == null) {
                    return 0;
                }
                int lh = treeHeight(root.left);
                int rh = treeHeight(root.right);

                return Math.max(lh, rh) + 1;
            }

            public static int treeNodeCount(Node root) {
                if (root == null) {
                    return 0;
                }
                int lc = treeNodeCount(root.left);
                int rc = treeNodeCount(root.right);

                return lc + rc + 1;
            }

            public static int sumNode(Node root) {
                if (root == null) {
                    return 0;
                }
                int lc = sumNode(root.left);
                int rc = sumNode(root.right);

                return lc + rc + root.value;
            }

            public static int treeDiameter(Node root) {
                if (root == null) {
                    return 0;
                }
                int lh = treeHeight(root.left);
                int rh = treeHeight(root.right);
                int selfDiam = lh + rh + 1;
                int ld = treeDiameter(root.left);
                int rd = treeDiameter(root.right);

                return Math.max(selfDiam, Math.max(ld, rd));
            }
        }

        public static boolean isSubtree(Node root, Node subRoot) {
            if (root == null) {
                return false;
            }
            if (isIdentical(root, subRoot)) {
                return true;
            }
            return isSubtree(root.left, subRoot) || isSubtree(root.right, subRoot);
        }

        public static boolean isIdentical(Node root, Node subroot) {
            if (root == null && subroot == null) {
                return true;
            }
            if (root == null || subroot == null) {
                return false;
            }
            if (root.value != subroot.value) {
                return false;
            }
            return isIdentical(root.left, subroot.left) && isIdentical(root.right, subroot.right);
        }

        static class TreeInfo {
            int diam;
            int ht;

            public TreeInfo(int diam, int ht) {
                this.diam = diam;
                this.ht = ht;
            }
        }

        public static TreeInfo diameter(Node root) {
            if (root == null) {
                return new TreeInfo(0, 0);
            }

            TreeInfo leftInfo = diameter(root.left);
            TreeInfo rightInfo = diameter(root.right);

            int diam = Math.max(Math.max(leftInfo.diam, rightInfo.diam), leftInfo.ht + rightInfo.ht + 1);
            int ht = Math.max(leftInfo.ht, rightInfo.ht) + 1;

            return new TreeInfo(diam, ht);
        }

        static class Info {
            Node node;
            int hd;

            public Info(Node node, int hd) {
                this.node = node;
                this.hd = hd;
            }
        }

        public static void topView(Node root) {
            if (root == null) {
                return;
            }

            Queue<Info> q = new LinkedList<>();
            HashMap<Integer, Node> map = new HashMap<>();

            int min = 0, max = 0;
            q.add(new Info(root, 0));

            while (!q.isEmpty()) {
                Info curr = q.remove();
                if (!map.containsKey(curr.hd)) {
                    map.put(curr.hd, curr.node);
                }
                if (curr.node.left != null) {
                    q.add(new Info(curr.node.left, curr.hd - 1));
                    min = Math.min(min, curr.hd - 1);
                }

                if (curr.node.right != null) {
                    q.add(new Info(curr.node.right, curr.hd + 1));
                    max = Math.max(max, curr.hd + 1);
                }
            }
            for (int i = min; i <= max; i++) {
                System.out.print(map.get(i).value + " ");
            }
        }

        public static boolean getPath(Node root, int n, ArrayList<Node> a) {
            if (root == null) {
                return false;
            }

            a.add(root);

            if (root.value == n) {
                return true;
            }
            boolean foundLeft = getPath(root.left, n, a);
            boolean foundRight = getPath(root.right, n, a);

            if (foundLeft || foundRight) {
                return true;
            }
            a.remove(a.size() - 1);
            return false;
        }

        public static Node lca(Node root, int n1, int n2) {
            ArrayList<Node> path1 = new ArrayList<>();
            ArrayList<Node> path2 = new ArrayList<>();

            getPath(root, n1, path1);
            getPath(root, n2, path2);

            int i = 0;
            for (; i < path1.size() && i < path2.size(); i++) {
                if (path1.get(i) != path2.get(i)) {
                    break;
                }
            }
            return path1.get(i - 1);
        }

        public static Node lca2(Node root, int n1, int n2) {
            if (root == null) {
                return null;
            }
            if (root.value == n1 || root.value == n2) {
                return root;
            }

            Node leftLca = lca2(root.left, n1, n2);
            Node rightLca = lca2(root.right, n1, n2);

            if (leftLca != null && rightLca != null) {
                return root;
            }
            return (leftLca != null) ? leftLca : rightLca;
        }

        public static void main(String[] args) {
            int nodes[] = { 1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1 };
            BinaryTree tree = new BinaryTree();

            Node root = tree.buildTree(nodes);
            tree.populate(null);
            System.out.print(lca2(root, 4, 5).value);
        }
    }
}
