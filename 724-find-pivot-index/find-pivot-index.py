class Solution(object):
    def pivotIndex(self, nums):
        leftSum, rightSum = 0, sum(nums)
        for idx, ele in enumerate(nums):
            rightSum -= ele
            if leftSum == rightSum:
                return idx      
            leftSum += ele
        return -1       