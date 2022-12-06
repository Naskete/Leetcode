package Linkedlist;

public class Intersection {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode p = headA, q = headB;
        while (p.next != null) {
            p = p.next;
        }
        while (q.next != null) {
            q = q.next;
        }
        if (p != q) {
            return null;
        }
        p = headA;
        q = headB;
        while (p != q) {
            p = p.next;
            q = q.next;
            if (p == null) p = headB;
            if (q == null) q = headA;
        }
        return p;
    }
}
