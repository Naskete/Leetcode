package Linkedlist;

// 23 https://leetcode.com/problems/merge-k-sorted-lists
public class MergeKLinkedList {
    public ListNode mergeKLists(ListNode[] lists) {
        if (lists == null || lists.length == 0) return null;
        ListNode head = lists[0];
        for (int i = 1; i < lists.length; i++) {
            head = merge(head, lists[i]);
        }
        return head;
    }

    public ListNode merge(ListNode listA, ListNode listB) {
        if (listA == null) return listB;
        if (listB == null) return listA;
        ListNode p = listA.val <= listB.val ? listA : listB;
        ListNode q = p == listA ? listB : listA;
        ListNode head = p, cur = p;
        p = p.next;
        while (p != null && q != null) {
            if (p.val <= q.val) {
                cur.next = p;
                p = p.next;
            } else {
                cur.next = q;
                q = q.next;
            }
            cur = cur.next;
        }
        if (p != null) {
            cur.next = p;
        }
        if (q != null) {
            cur.next = q;
        }
        return head;
    }
}
