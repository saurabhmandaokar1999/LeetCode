class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n1 = nums1.length;
        int n2 = nums2.length;
        int total = n1+n2;
        int prev = 0;
        int curr = 0;
        //pointer to n1 and n2 array respectivelly
        int p =0,q=0;
        for(int i = 0;i<=total/2;i++){
            prev=curr;
            if(p<n1 && (q>=n2 || nums1[p]<=nums2[q])){
                curr=nums1[p++];
            }else{
                curr=nums2[q++];
            }
        }
        if(total%2==0){
             return (prev + curr) / 2.0;
        }else{
            return curr;
        }
    }
}