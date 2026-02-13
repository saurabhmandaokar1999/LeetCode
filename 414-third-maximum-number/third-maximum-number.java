class Solution {
    public int thirdMax(int[] nums) {
       List<Integer> ans = Arrays.stream(nums).boxed().distinct().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
       if(ans.size() >=3)return ans.get(2);
       else return ans.get(0);
    }
}