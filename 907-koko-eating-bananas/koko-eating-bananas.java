class Solution {
    public int minEatingSpeed(int[] piles, int h) {
     int i=1;
     int max = piles[0];
     int ans=0;
     for(int p:piles){
        max = Math.max(max,p);
     }
     while(i<=max){
        int mid = (i+max)/2;
        if(canEat(mid,piles,h)){
            ans=mid;
            max=mid-1;
        }else{
             i=mid+1;
        }
     }
     return ans;
    }
    public boolean canEat(int curr,int[] piles,int h){
        int total = 0;
        for(int i=0;i<piles.length;i++){
            int p = piles[i];
            if(p%curr == 0){
                total+=(p/curr);
            }else{
                total+=((p/curr)+1);
            }
            if(total>h) return false;
        }
        return total<=h;
    }
}