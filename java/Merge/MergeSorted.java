package Merge;

import Linkedlist.ListNode;

public class MergeSorted {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode head = new ListNode();
        ListNode p = list1, q = list2;
        ListNode r = head;
        while (p != null && q!= null) {
            if (p.val > q.val) {
                r.next = q;
                q = q.next;
            } else {
                r.next = p;
                p = p.next;
            }
            r = r.next;
        }
        
        while (p != null) {
            r.next = p;
            p = p.next;
            r = r.next;
        }
        while (q != null) {
            r.next = q;
            q = q.next;
            r = r.next;
        }
        return head.next;
    }
}
