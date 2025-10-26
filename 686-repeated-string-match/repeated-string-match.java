class Solution {
    public int repeatedStringMatch(String a, String b) {
        StringBuilder sb = new StringBuilder(a);
        int count = 1;

        // Keep appending until sb is at least as long as b
        while (sb.length() < b.length()) {
            sb.append(a);
            count++;
        }

        // Check if b is a substring
        if (sb.indexOf(b) != -1) return count;

        // Check once more after adding one extra repeat (for overlap cases)
        sb.append(a);
        count++;
        if (sb.indexOf(b) != -1) return count;

        // Otherwise, not possible
        return -1;
    }
}
