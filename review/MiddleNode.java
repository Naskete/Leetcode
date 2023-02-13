package review;

public class MiddleNode {
    // 奇数返回中点，偶数返回上中点，中间左边的点
    public ListNode getMiddleOrLeftMideNode(ListNode head) {
        if (head == null || head.next == null || head.next.next == null) return head;
        // 有三个节点以上
        ListNode slow = head.next;
        ListNode fast = head.next.next;
        while (fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    public ListNode getMiddleRightNode(ListNode head) {
        return null;
    }
}
