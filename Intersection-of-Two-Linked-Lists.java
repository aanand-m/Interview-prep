/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        Stack <ListNode> s1 = new Stack <>();
        Stack <ListNode> s2 = new Stack <>();
        ListNode temp1 = headA, temp2 = headB;
        ListNode ans = null;

        while (temp1 != null) {
            s1.push(temp1);
            temp1 = temp1.next;
        }
        
        while (temp2 != null) {
            s2.push(temp2);
            temp2 = temp2.next;
        }
        while (!s1.isEmpty() && !s2.isEmpty()) {
            if (s1.peek() == s2.peek()){
                 ans = s1.peek();
                 s1.pop();
                 s2.pop();
            }
            else break;
        }
        return ans;
    }
}