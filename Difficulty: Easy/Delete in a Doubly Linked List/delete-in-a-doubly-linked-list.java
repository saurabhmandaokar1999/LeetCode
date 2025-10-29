/*
Structure of a Doubly LinkList
class Node {
    int data;
    Node next;
    Node prev;

    Node(int val) {
        data = val;
        next = null;
        prev = null;
    }
}
*/
class Solution {
    public Node delPos(Node head, int x) {
        // code here
        Node temp = head;
        while(x > 1){
            temp=temp.next;
            x--;
        }
        Node forward = temp.next;
        Node back = temp.prev;
        if(forward != null){
            forward.prev = forward.prev.prev;
        } 
        if(back != null){
            back.next = back.next.next;
        }else{
            return forward;
        }
        return head;
    }
}