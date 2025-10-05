class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int len1 = nums1.length;
        int len2 = nums2.length;
        if(len1>len2) return findMedianSortedArrays(nums2,nums1);
        int high = len1;
        int low = 0;
        int left = (len1+len2+1)/2;

        while(low<=high){
            int mid1 = (high+low)/2;
            int mid2 = left-mid1;
            
            int l1 = mid1-1 >=0 ? nums1[mid1-1]:Integer.MIN_VALUE;
            int l2 = mid2-1 >=0 ? nums2[mid2-1]:Integer.MIN_VALUE;

            int r1 = mid1 < len1 ? nums1[mid1]:Integer.MAX_VALUE;
            int r2 = mid2 < len2 ? nums2[mid2]:Integer.MAX_VALUE;
            if(l1<=r2 && l2<=r1){
                if((len1+len2)%2==0) {
                   return (Math.min(r1,r2)+Math.max(l1,l2))/2.0;
                }else{
                   return Math.max(l1,l2);
                }
            }else{
                if(l1>r2){
                    high=mid1-1;
                }else{
                    low=mid1+1;
                }
            }

        }
        return 0;
    }
}