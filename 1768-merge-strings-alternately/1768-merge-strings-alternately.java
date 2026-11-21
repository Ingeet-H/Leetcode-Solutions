class Solution {
    public String mergeAlternately(String word1, String word2) {
        StringBuilder s = new StringBuilder();
        int p1 = 0,p2 = 0;
        int l1 = word1.length();
        int l2 = word2.length();
        while(p1!=l1||p2!=l2){
            if(p1!=l1){
                s.append(word1.charAt(p1));
                p1++;
            }
            if(p2!=l2){
                s.append(word2.charAt(p2));
                p2++;
            }
        }
        return s.toString();
    }
}