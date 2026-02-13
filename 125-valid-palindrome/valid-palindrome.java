class Solution {
    public boolean isPalindrome(String s) {
        String s1 = s.chars().mapToObj(c->(char)c).filter(f->{
            if((f>='A' && f<='Z')|| (f>='a' && f<='z')||(f>='0' && f<='9')) return true;
            else return false;
        }).map(Character::toLowerCase).map(String::valueOf).collect(Collectors.joining());

        return s1.equals(new StringBuilder(s1).reverse().toString());
    }
}