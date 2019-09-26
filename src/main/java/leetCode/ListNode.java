package leetCode;

public class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
    }

    public boolean hasNext() {
        return next != null;
    }
}