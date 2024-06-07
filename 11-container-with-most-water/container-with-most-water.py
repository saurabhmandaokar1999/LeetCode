class Solution:
    def maxArea(self, height: List[int]) -> int:
        front = 0
        last = len(height)-1
        area = (last-front)*min(height[front],height[last])
        while front!=last:
            if height[front]<height[last]:
                front+=1
            else:
                last-=1
            if area < ((last-front)*min(height[front],height[last])):
                area = ((last-front)*min(height[front],height[last]))
        return area

