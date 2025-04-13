class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        Stack<Integer> stk = new Stack<>();
        //Indexer array
        int[] arr = new int[100000];
        int len2 = nums2.length;
        //As nums1 is subset of nums2 we take nums2 array;
        for(int i=len2-1;i>=0;i--){
            int curr=nums2[i];
             while(!stk.isEmpty() && curr>stk.peek()){
                stk.pop();
              }
            if(stk.isEmpty()){
                arr[curr] =-1;
                stk.push(nums2[i]);
            }else if(curr<stk.peek()){
                arr[curr]=stk.peek();
                stk.push(curr);
            }
        }
            for(int i=0;i<nums1.length;i++){
               nums1[i]=arr[nums1[i]];
            }
        return nums1;
    }
}