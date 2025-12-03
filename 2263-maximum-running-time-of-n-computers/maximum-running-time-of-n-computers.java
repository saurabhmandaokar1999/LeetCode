class Solution {
    public long maxRunTime(int n, int[] batteries) {
        long total = 0;
        for(int b : batteries){
            total += b;
        }
        long s = 1;
        long ans = 1;
        //Assuming here equal distribution of batteries
        long e = total/n;
        while(s <= e){
            long mid = (s+e)/2;
            long curr = 0;
            for(int b: batteries){
                curr += Math.min(b,mid);
            }
            if(curr >= (long)mid*n){
                ans = mid;
                s = mid+1;
            }else{
                e = mid-1;
            }
        }
        return ans;
    }
}