import java.util.*;
public class lisnlist {
    class Solution {
    public Li sortList(LinkedList head) {
        LinkedList temp=head;
    
        while(temp!=null && temp.next!=null ){
            if(temp.val > temp.next.val){
                LinkedList prev=temp.next;
                temp=temp.next;
                temp.next=prev;
            }
           
        temp=temp.next;
        }
        return temp;
    }
}

public class ListNode {
    int val;
    ListNode next;
    ListNode(int val) { this.val = val; }
}
public static void main(String[] args) {
    LinkedList <Integer> s=new LinkedList<>();
    s.add(1);
    s.add(3);
    s.add(4);
    s.add(2);
    sortList(s);
}
}
