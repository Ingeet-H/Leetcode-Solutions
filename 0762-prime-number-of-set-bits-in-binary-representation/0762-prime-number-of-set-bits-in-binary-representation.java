class Solution {
    public int countPrimeSetBits(int left, int right) {
        int count = 0,c = 0;
        for(int i = left;i<=right;i++){
            count = Integer.bitCount(i);
            if(isPrime(count))
            c++;
        }
        return c;
    }
    boolean isPrime(int p){
        if(p<2)
        return false;
        if(p%2==0)
        return p==2;
        for(long c = 3;c*c<=p;c+=2){
            if(p%c==0)
            return false;
        }
        return true;
    }
}