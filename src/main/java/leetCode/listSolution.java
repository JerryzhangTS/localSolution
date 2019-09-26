package leetCode;

public class listSolution {

    static ListNode swapPairs(ListNode head) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode before = dummy;
        ListNode index = head;
        while (index != null && index.next != null) {
            ListNode second = index.next;
            index.next = second.next;
            second.next = index;
            before.next = second;
            before = index;
            index = index.next;
        }
        return dummy.next;
    }

    static ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode result = new ListNode(0);
        ListNode index = result;
        while (l1 != null && l2 != null) {
            if (l1.val > l2.val) {
                index.next = l2;
                l2 = l2.next;
                index = index.next;
            } else {
                index.next = l1;
                l1 = l1.next;
                index = index.next;
            }
        }
        if (l1 != null) {
            index.next = l1;
        } else {
            index.next = l2;
        }
        return result.next;
    }

    static ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode first = dummy;
        ListNode second = dummy;
        int len = 0;
        for (int i = 0; i < n + 1 && first != null; i++) {
            first = first.next;
            len++;
        }
        if (n + 1 > len) {
            return null;
        }
        while (first != null) {
            first = first.next;
            second = second.next;
            len++;
        }
        second.next = second.next.next;
        return dummy.next;
    }
}
