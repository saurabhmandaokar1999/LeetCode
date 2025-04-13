class Solution {
    public int[] nextGreaterElements(int[] nums) {
        Stack<Integer> stk = new Stack<>();
        int[] arr = new int[nums.length];
        int len = nums.length;
        for(int i=(2*len)-1;i>=0;i--){
            int curr = nums[i%len];
            while(!stk.isEmpty() && curr>=stk.peek()){
                stk.pop();
            }
            if(stk.isEmpty()){
                stk.push(curr); 
                if(i<len){
                    arr[i]=-1;
                }
            }else{
                if(i<len) arr[i] = stk.peek();
                stk.push(curr);
            }
        }
        return arr;
    }
}