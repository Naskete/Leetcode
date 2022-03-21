class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}

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
}