class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int[] temp = new int[m+n];
        int p1 = 0, p2 = 0;
        int count=0;
        while(p1 < m && p2 < n){
            if(nums1[p1]<nums2[p2]){
                temp[count++] = nums1[p1++];
            }else{
                temp[count++] = nums2[p2++];
            }
        }
        while(p1<m){
            temp[count++] = nums1[p1++];
        }
        while(p2<n){
            temp[count++] = nums2[p2++];
        }
        for(int i = 0; i< temp.length;i++){
            nums1[i] = temp[i];
        }
        return;
    }
}