class Solution {
    public int lengthOfLastWord(String s) {
        s = s.strip();
        int sp = s.lastIndexOf(' ');
        String ans = s.substring(sp+1);
        return ans.length();
    }
}