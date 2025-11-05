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
    public ListNode reverseKGroup(ListNode head, int k) {
        if (head == null || k <= 1) return head;
        ListNode left = new ListNode(-1);
        left.next = head;
        ListNode right = head;
        ListNode ans = head;
        int count = 1;
        while(right != null){
            if(count % k == 0){
                ListNode rev = left.next;
                ListNode temp = right.next;
                left.next = null;
                right.next = null;
                ListNode revAns = helper(rev,null);
                left.next = revAns;
                if(count - k == 0) ans = left;
                if(revAns!= null){
                while(revAns.next != null) revAns = revAns.next;
                revAns.next = temp;
                }
                right = revAns;
                left = revAns;
            }
            count++;
            if(right != null) right = right.next;
        }
        return ans.next;
    }
    public ListNode helper(ListNode node,ListNode prev){
        if(node == null) return prev;
        ListNode temp = node.next;
        node.next = prev;
        prev = node;
        node = temp;
        return helper(node,prev);
    }
}