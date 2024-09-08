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
    public int numComponents(ListNode head, int[] nums) {
        Set<Integer> hs = new HashSet<>();
        for (int num : nums) {
            hs.add(num);
        }
        int count=0;
        boolean start=false;
        while(head !=null){
            if(hs.contains(head.val)){
                if(!start)
                {count++;}
                start = true;
            }else{
                start = false;
            }
            
            head = head.next;

        }
        return count;
    }
}