class Solution {
    public int minimumBoxes(int[] apple, int[] capacity) {
        Arrays.sort(capacity);
        int sum = 0;
        for(int i: apple){
            sum+=i;
        }
        int count = 0;
        for(int i = capacity.length-1 ; i>=0; i--)
        {
            int temp = capacity[i];
            if(sum - temp <= 0){
                return ++count;
            }
            sum -= temp ;
            count++;
        }
        return count;

    }
}