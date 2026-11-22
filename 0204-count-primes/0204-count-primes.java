class Solution {
    public int countPrimes(int n) {
        boolean[] primes = new boolean[n+1];
        int c = 0;
        for (int i = 2;i*i<n;i++) {
            if (!primes[i]){
                for (int j = i*2;j<=n;j+=i) {
                    primes[j] = true;
                }
            }
        }
        for (int i = 2;i<n;i++) {
            if (!primes[i]) {
                c++;
            }
        }
        return c;
    }
}