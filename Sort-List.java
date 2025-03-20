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
    public ListNode sortList(ListNode head) {
        if (head == null || head.next == null) return head;
        ListNode middle = middle(head);
        ListNode lHead = head;
        ListNode rHead = middle.next;
        middle.next = null;
        lHead = sortList(lHead);
        rHead = sortList(rHead);
        return mergeTwoList(lHead, rHead);
    }
    public ListNode middle (ListNode head){
        ListNode slow = head, fast = head.next;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    public ListNode mergeTwoList(ListNode lHead, ListNode rHead){
        ListNode dummy = new ListNode();
        ListNode temp = dummy;
        while (lHead != null && rHead != null) {
            if (lHead.val < rHead.val) {
                temp.next = lHead;
                temp = lHead;
                lHead = lHead.next;
            }
            else {
                temp.next = rHead;
                temp = rHead;
                rHead = rHead.next;
            }
        }
        if (rHead != null) temp.next = rHead;
        else temp.next = lHead;
        return dummy.next;
    }
}