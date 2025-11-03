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
    public ListNode sortList(ListNode head) {
        if (head == null || head.next == null) return head;
        ListNode slow = head;
        ListNode fast = head;
        ListNode temp = slow;
        while(fast != null && fast.next != null){
            temp = slow;
            slow = slow.next;
            fast = fast.next.next;
        }
        temp.next = null;
        ListNode l1 = sortList(head);
        ListNode l2 = sortList(slow);
        return mergeSort(l2,l1);
    }
    public ListNode mergeSort(ListNode l1 , ListNode l2){
        ListNode ans = new ListNode(-1);
        ListNode temp = ans;
        while(l1 != null && l2 != null){
            if(l1.val <= l2.val){
                ans.next = l1;
                ans = ans.next;
                l1 = l1.next;
            }else{
                ans.next = l2;
                ans = ans.next;
                l2 = l2.next;
            }
        }
        while(l1 != null){
            ans.next = l1;
            ans = ans.next;
            l1 = l1.next;
        }
        while(l2 != null){
            ans.next = l2;
            ans = ans.next;
            l2 = l2.next;
        }
        return temp.next;
    }
}