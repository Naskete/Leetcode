package Linkedlist;

public class AddTwoNumber {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode p1 = l1, p2 = l2;
        ListNode res = new ListNode();
        ListNode cur = res;
        int add = 0;
        while (p1 != null && p2 != null) {
            int val = p1.val + p2.val;
            p1 = p1.next;
            p2 = p2.next;
            ListNode node;
            if (val + add >= 10) {
                node = new ListNode(val - 10 + add);
                add = 1;
            } else {
                node = new ListNode(val + add);
                add = 0;
            }
            cur.next = node;
            cur = node;
        }
        ListNode node;
        while (p1 != null) {
            if (add == 1) {
                if (p1.val == 9) {
                    node = new ListNode(0);
                    add = 1;
                } else {
                    node = new ListNode(p1.val + 1);
                    add = 0;
                }
            } else {
                node = new ListNode(p1.val);
            }
            cur.next = node;
            p1 = p1.next;
            cur = cur.next;
        }

        while (p2 != null) {
            if (add == 1) {
                if (p2.val == 9) {
                    node = new ListNode(0);
                    add = 1;
                } else {
                    node = new ListNode(p2.val + 1);
                    add = 0;
                }
            } else {
                node = new ListNode(p2.val);
            }
            cur.next = node;
            p2 = p2.next;
            cur = cur.next;
        }
        if (add == 1) {
            node = new ListNode(1);
            cur.next = node;
        }

        return res.next;
    }
}
