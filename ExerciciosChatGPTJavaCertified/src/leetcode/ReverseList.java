package leetcode;

public class ReverseList {

	public ListNode reverseList(ListNode head) {
        if(head == null || head.next == null) return head;
        ListNode listReverse = reverseList(head.next);

        head.next.next = head;
        head.next = null;

        return listReverse;
        
    }
}
