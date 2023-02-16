package review;

public class TwoSum {
    // three years ago, add two list
    // l1 : 2 4 3
    // l2 : 5 6 4
    // return : 342 + 465 = 807
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode origin=new ListNode(0);
        ListNode cursor=origin;
        int carry=0;
        while(l1!=null||l2!=null||carry!=0){
            int val1=l1!=null?l1.val:0;
            int val2=l2!=null?l2.val:0;
            int sumVal=val1+val2+carry;
            carry=sumVal/10;

            ListNode sumNode=new ListNode(sumVal%10);
            cursor.next=sumNode;
            cursor=sumNode;

            if(l1!=null) l1=l1.next;
            if(l2!=null) l2=l2.next;
        }
        return origin.next;
    }
    
    // 67. add binary 
    public String addBinary(String a, String b) {
        char[] charInA = a.toCharArray();
        char[] charInB = b.toCharArray();
        int p = charInA.length - 1, q = charInB.length - 1;
        int carry = 0;
        StringBuilder sb = new StringBuilder();
        while (p >= 0 || q >= 0 || carry != 0) {
            int A = p >= 0 ? (int)charInA[p--] - 48 : 0;
            int B = q >= 0 ? (int)charInB[q--] - 48 : 0;
            int sum = A + B + carry;
            carry = sum/2;
            sb.append(sum%2);
        }
        char[] res = sb.toString().toCharArray();
        sb = new StringBuilder();
        for (int i = res.length - 1; i >= 0; i--) {
            sb.append(res[i]);
        }
        return sb.toString();
    }
}
