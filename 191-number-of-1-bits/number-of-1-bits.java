class Solution {
    public int hammingWeight(int n) {
        int count = 0;
        while(n != 0){
            count += (n & 1);
            n = n >>> 1;
        }
        return count;
    }

// ✅ 1. count += (n & 1);

// & is the bitwise AND operator.
// n & 1 compares the binary representation of n with 1 (which is 000...0001 in 32 bits).
// This operation checks the least significant bit (LSB) of n:

// If LSB is 1 → n & 1 = 1.
// If LSB is 0 → n & 1 = 0.


// Then we add this result to count.

// Example:
// n = 11 (binary: 1011)
// Step 1: n & 1 = 1011 & 0001 = 0001 → 1
// count += 1

// So this line counts the last bit if it’s set.

// ✅ 2. n >>>= 1;

// >>> is the unsigned right shift operator in Java.
// It shifts all bits of n one position to the right.
// The leftmost bit is filled with 0 (not sign-extended).
// This is important because:

// >> (signed shift) preserves the sign bit for negative numbers.
// >>> (unsigned shift) always inserts 0 on the left.



// Example:
// n = 1011 (binary for 11)
// After n >>>= 1 → 0101 (binary for 5)

// So this line removes the last bit we just checked and moves to the next bit.
}