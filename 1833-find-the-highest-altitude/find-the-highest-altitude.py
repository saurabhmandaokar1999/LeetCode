class Solution:
    def largestAltitude(self, gain: List[int]) -> int:
        maxAltitude = 0

        maxAltitude=max(maxAltitude,gain[0])

        for i in range(1,len(gain)):
            gain[i]=gain[i]+gain[i-1]

            maxAltitude=max(maxAltitude,gain[i])

        return maxAltitude


        