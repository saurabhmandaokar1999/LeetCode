class Solution {
    Node removeDuplicates(Node head) {
        if (head == null || head.next == null) return head;

        Node ans = head;
        Node node = head.next;
        while (node != null) {
            if (head.data == node.data) {
                node = node.next;
                head.next = node;
                if (node != null) node.prev = head;   // <-- safe check
            } else {
                head = head.next;
                node = node.next;
            }
        }
        return ans;
    }
}
