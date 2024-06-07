class Solution:
    def moveZeroes(self, nums: List[int]) -> None:
        """
        Do not return anything, modify nums in-place instead.
        """
        if len(nums)>=2:
            for i in range(len(nums)):
                if(nums[i]==0):
                    nums.append(nums[i])
                    nums.remove(nums[i])
                    

