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
    public static int size(ListNode head){
        int length=0;
        while(head!=null){
            head=head.next;
            length++;
        }
        return length;
    }
    public ListNode deleteMiddle(ListNode head) {
        ListNode tempNode = head;
        ListNode tempHead = tempNode;
        int size = size(head);
        if(size==1){
            return null;
        }
        if(size<3 && tempHead.next!=null){
            tempHead.next = null;
        } else {
        for(int i =0;i<size/2 - 1;i++){
            tempNode=tempNode.next;
        }
        if(tempNode.next!=null && tempNode.next.next!=null){
            tempNode.next=tempNode.next.next;
           }
        }
        return tempHead;
    }
}