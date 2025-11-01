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
    public ListNode deleteDuplicates(ListNode head) {
        ListNode ans = new ListNode(-101);
        ListNode pointer = ans;
        ListNode prev = new ListNode(-101);
        while(head!=null){
           if(head.next!=null && head.val != head.next.val && head.val != prev.val){
            pointer.next = new ListNode(head.val);
            pointer = pointer.next;
            }
            if(head.next == null && head.val != prev.val) { pointer.next = new ListNode(head.val);}
            prev = head;
            head = head.next;
        }
        return ans.next;
    }
}