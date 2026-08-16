class Solution {
    public boolean isPalindrome(String s) {
        s = s.toLowerCase();
        String p = "";
        for(int i = 0;i<s.length();i++)
        {
            char ch = s.charAt(i);
            if("abcdefghijklmnopqrstuvwxyz0123456789".indexOf(ch)!=-1)
            p = p + s.charAt(i);
        }
        String wd = "";
        for(int i = 0;i<p.length();i++)
        wd = p.charAt(i) + wd;
        if(wd.equals(p))
        return true;
        else
        return false;
    }
}