package Linkedlist;

public class SwapPair {
    public ListNode swapPairs(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode c = new ListNode();
        c.next = head;
        head = head.next;
        ListNode p = null;
        while (  c.next != null && c.next.next != null) {
            p = c.next;
            c.next = p.next;
            p.next = p.next.next;
            c.next.next = p;
            c = p;
        }
        return head;
    }
}
