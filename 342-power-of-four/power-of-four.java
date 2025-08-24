class Solution {
    public boolean isPowerOfFour(int n) {
        // Base case: 0 is not a power of four.
        if (n == 0) {
            return false;
        }
        // Base case: 1 is the fundamental power of four (4^0).
        if (n == 1) {
            return true;
        }
        // If n is not divisible by 4, it cannot be a power of four.
        if (n % 4 != 0) {
            return false;
        }
        // Recursive step: solve the same problem for n/4.
        return isPowerOfFour(n / 4);
    }
}