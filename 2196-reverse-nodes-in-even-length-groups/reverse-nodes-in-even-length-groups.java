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
    public ListNode reverseEvenLengthGroups(ListNode head) {
        if(head.next == null || head.next.next == null) return head;
        ListNode ans = head;
        ListNode left = head;
        ListNode right = head.next;
        int count = 1;
        int group = 2;
        while(right != null){
            if(count == group){
                if(group % 2 == 0){
                    ListNode nodeGrp = left.next;
                    left.next = null;
                    ListNode remNodes = right.next;
                    right.next = null;
                    ListNode rev = helper(nodeGrp,null);
                    left.next = rev;
                    if(rev != null){
                    while(rev.next != null){
                        rev = rev.next;
                      }
                    rev.next = remNodes;
                    }
                    left = rev;
                    right = rev.next;
                }else{
                    left = right;
                    right = right.next;
                }
                count = 0;
                group++;
            }else{
               right = right.next;
            }
            count++;
        }
        if(count > 1 && (count-1) % 2 == 0){
            ListNode remaining = left.next;
            left.next = null;
            ListNode reverseLast = helper(remaining,null);
            left.next = reverseLast;
        }
        return head;
    }
    public ListNode helper(ListNode head , ListNode prev){
        if(head == null) return prev;
        ListNode temp = head.next;
        head.next = prev;
        prev = head;
        head = temp;
        return helper(head, prev);
    }
}