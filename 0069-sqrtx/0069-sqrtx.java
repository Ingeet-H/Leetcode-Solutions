class Solution {
    public int mySqrt(int n) {
        if (n == 0) return 0;
        long x = n;
        while (x * x > n) {
            x = (x + n / x) / 2;
        }
        return (int) x;
    }
}