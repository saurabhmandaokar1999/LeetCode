class Solution {
    public void reverseString(char[] s) {
        int len = s.length;
        helper(s,0,len);
        return;
    }
   public void helper(char[] s,int ptr , int len){
    if(ptr>=len/2){
        return;
    }
    char temp = s[ptr];
    s[ptr]=s[len-ptr-1];
    s[len-ptr-1]= temp;
    helper(s,++ptr,len);
   }
}