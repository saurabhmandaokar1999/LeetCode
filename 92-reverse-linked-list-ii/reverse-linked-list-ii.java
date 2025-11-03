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
    public ListNode reverseBetween(ListNode head, int left, int right) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode start = dummy;
        ListNode end = head;
        int count = 1;
        while(count < right){
            if(count < left) {
                start = start.next;
            }
            end = end.next;
            count++;
        }
        ListNode remaining = end.next;
        end.next = null;
        start.next = helper(start.next, null);
        while(start.next != null){
            start = start.next;
        }
        start.next = remaining;
        return dummy.next;
    }
    public ListNode helper(ListNode head, ListNode prev){
        if(head == null) return prev;
        ListNode temp = head.next;
        head.next = prev;
        prev = head;
        head = temp;
        return helper(head, prev);
    }
}