class Solution(object):
    def mergeAlternately(self, word1, word2):
        s = ""
        n = min(len(word1),len(word2))
        for i in range(n):
            s = s + word1[i] + word2[i]
        if len(word1) > len(word2):
            s = s + word1[n:]
        else:
            s = s + word2[n:]
        return s 
        