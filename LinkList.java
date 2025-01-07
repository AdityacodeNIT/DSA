public class LinkList {
    public static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }

    }
s

    public static Node head;
    public static Node tail;
    public static int size;

    public void addfirst(int data) {

        Node newNode = new Node(data);
        size++;
        if (head == null) {
            head = tail = newNode;

        }

        newNode.next = head;
        head = newNode;
    }

    public void addlast(int data) {

        Node newNode = new Node(data);
        size++;
        if (head == null) {
            head = tail = newNode;

        }

        tail.next = newNode;
        tail = newNode;
    }

    public void print() {

        Node temp = head;

        while (temp != null) {
            System.out.println(temp.data);

            temp = temp.next;
        }

    }

    public void addmid(int index, int data) {
        if (index == 0) {
            addfirst(data);
            return;
        }
        Node newNode = new Node(data);
        size++;
        Node temp = head;
        int i = 0;

        while (i < index - 1) {
            temp = temp.next;
            i++;
        }
        newNode.next = temp.next;
        temp.next = newNode;
    }

    public int removefirst() {
        if (size == 0) {
            System.out.println("LL is empty");
            return Integer.MAX_VALUE;
        }

        else if (size == 1) {
            int val = head.data;
            head = tail = null;
            size = 0;
            return val;
        }
        int val = head.data;
        head = head.next;
        size--;
        return val;
    }

    public int removelast() {
        if (size == 0) {
            System.out.println("LL is empty");
            return Integer.MIN_VALUE;
        }

        else if (size == 1) {
            int val = head.data;
            head = tail = null;
            size = 0;
            return val;
        }
        Node prev = head;
        for (int i = 0; i < size - 2; i++) {
            prev = prev.next;

        }
        int val = prev.next.data;
        prev.next = null;
        tail = prev;
        size--;
        return val;

    }

    public void removeNTH(int N) {
        int sz = 0;
        Node temp = head;
        while (temp != null) {
            temp = temp.next;
            sz++;
        }

        if (N == sz) {
            head = head.next;
            return;
        }
        Node prev = head;
        for (int i = 0; i < size - (N - 1); i++) {
            prev = prev.next;

        }

        prev.next = prev.next.next;

    }

    public static int isFound(int key) {
        Node temp = head;
        int index = 0;

        while (temp != null) {
            if (temp.data == key) {
                return index;
            }
            temp = temp.next;
            index = index + 1;
        }
        return -1;
    }

    public int helper(Node head, int key) {
        if (head == null) {
            return -1;
        }
        if (head.data == key) {
            return 0;
        }
        int idx = helper(head.next, key);
        if (idx == -1) {
            return -1;
        } else {
            return idx + 1;
        }
    }

    public void revPrint() {
        // Node temp = tail;
        Node prev = null;
        Node curr = tail = head;
        Node next;
        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;

        }
        head = prev;

    }

    public void remvovemfromn(int m, int n) {

        Node temp = head;
        for (int i = 0; i < m; i++) {
            temp = temp.next;
        }
        Node z = temp;

        for (int i = 0; i < n; i++) {
            temp = temp.next;

        }

        z.next = temp.next;

    }

    public int isFoundRecursive(int key) {
        return helper(head, key);
    }

    public static Node findMid(Node head) {
        Node slow = head;
        Node fast = head.next;

        if (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    public Node mergeSort(Node head) {

        if (head == null && head.next == null) {
            return head;
        }
        Node mid = findMid(head);
        Node righthead = mid.next;
        mid.next = null;
        Node newLeft = mergeSort(head);
        Node newright = mergeSort(righthead);
        return merge(newLeft, newright);

    }

    public Node merge(Node head1, Node head2) {
        Node mergedll = new Node(-1);
        Node temp = mergedll;

        while (head1 != null || head2 != null) {
            if (head1.data < head2.data) {
                temp.next = head1;
                head1 = head1.next;
                temp = temp.next;
            } else {

                temp.next = head2;
                head2 = head2.next;
                temp = temp.next;

            }
        }
        while (head1 != null) {
            temp.next = head1;
            head1 = head1.next;
            temp = temp.next;
        }

        while (head2 != null) {
            temp.next = head2;
            head2 = head2.next;
            temp = temp.next;
        }

        return mergedll.next;

    }

    public Boolean checkPalindrome() {

        if (head == null || head.next == null) {
            return true;
        }
        // find mid
        Node midNode = findMid(head);

        Node prev = null;
        Node curr = midNode;
        Node next;

        // this is used to change the sides from the a towards the c;
        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        Node right = prev;
        Node left = head;

        // check it;

        while (right != null) {
            if (left.data != right.data) {
                return false;
            }
            left = left.next;
            right = right.next;
        }
        return true;
    }

    public static Boolean iscycle() {
        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;

            if (fast == slow) {
                return true;
            }

        }
        return false;

    }

    public static void removeCycle() {
        // Detect Cycle
        Node slow = head;
        Node fast = head;
        Boolean cycle = false;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;

            if (fast == slow) {
                cycle = true;
                break;

            }

        }
        if (cycle == false) {
            return;
        }

        slow = head;
        Node prev = null;
        while (slow != fast) {
            prev = fast;
            slow = slow.next;
            fast = fast.next;
        }

        prev.next = null;

    }

    // Zigzag transformation of the list
    public void zigZag() {
        if (head == null || head.next == null) {
            return;
        }

        // Find the middle node
        Node midNode = findMid(head);
        Node secondHalf = midNode.next;
        midNode.next = null; // Split the list into two halves

        // Reverse the second half of the list
        Node prev = null;
        Node curr = secondHalf;
        while (curr != null) {
            Node next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        Node right = prev; // Start of the reversed second half
        Node left = head;
        
        while (left != null && right != null) {
            Node tempLeft = left.next;
            Node tempRight = right.next;

            left.next = right;
            if (tempLeft == null) {
                break;
            }
            right.next = tempLeft;

            left = tempLeft;
            right = tempRight;
        }
    }

    // public void swap(int x, int y) {

    // if(x==y)

    // {
    // return;
    // }
    // Node prev = null;
    // int
    // Node temp2=head;for(
    // int i = 0;i<=x;i++)
    // {
    // temp2 = temp2.next;
    // }
    // Node temp = temp2;

    // for(
    // int i = 0;i<y;i++)
    // {
    // head = head.next;
    // }

    // head.next=temp;head.next.next=null;

    // }

    public void OddEven() {

        // if(x==y){
        // return;
        // }
        // Node prev=null;
        // int
        // Node temp2 = head;
        // for (int i = 0; i <= x; i++) {
        // temp2 = temp2.next;
        // }
        // Node temp = temp2;

        // for (int i = 0; i < y; i++) {
        // head = head.next;
        // }

        // head.next = temp;
        // head.next.next = null;

        // }

        Node temp = head;
        while (temp != null && temp.next != null) {
            if (temp.data % 2 == 0) {
                temp = temp.next;
            } else {
                temp = temp.next.next;
            }

        }

    }

    public static void main(String[] args) {
        LinkList ll = new LinkList();

        ll.addfirst(2);

        ll.addlast(3);
        ll.addlast(4);
        ll.addlast(5);

        ll.addmid(2, 9);
        System.out.println(ll.head.data);
        // ll.print();
        // ll.zigZag();
        // head = new Node(1);
        // Node temp = new Node(2);
        // head.next = temp;
        // head.next.next = new Node(3);
        // head.next.next.next = new Node(4);

        // head.next.next.next.next = temp;
        // // ll.removelast();
        // System.out.println("The key is found at " + ll.isFoundRecursive(9));

        // ll.revPrint();
        // ll.removeNTH(3);
        // ll.remvovemfromn(2, 1);
        // ll.swap(2, 4);
        // ll.OddEven();
        // ll.print();
        // System.out.println(ll.iscycle());
        // removeCycle();
        // System.out.println(ll.iscycle());

        // System.out.println(ll.size);
    }
}
