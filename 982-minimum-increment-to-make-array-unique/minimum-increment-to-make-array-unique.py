class Solution:
    def minIncrementForUnique(self, nums: List[int]) -> int:
        nums.sort()
        move=0
        ans=0
        for i in nums:
            ans+=max(move-i,0)
            move=max(move+1,i+1)
        return ans    