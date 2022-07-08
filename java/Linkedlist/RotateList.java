package Linkedlist;

public class RotateList {
    public ListNode rotateRight(ListNode head, int k) {
        if (head == null || head.next == null) {
            return head;
        }
        int len = 1;
        ListNode tail = head;
        while (tail.next != null) {
            tail = tail.next;
            len++;
        }
        k = k % len;
        if (k == 0) {
            return head;
        }
        k = len - k;
        ListNode newhead = head;
        while(k-- > 1) {
            newhead = newhead.next;
        }
        ListNode p = newhead;
        newhead = newhead.next;
        p.next = tail.next;
        tail.next = head;
        return newhead;
    }
}
