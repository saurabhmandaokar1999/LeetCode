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
    public boolean isPalindrome(ListNode head) {
        int len = 0;
        ListNode temp = head;
        while(temp != null){
            len++;
            temp = temp.next;
        }
        if(len < 2) return true;
        if(len == 2) return head.val == head.next.val;
        temp = head;
        int count = 1;
        while(count < len/2){
            temp = temp.next;
            count++;
        }
        ListNode l2 = null;
        if(len%2 != 0){
            l2 = temp.next.next;
        }else{
            l2 = temp.next;
        }
        temp.next = null;
        //reverse a LL
        ListNode prev = null;
        while(head != null){
            ListNode node =  head.next;
            head.next = prev;
            prev = head;
            head = node;
        }
        while(prev != null && l2 != null){
            if(prev.val != l2.val) return false;
            prev = prev.next;
            l2 = l2.next;
        }
        return true;

    }
}