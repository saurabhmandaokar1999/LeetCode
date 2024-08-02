/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public boolean hasCycle(ListNode head) {
        //check for 0 or one elemnt in linked list
        if(head == null || head.next==null){
            return false;
        }
        //Slow is at head
        ListNode slow = head;
        //Fast is at next pointer to the head
        ListNode fast = head.next;

        //if it is cyclic linked list then eventually slow pointer will meet fast pointer
        //that should be our breaking condition
        while(slow!=fast){
            //check one more condition if any node has null as next pointer it is not cyclic
            if(fast==null || fast.next==null){
                return false;
            }
            slow=slow.next;
            fast=fast.next.next;
        }
        //If the loop sucessfully breaks
        return true; 
    }
}