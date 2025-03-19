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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if (n == 1) {
            if (head == null || head.next == null) return null;
        }
        int count = 0, trigg = 1;
        ListNode temp = head;
        while (temp != null) {
            count++;
            temp = temp.next;
        }
        if (count - n == 0) return head.next;
        ListNode prev = head;
        temp = head.next;
        while (temp != null) {
            trigg++;
            if (trigg == (count - n + 1)) {
                prev.next = temp.next;
                break;
            }
            prev = temp;
            temp = temp.next;
        }
        return head;

    }
}