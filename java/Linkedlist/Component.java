package Linkedlist;
import java.util.*;;

// 817. https://leetcode.cn/problems/linked-list-components/
public class Component {
    public int numComponents(ListNode head, int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int num : nums) {
            set.add(num);
        }
        ListNode cur = head;
        int res = 0;
        while (cur != null) {
            if (set.contains(cur.val)) {
                res++;
                while (cur != null && set.contains(cur.val)) {
                    cur = cur.next;
                }
            } else {
                cur = cur.next;
            }
        }
        return res;
    }
}