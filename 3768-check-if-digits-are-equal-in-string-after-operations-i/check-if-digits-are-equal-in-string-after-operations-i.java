class Solution {
    public boolean hasSameDigits(String s) {
        int[] temp = new int[s.length()];

        for(int i=0;i<s.length();i++){
            temp[i] = s.charAt(i)-'0';
        }
        int ptr = temp.length;
        while(ptr>2){
            for(int i=0;i<ptr-1;i++){
                temp[i]=(temp[i]+temp[i+1])%10;
            }
            ptr--;
        }
        return temp[0]==temp[1];
    }
}