class Solution {
    public boolean isPowerOfFour(int n) {
        //checking for power of 2 and n%3==1 since all the powers of 4 leave remainder of 1 when divided by 3
        return (n > 0) && ((n & (n - 1)) == 0) && (n % 3 == 1);
    }
}