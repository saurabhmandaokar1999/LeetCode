class Solution {
    public int maximumCandies(int[] candies, long k) {
    long l= 1;
    long sum=0;
    for(int i: candies){
        sum+=i;
    }
    if(sum<k) return 0;
    long r=sum/k;
    long ans=0;
    while(l<=r){
        long m = (l+r)/2;
        long c=0;
        for(long i : candies){
          c+=i/m;
        }
        if(c>=k){
            l=m+1;
            ans=m;
        }else{
            r=m-1;
        }
    }
    return (int)ans;
    }
}