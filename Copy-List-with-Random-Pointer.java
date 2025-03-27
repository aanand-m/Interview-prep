/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/

class Solution {
    public Node copyRandomList(Node head) {
        Map <Node, Node> mpp = new HashMap <>();

        if (head == null) return null;

        Node newHead = new Node(head.val);
        Node dummy = newHead;
        Node temp = head;
        mpp.put(head, newHead);
        
        while (temp.next != null) {
            temp = temp.next;
            dummy.next = new Node(temp.val);
            dummy = dummy.next;
            mpp.put(temp, dummy);
        }
        
        temp = head;
        dummy = newHead;
        
        while (temp != null) {
            if (temp.random != null) {
                dummy.random = mpp.get(temp.random);
            } else dummy.random = null;

            temp = temp.next;
            dummy = dummy.next;
        }
        return newHead;
    }
}