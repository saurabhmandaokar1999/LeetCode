class Solution {
    public int beautySum(String s) {
        int len = s.length();
        int count = 0;
        int[] alp = new int[26];

        for(int i=0;i<len;i++){
            Arrays.fill(alp, 0);
            for(int j=i;j<len;j++){
                int index = s.charAt(j)-'a';
                alp[index]+=1;
                int[] minMax = findMinMax(alp);
                count += (minMax[1] - minMax[0]);
            }
        }
        return count;
    }
    public static int[] findMinMax(int[] arr) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        
        for (int value : arr) {
            if (value > 0) {
                min = Math.min(min, value);
                max = Math.max(max, value);
            }
        }
        
        return new int[]{min, max};
    }
}