class Solution {
    public String removeKdigits(String num, int k) {
        if(k==num.length()) return"0";
        Stack<Character> stk = new Stack<>();
        char[] arr = num.toCharArray();
         StringBuilder sb = new StringBuilder();
        for(int i=0;i<arr.length;i++){
            while(k>0 && !stk.isEmpty() && (stk.peek()-'0')>(arr[i]-'0')){
                k--;
                stk.pop();
            }
            stk.push(arr[i]);
        }
        while(k>0 && !stk.isEmpty()) {stk.pop(); k--;}

        while(!stk.isEmpty()){
            sb.append(stk.pop());
        }
        sb.reverse();
        int idx = 0;
        while (idx < sb.length() && sb.charAt(idx) == '0') {
            idx++;
        }
        String result = idx == sb.length() ? "0" : sb.substring(idx);

        return result;
    }
}