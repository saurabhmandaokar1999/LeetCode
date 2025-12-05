class Solution {
    public int countCollisions(String directions) {
        int ans = 0;
        int prev = 0;
        int i = 0;
        while(i<directions.length() && directions.charAt(i) == 'L') i++;
        for(;i<directions.length(); i++){
            char c = directions.charAt(i);
            if(c == 'L'  ){
                ans += (prev+1);
                prev = 0;
            }else if(c == 'S'){
                ans += prev;
                prev = 0;
            }else{
                prev++;
            }
        }
        return ans;
    }
}