package Linkedlist;

class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode slow = head, fast = head.next, p = head;
        int len = 0;
        while(p!=null){
            p=p.next;
            len++;
        }
        if(n==len) return head.next;
        if(fast == null) {
            return fast;
        }
        while(n> 0&&fast!=null){
            fast = fast.next;
            n--;
        }
        while(fast!=null){
            fast = fast.next;
            slow = slow.next;
        }
        slow.next = slow.next.next;
        return head;
    }

    public ListNode removeNthFromEndI(ListNode head, int n) {
        ListNode node = new ListNode(0,head);
        ListNode slow, fast;
        slow=node;
        fast = head;
        while(n--!=0){
            fast=fast.next;
        }
        while(fast!=null){
            fast=fast.next;
            slow=slow.next;
        }
        slow.next = slow.next.next;
        head = node.next;
        return head;
    }
}