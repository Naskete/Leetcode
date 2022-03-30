package Linkedlist;

public class MiddleNode {
    public ListNode middleNode(ListNode head) {
        int[] arr = new int[100];
        ListNode p = head;
        int index = 0;
        while(p.next!=null){
            arr[index++] = p.val;
            p=p.next;
        }
        int idx = index%2==0?index/2:index/2+1;
        while(idx-->0){
            head = head.next;
        }
        return head;
    }
}
