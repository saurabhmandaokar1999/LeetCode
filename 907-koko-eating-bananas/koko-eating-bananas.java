class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int low = 1;
        int high = Integer.MIN_VALUE;
        //using this to find uppar bound rather than sorting the array
        //sorting takes more than O(n) TC
        for(int i : piles){
            high = Math.max(i,high);
        }
        while(low<high){
            int mid = (high+low)/2;
            if(canEat(piles,h,mid)){
               high=mid; 
            }else{
                low=mid+1;
            }
        } 
        return low;
    }
    public boolean canEat(int[] piles, int h,int mid){
        long hoursNeeded = 0L;
        for (int pile : piles) {
            hoursNeeded += (pile + mid - 1) / mid; 
            if (hoursNeeded > h) return false; 
        }
        return hoursNeeded <= h;
    }
}