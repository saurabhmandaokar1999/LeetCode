class Solution {
    public ListNode reverseBetween(ListNode head, int left, int right) {
        if (right - left == 0) return head;
        // 1) add dummy to handle left==1
        ListNode dummy = new ListNode(0);
        dummy.next = head;

        // 2) find tempL (node before 'left') and tempR (node after 'right')
        ListNode tempL = dummy;
        ListNode temp  = head;
        int count = 1;
        while (temp != null && count < left) {
            tempL = tempL.next;
            temp  = temp.next;
            count++;
        }
        // 'reverse' is the first node to be reversed
        ListNode reverse = tempL.next;
        ListNode node    = null;

        // 3) reverse exactly (right-left+1) nodes, and fix reverse=t
        int len = right - left + 1;
        while (len-- > 0) {
            ListNode t = reverse.next;
            reverse.next = node;
            node = reverse;
            reverse = t;  // ← was reverse=temp, now correct
        }

        // 4) reconnect
        ListNode tail = tempL.next; // old start of segment, now its tail
        tempL.next = node;          // link before-segment → new head
        tail.next  = reverse;       // link new tail → after-segment

        // 5) return full list
        return dummy.next;
    }
}
