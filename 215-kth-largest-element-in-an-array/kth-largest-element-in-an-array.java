class Solution {
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>((a,b) -> b-a);
        int lge= Integer.MAX_VALUE;
        for(int n : nums){
            pq.add(n);
        }
        while(k-- > 0){
           lge = pq.poll();
        }
        return lge;
    }
}