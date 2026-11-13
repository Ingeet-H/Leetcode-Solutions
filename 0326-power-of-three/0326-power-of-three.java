class Solution {
    public boolean isPowerOfThree(int n) {
        return helper(1,n);
    }
    boolean helper(long p, int n){
        if(p>n)
        return false;
        if(p==n)
        return true;
        return helper(p*3,n);
    }
}