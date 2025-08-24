class Solution {
    public boolean isPowerOfFour(int n) {
        // Base case: 0 is not a power of four.
        if (n == 0) {
            return false;
        }
        if (n == 1) {
            return true;
        }
        if (n % 4 != 0) {
            return false;
        }
        return isPowerOfFour(n / 4);
    }
}