class Solution {
    public boolean isPalindrome(int x) {
        int no = x;
        int v = 0;
        while(no>0){
            int r = no%10;
            v = v*10+r;
            no/=10;
        }
        if(v==x)
        return true;
        else 
        return false;
    }
}