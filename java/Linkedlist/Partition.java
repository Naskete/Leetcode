package Linkedlist;

import java.util.ArrayList;

public class Partition {
    public ListNode partiton(ListNode head, int x) {
        if (head == null) {
            return head;
        }
        ListNode newhead = new ListNode(), p = head;
        ArrayList<ListNode> nodes = new ArrayList<>();
        while (p != null) {
            nodes.add(p);
            p = p.next;
        }
        p = newhead;
        int idx = nodes.size();
        for (int i = 0; i < nodes.size(); i++) {
            if (nodes.get(i).val >= x) {
                idx = i;
                break;
            }
        }
        for (int i = 0; i < nodes.size(); i++) {
            if (nodes.get(i).val < x) {
                p.next = nodes.get(i);
                p = p.next;
            }
        }
        for (int i = idx; i < nodes.size(); i++) {
            if (nodes.get(i).val >= x) {
                p.next = nodes.get(i);
                p = p.next;
            }
        }
        p.next = null;
        return newhead.next;
    }
}
