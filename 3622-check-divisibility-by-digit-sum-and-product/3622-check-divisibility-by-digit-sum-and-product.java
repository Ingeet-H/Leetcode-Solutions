class Solution {
    public boolean checkDivisibility(int n) {
        int sum = 0,prod = 1;
        int copy = n;
        while(copy>0)
        {
            int r = copy%10;
            sum = sum + r;
            prod = prod*r;
            copy/=10;
        }
        int res = sum + prod;
        return (n%res==0);
    }
}