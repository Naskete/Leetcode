package Linkedlist;
class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}

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
