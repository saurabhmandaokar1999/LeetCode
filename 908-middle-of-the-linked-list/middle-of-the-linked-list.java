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
        int length=0;
        ListNode temp=head;
        while(head!=null ){
            head=head.next;
            length++;
        }
        for(int i =0;i<length/2;i++){
            temp=temp.next;
        }
        return temp;
    }
}