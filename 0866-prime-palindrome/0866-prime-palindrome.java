class Solution {
    public int primePalindrome(int n) {
        if (n <= 2) return 2;
        if (n <= 3) return 3;
        if (n <= 5) return 5;
        if (n <= 7) return 7;
        if (n <= 11) return 11;

        // roots up to 5 digits give odd palindromes up to 9 digits
        for (int root = 1; root <= 100000; root++) {
            String s = Integer.toString(root);
            StringBuilder sb = new StringBuilder(s).reverse();
            // mirror, skipping the middle digit -> odd-length palindrome
            long p = Long.parseLong(s + sb.substring(1));
            if (p >= n && isPrime(p)) {
                return (int) p;
            }
        }
        return -1; // never reached
    }

    boolean isPrime(long n) {
        if (n < 2) return false;
        if (n % 2 == 0) return n == 2;
        for (long c = 3; c * c <= n; c += 2) {
            if (n % c == 0) return false;
        }
        return true;
    }
}