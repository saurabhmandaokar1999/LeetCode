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
    public ListNode mergeKLists(ListNode[] lists) {
        //Make priority queue with comparator.
       PriorityQueue<ListNode> pq = new PriorityQueue<>((a,b)-> a.val-b.val );

       ListNode head = null;
       ListNode curr = head;

       for(int i =0;i<lists.length;i++){
        if(lists[i]!=null){
            pq.add(lists[i]);
        }
       } 
       while(!pq.isEmpty()){
        //get the min val
        ListNode minVal = pq.poll();

        //if First Node 
        if(head==null){
            head= new ListNode(minVal.val);
            curr=head;
        } 
        //add to existing nodes next
        else{
            curr.next = new ListNode(minVal.val);
            curr = curr.next;
        }
        if(minVal.next!=null){
            //add next node of  min node.
        pq.add(minVal.next);
        }
       }     
       //retrun head of new linked list
       return head; 
    }
}