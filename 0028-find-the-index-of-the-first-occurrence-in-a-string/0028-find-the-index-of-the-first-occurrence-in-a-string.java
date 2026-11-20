class Solution {
    public int strStr(String haystack, String needle) {
        if(haystack.contains(needle)){
            int l = needle.length();
            for(int i = 0;i<haystack.length();i++){
                if(i+l-1<haystack.length()&&haystack.substring(i,i+l).equals(needle))
                return i;
            }
        }
        return -1;
    }
}