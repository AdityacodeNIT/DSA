public class LoopInLL {
    public static class node {
        int data;
        node next;

        public node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    
    public static node head;
    public static node tail;

    public void addfirst(int data) {

        node newNode = new node(data);
      
        if (head == null) {
            head = tail = newNode;

        }

        newNode.next = head;
        head = newNode;
    }


    public static void main(String[] args) {
        LoopInLL ll = new LoopInLL();

        ll.addfirst(2);
        ll.addfirst(1);
        ll.addlast(3);
        ll.addlast(4);

        ll.addmid(2, 9);
        // ll.removelast();
        // System.out.println("The key is found at " + ll.isFoundRecursive(9));

        // ll.revPrint();
        ll.removeNTH(3);
        ll.print();
        System.out.println(ll.size);
}
}