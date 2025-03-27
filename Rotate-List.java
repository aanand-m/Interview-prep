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
    public ListNode rotateRight(ListNode head, int k) {
        if (head == null || head.next == null || k == 0) return head;
        ListNode temp = head;
        int count = 0;
        int length = 0;
        while (temp != null) {
            length++;
            temp = temp.next;
        }
        k %= length;
        if (k == 0) return head;
        int trigg = length - k;
        temp = head;
        ListNode newHead = null;
        while (temp != null) {
            count++;
            if (count == trigg) {
                newHead = temp.next;
                temp.next = null;
                break;
            }
            temp = temp.next;
        }
        temp = newHead;
        while (temp.next != null) temp = temp.next;
        temp.next = head;
        return newHead;
    }
}