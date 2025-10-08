class Solution {
    public int[] avoidFlood(int[] rains) {
        int len = rains.length;
        int [] ans = new int[len];
        TreeSet<Integer> ts = new TreeSet<>();
        Map<Integer,Integer> map = new HashMap<>();

        for(int i=0;i<len;i++){
            if(rains[i]==0){
                ts.add(i);
            }
            else{
                if(map.containsKey(rains[i])){
                    Integer idx = ts.ceiling(map.get(rains[i]));
                    if(idx == null) return new int[0];
                    ts.remove(idx);
                    map.put(rains[i],i);
                    ans[idx] = rains[i];
                    ans[i] = -1;
                }else{
                    map.put(rains[i],i);
                    ans[i]=-1;
                }
            }
        }
        while(!ts.isEmpty()){
            ans[ts.pollFirst()]=1;
        }
        return ans;
    }
}