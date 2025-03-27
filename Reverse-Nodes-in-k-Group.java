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
    public ListNode reverseKGroup(ListNode head, int k) {
        List <ListNode> mergeq = new ArrayList<>();
        if (head == null) return null;
        ListNode temp = head;
        int length = 0;
        int count = 0;
        while (temp != null) {
            length++;
            temp = temp.next;
        }
        if (length < k) return head;
        temp = head;
        ListNode newHead = head;
        while (temp != null) {
            count++;
            if (count == k) {
                ListNode dummy = temp.next;
                temp.next = null;
                mergeq.add(reverse(newHead));
                newHead = dummy;
                temp = dummy;
                count = 0;
            }
            else temp = temp.next;
        }
        ListNode result = mergeq.get(0);
        ListNode curr = result;
        for (int i = 1; i < mergeq.size(); i++) {
            while (curr.next != null) {
                curr = curr.next;
            }
            curr.next = mergeq.get(i);
        }
        if (count > 0) {
            while (curr.next != null) curr = curr.next;
            curr.next = newHead;
        }
        return result;
        
    }
    public ListNode reverse(ListNode head) {
        ListNode curr = head;
        ListNode prev = null;
        while (curr != null) {
            ListNode next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }
}