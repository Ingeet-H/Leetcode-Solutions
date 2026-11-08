class Solution {
    public int smallestNumber(int n) {
        int bits = 32 - Integer.numberOfLeadingZeros(n);
        return (1 << bits) - 1;
    }
}