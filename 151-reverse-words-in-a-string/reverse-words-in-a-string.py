class Solution:
    def reverseWords(self, s: str) -> str:
        lst = s.split(' ')
        ans = []
        for i in lst:
            if i != '':
                ans.append(i)
        return ' '.join(ans[::-1])