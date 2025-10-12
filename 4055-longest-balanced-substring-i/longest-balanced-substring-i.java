class Solution {
    public int longestBalanced(String s) {
        int ans = 1 ;
        int n = s.length();
        for(int i =0 ; i< n-1 ; i++){
            int [] arr = new int[26]; // an array to count frequency
            arr[s.charAt(i) - 'a']++;  // 0 --> 25 || 'a' --> 'z'
            for(int j = i+1 ; j< n ; j++){
                arr[s.charAt(j) - 'a']++;
                if(valid(i , j , s , arr)){
                    ans = Math.max(ans , j - i + 1); // take privious max or current length
                }
            }
        }
        return ans;
    }
    public boolean valid(int start , int end , String s , int [] arr ){
        int same = 0; // for cheaking all have same (means common freq)
        for(int i =start ; i <= end ; i++ ){
             char ch = s.charAt(i); // current character
             int val = arr[ch - 'a'];  // character frequency
             if(val == 0)continue;  // if freq is 0 continue (means element is not in current String)
             if(same == 0)same = val; // if freq occur and same freq is 0  then we set freq to same for cheaking all next char can  have also same freq or not  
            if(same != val)return false; // if prev char freq and current char freq not same then its not valid
        }
        return true;
    }
}