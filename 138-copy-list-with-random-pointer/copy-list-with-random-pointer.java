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
        Node ans = new Node(-1);
        Node fin = ans;
        Node temp = head;
        int len = 0;
        while(temp != null){
            ans.next = new Node(temp.val);
            ans = ans.next;
            temp = temp.next;
            len++;
        }
        //final ans for
        fin = fin.next;
        temp = head;
        ans = fin;
        while(temp != null){
            Node ran = temp.random;
            int dis = 0;
            if(ran == null){
                ans.random = null;
                ans = ans.next;
                temp = temp.next;
                continue;
            }
            while(ran.next != null){
                dis++;
                ran = ran.next;
            }
            Node findRan = fin;
            int count = len;
            while(count-dis-1 > 0){
                findRan = findRan.next;
                count--;
            }
            ans.random = findRan;
            ans = ans.next;
            temp = temp.next;
        }
        return fin;
    }
}