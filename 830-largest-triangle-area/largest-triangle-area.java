class Solution {
    public double largestTriangleArea(int[][] points) {
        int len = points.length;
        double area = 0.0;
        for(int i = 0;i<len-2;i++){
            for(int j = i+1;j<len-1;j++){
                for(int k = j+1;k<len;k++){
                   double curAr = 0.5 * Math.abs(
                        points[i][0] * (points[j][1] - points[k][1]) +
                        points[j][0] * (points[k][1] - points[i][1]) +
                        points[k][0] * (points[i][1] - points[j][1])
                    );
                    area = Math.max(curAr,area);
                }
            }
        }
        return area;
    }
}