public class Bfs {

    private class Node {
        int data;
        Node left;
        Node right;
        int height;

        public Node(int height, int data) {
            this.height = height;
            this.data = data;
        }
    }

    private Node root;

    public void height() {
        height(this.root);
    }

    public int height(Node node) {
        {
            if (node == null) {
                return -1; // Base case: return -1 for null node to account for edge cases
            }
        
            int left = height(node.left);
            int right = height(node.right);
        
            return Math.max(left, right) +1;

    }
}

public void orderTraversal(){
    orderTraversal(this.root, height,0);
}

public Node  orderTraversal(Node node,int height,int counter){
    
}

}
