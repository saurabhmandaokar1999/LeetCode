class Solution:
    def judgeSquareSum(self, c: int) -> bool:
        left,right=0,int(c**0.5)
        while left<=right:
            temp =left*left+right*right
            if temp==c:
                return True
            elif temp>c:
                right-=1
            else:
                left+=1
        return False
