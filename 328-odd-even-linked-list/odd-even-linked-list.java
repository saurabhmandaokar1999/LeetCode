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
    public ListNode oddEvenList(ListNode head) {
        if(head==null || head.next==null){
            return head;
        }
        ListNode p= head;
        ListNode q= head.next;
        ListNode temp=q;
        while(p.next!=null && q.next!=null){
            p.next=p.next.next;
            p=p.next;
            q.next=q.next.next;
            q=q.next;
        }
        p.next=temp;
        return head;
    }
}