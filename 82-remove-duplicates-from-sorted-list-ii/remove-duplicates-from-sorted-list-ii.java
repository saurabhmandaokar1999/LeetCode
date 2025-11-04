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
        if(head == null ||  head.next == null) return head;
        ListNode prev = new ListNode(-101);
        ListNode ans = prev;
        prev.next = head;
        boolean repeated = false;
        while(head.next != null){
            if(head.val == head.next.val){
                head = head.next;
                prev.next = null;
                repeated = true;
            }else{
                if(repeated){
                    head = head.next;
                    prev.next = head;
                    repeated = false;
                }else{
                prev = prev.next;
                head = head.next;
                }
            }
        }
        return ans.next;
    }
}