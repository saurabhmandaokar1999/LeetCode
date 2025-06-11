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
        ListNode middle = findMiddle(head);
        ListNode reverse = reverseHelper(middle);
        while(head!=middle){
            if(head.val!=reverse.val){
                return false;
            }
            head=head.next;
            reverse=reverse.next;
        }
        return true;
    }
    public ListNode reverseHelper(ListNode curr){
        ListNode node = null;
        while(curr!=null){
            ListNode temp = curr.next;
            curr.next = node;
            node = curr;
            curr=temp;
        }
        return node;
    }
    public ListNode findMiddle(ListNode curr){
        ListNode slow = curr;
        ListNode fast = curr;
        while(fast!=null && fast.next!=null){
            slow= slow.next;
            fast = fast.next.next;
        } 
        return slow;
    }
}