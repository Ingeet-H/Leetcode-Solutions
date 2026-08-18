class Solution {
    public boolean checkPerfectNumber(int num) {
        int f = 0;
        for(int i = 1;i<num;i++)
        {
            if(num%i==0)
            f = f + i;
        }
        return (f==num);
    }
}