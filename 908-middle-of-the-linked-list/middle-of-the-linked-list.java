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
    public ListNode middleNode(ListNode head) {
   //using tortoise ahe hare approach 2 pointers ene slow and one fast to find out the middle of linked list
        ListNode fast = head;
        ListNode slow =head;

        while(fast!=null && fast.next!=null){
            //Fast moves 2 times faster then slow and hence covers only half the distance.
            fast=fast.next.next;
            slow = slow.next;
        }
        return slow;

    }
}