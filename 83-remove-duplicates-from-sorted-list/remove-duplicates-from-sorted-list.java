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
        ListNode left = head;
        //ListNode right = head.next; 
        while(left!=null && left.next!=null){
            if(left.val == left.next.val){
                if(left.next.next != null) left.next = left.next.next;
                else left.next = null;
            }else{
                left=left.next;
            }
        }
        return head;
    }
}