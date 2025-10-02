class Solution {
    int upperBound(int[] arr, int target) {
        int l = 0;
        int r = arr.length;  // NOTICE: r = n, not n-1

        while (l < r) {
            int m = l + (r - l) / 2;
            if (arr[m] <= target) {
                l = m + 1;
            } else {
                r = m;
            }
        }
        return l; // first index where arr[i] > target
    }
}
