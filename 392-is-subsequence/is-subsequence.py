class Solution:
    def isSubsequence(self, s: str, t: str) -> bool:
        l1 = l2 = 0

        while l1 < len(s) and l2 < len(t):
            if s[l1] == t[l2]:
                l1 += 1
            l2 += 1
        
        return l1 == len(s)