class Solution {
    public int minAddToMakeValid(String s) {
        Deque<Character> stack = new ArrayDeque<>();
        for (char c : s.toCharArray()) {
            if (!stack.isEmpty() && stack.peekLast() == '(' && c == ')') {
                stack.pollLast();
            } else {
                stack.offerLast(c);
            }
        }
        return stack.size();
    }
}