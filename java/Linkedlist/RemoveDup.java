package Linkedlist;

public class RemoveDup {
    public ListNode deleteDuplicates(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode newhead = new ListNode(0, head);
        int v = head.val;
        ListNode p = head, q = newhead.next;
        while (p != null) {
            if (p.val != v) {
                v = p.val;
                q.next = p;
                q = q.next;
            }
            p = p.next;
        }
        q.next = null;
        return newhead.next;
    }
}
