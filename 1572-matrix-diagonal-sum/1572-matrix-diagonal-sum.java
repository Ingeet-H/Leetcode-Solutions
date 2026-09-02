class Solution {
    public int diagonalSum(int[][] mat) {
        int sum = 0;
        int n=mat.length-1;
        for(int i=0;i<=n;i++)
        sum = sum+mat[i][i];
        for(int i=0;i<=n;i++){
            if(i!=n-i)
            sum = sum + mat[i][n-i];
        }
        return sum;
    }
}