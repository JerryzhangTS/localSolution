package leetCode;

public class TwoListSum {
    public static void main(String[] arge) {
        ListNode l1 = new ListNode(4);
        ListNode l11 = new ListNode(4);
        ListNode l12 = new ListNode(5);
        l1.next = l11;
        l11.next = l12;

        ListNode l2 = new ListNode(5);
        ListNode l21 = new ListNode(6);
        ListNode l22 = new ListNode(4);
        l2.next = l21;
        l21.next = l22;
        addTwoNumbers(l1, l2);
    }

    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
            ListNode dummyHead = new ListNode(0);
            ListNode p = l1, q = l2, curr = dummyHead;
            int carry = 0;
            while (p != null || q != null) {
                int x = (p != null) ? p.val : 0;
                int y = (q != null) ? q.val : 0;
                int sum = carry + x + y;
                carry = sum / 10;
                curr.next = new ListNode(sum % 10);
                curr = curr.next;
                if (p != null) p = p.next;
                if (q != null) q = q.next;
            }
//这里忘记了节点遍历结束了就是null，不需要填充0让两个数保持一致
            if (carry > 0) {
                curr.next = new ListNode(carry);
            }
//这里这样写其实是忽略了首个节点，将所有的流程都化为一样的步骤，这是我没想到的一个点
            return dummyHead.next;
        }
}
