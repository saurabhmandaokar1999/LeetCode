class Solution:
    def productExceptSelf(self, nums: List[int]) -> List[int]:
        prefixAndPostfixArray = []
        runningProduct = 1
        prefixAndPostfixArray.append(runningProduct)
        # Processing prefix array
        for i in range(1, len(nums)):
            runningProduct*=nums[i-1]
            prefixAndPostfixArray.append(runningProduct)
        runningProduct = 1

        #Processing postfix array
        for i in range(len(nums)-1, -1, -1):
            prefixAndPostfixArray[i]*=runningProduct
            runningProduct*=nums[i]
        return prefixAndPostfixArray