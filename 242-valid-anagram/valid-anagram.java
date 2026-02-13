class Solution {
    public boolean isAnagram(String s, String t) {
        String s1 = s.chars().sorted().mapToObj(c->(char)c).map(String::valueOf).collect(Collectors.joining());
        String s2 = t.chars().sorted().mapToObj(c->(char)c).map(String::valueOf).collect(Collectors.joining());
        return s1.equals(s2);
    }
}