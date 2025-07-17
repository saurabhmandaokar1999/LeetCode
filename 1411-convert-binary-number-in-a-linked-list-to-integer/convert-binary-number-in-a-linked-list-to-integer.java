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
    public int getDecimalValue(ListNode head) {
        ListNode temp = head;
        int len=-1;
        while(temp!=null){
            len++;
            temp=temp.next;
        }
        int ans=0;
        while(head!=null){
            ans=ans+(head.val*(int)Math.pow(2,len--));
            head=head.next;
        }
        return ans;
    }
}