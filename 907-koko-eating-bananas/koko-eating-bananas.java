class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int left =1;
        int right = piles[0];
        for(int i=1;i<piles.length;i++){
           right= piles[i]>right ? piles[i]:right; 
        }

        while(left<=right){
            int mid = (left+right)/2;
            long time = maxHrs(piles,mid);
            if(time<=h){
                right=mid-1;
            }else{left=mid+1;}
        }
        return left;
    }
    public long maxHrs(int[] piles,int bhp){
        long total = 0;
        for(int i =0;i<piles.length;i++){
        total += (piles[i] + bhp - 1) / bhp;
        }
        return total;
    }
}