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
        if (head == null || k == 0) {
            return head;
        }
        ListNode p= head;
        ListNode q=head;
        int count =1;
        while(p.next!=null){
            p=p.next;
            count++;
        }
       k = k % count;
      for(int i=1;i<count-k;i++){
        q=q.next;
      }
      p.next=head;
      ListNode ans = q.next;
      q.next=null;
      return ans;
    }
}