class Solution:
    def minMovesToSeat(self, seats: List[int], students: List[int]) -> int:
        students.sort()
        seats.sort()
        count=0
        i=0
        while i<len(students):
            count+=abs(seats[i]-students[i])
            i+=1
        return count