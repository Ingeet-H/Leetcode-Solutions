class Solution {
    public boolean isPowerOfFour(int n) {
        //checking for power of 2 and using the mask 0xAAAAAAAA which is binary for 10101010....1010 which has set bits at all of the odd places. since powers of 4 have 1 only at even place, & with this mask will return 0
        return (n > 0) && ((n & (n - 1)) == 0) && ((n & 0xAAAAAAAA) == 0);
    }
}