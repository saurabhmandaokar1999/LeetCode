from typing import List

class Solution:
    def maxOperations(self, nums: List[int], k: int) -> int:
        nums.sort()
        first = 0
        last = len(nums) - 1
        count = 0
        
        while first < last:
            if nums[first] + nums[last] == k:
                count += 1
                first += 1
                last -= 1
            elif nums[first] + nums[last] < k:
                first += 1
            else:
                last -= 1
        
        return count
