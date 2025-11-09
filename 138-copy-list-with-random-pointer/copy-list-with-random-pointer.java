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
        if(head == null) return head;
        Node temp = head;
        while(temp != null){
            Node curr = temp.next;
            temp.next = new Node(temp.val);
            temp = temp.next;
            temp.next = curr;
            temp = temp.next;
        }
        temp = head;
        Node ans = head.next;
        while(temp != null){
            temp.next.random = temp.random != null ? temp.random.next : null ;
            temp = temp.next.next;
        }
        temp = head;
        Node temp2 = head.next;
        while(temp != null && temp2 != null){
            temp.next = temp.next.next;
            temp2.next = temp2.next != null ? temp2.next.next : null;
            temp = temp.next;
            temp2 = temp2.next;
        }
        return ans;
    }
}