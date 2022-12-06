package Linkedlist;

public class Remove {
    public ListNode deleteNode(ListNode head, int val) {
        if (head.val == val) {
            head = head.next;
            return head;
        }

        ListNode next = head.next;
        ListNode pre = head;
        while (next != null) {
            if (next.val == val) {
                pre.next = next.next;
                break;
            }
            next = next.next;
            pre = pre.next;
        }
        return head;
    }
}
