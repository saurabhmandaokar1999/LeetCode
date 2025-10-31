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
    public ListNode swapNodes(ListNode head, int k) {
       int len = 0;
       ListNode left = head, right = head;
       while(left != null){
        len++;
        left = left.next;
       }
       left = head;
       // find left side
       int counter = 1; 
       while(left != null &&  counter < k ){
        left = left.next;
        counter++;
       }
        counter = len-k ;
       while(counter > 0 && right!=null){
        right = right.next;
        counter--;
       }
       int temp = left.val;
       left.val = right.val;
       right.val = temp;
       return head;
    }
}