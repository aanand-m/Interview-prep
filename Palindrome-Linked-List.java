/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public boolean isPalindrome(ListNode head) {
        ListNode temp = head, slow = head, fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        ListNode sH = rev(slow);
        while (sH != null) {
            if (sH.val != temp.val) return false;
            sH = sH.next;
            temp = temp.next;
        }
        return true;

    }
    public ListNode rev(ListNode head) {
        if (head == null || head.next == null) return head;
        ListNode newHead = rev(head.next);
        ListNode front = head.next;
        front.next = head;
        head.next = null;
        return newHead;
    }
}