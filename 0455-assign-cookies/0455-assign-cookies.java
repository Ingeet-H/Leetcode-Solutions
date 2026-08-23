import java.util.Arrays;
class Solution {
    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);
        int l = 0, r = 0;
        int m = s.length, n = g.length;
        while(l<m&&r<n)
        {
            if(g[r]<=s[l])
            r++;
            l++;
        }
        return r;
    }
}