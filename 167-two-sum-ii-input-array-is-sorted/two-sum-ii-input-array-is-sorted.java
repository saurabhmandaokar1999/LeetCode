class Solution {
    public int[] twoSum(int[] n, int target) {
        int p1 = 0;
        int p2 = n.length-1;
        while(p1<p2){
            int sum = n[p1]+n[p2];
            if(sum == target) return new int[]{p1+1,p2+1};
            else if(sum< target){p1++;}
            else p2--;
        }
        return new int[]{-1,-1};
    }
}