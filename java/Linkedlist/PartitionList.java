package Linkedlist;

// https://leetcode.com/problems/partition-list/
public class PartitionList {
    public ListNode partition(ListNode head, int x) {
        if (head == null) return head;
        ListNode less = new ListNode();
        ListNode more = new ListNode();
        ListNode p = less, q = more;
        while (head != null) {
            if (head.val >= x) {
                q.next = head;
                q = q.next;
            } else {
                p.next = head;
                p = p.next;
            }
            head = head.next;
        }
        p.next = more.next;
        q.next = null;
        return less.next;
    }
}
