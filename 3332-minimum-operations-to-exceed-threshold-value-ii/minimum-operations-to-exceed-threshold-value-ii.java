class Solution {
    public int minOperations(int[] nums, int k) {
        PriorityQueue<Long> pq = new PriorityQueue<>();
        for(long ele:nums){
            pq.add(ele);
        }
        int ans=0;
        while(!pq.isEmpty()){
            if(pq.peek() >= k) return ans;
            long x = pq.poll();
            long y = pq.poll();
            pq.add((long)Math.min(x, y) * 2 + (long)Math.max(x, y));
            ans += 1;
        }
        return ans;
    }
}