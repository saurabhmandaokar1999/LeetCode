class Solution {
    public int numberOfBeams(String[] bank) {
        int prev = 0;
        int ans = 0 ;
        for(int i=0;i<bank.length;i++){
            int curr = 0;
            for(char c : bank[i].toCharArray()){
                if(c-'1' == 0) curr++;
            }
            if(curr > 0){
                if(prev > 0) {
                    ans += (curr*prev);
                }
                prev = curr;
            }
        }
        return ans;
    }
}