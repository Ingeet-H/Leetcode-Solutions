class Solution {
    public boolean isPowerOfFour(int n) {
        /* 4^x = n
          => x log 4 = log n
          => x = log n/log 4
          x will be integer if n is a power of 4
        */
        if (n <= 0) return false;
        double x = Math.log(n)/Math.log(4);
        return Math.floor(x) == Math.ceil(x); //checking if x is an integer
    }
}