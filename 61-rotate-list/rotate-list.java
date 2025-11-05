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
        int len = 0;
        ListNode temp = head;
        while(temp != null){
            len++;
            temp = temp.next;
        }
        if(len == k || len == 0 || len == 1 || k==0) return head;
        while(len < k) k = k - len;
        if(len == k || k==0) return head;
        temp = head;
        int count = 1;
        while(count < len-k){
            temp = temp.next;
            count++;
        }
        ListNode rev = temp.next;
        temp.next = null;
        temp = rev;
        while(temp.next != null){
            temp = temp.next;
        }
        temp.next = head;
        return rev;
    }
}