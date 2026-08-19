class Solution {
    public String toLowerCase(String s) {
        String w = "";
        for(int i = 0;i<s.length();i++)
        {
            int c = s.charAt(i);
            if(c>=65&&c<=90)
            w = w + (char)(c+32);
            else
            w = w + (char)c;
        }
        return w;
    }
}