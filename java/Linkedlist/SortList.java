package Linkedlist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class SortList {
    class ListComparator implements Comparator<ListNode> {
        @Override
        public int compare(ListNode o1, ListNode o2) {
            return o1.val - o2.val;
        }
    }
    public ListNode sortList(ListNode head) {
        ArrayList<ListNode> nodes = new ArrayList<>();
        ListNode p =head;
        while (p != null) {
            nodes.add(p);
            p = p.next;
        }
        Collections.sort(nodes, new ListComparator());
        ListNode h = new ListNode();
        p = h;
        for (int i = 0; i < nodes.size(); i++) {
            p.next = nodes.get(i);
            p = p.next;
        }
        p.next = null;
        return h.next;
    }
}
