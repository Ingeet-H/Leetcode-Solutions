class Solution {
    public int[] countBits(int n) {
        int[] a = new int[n+1];
        for(int i = 0;i<=n;i++){
            int count = 0;
            int num = i;
            while(num>0){
                count++;
                num = num&(num-1);
            }
            a[i] = count;
        }
        return a;
    }
}