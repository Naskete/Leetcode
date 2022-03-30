package Linkedlist;

public class ReverseList {
    public ListNode reverseList(ListNode head) {
        ListNode p = null, q = null;
        while(head != null){
            p = head;
            head = p.next;
            p.next = q;
            q = p;
        }
        return q;
    }
}
