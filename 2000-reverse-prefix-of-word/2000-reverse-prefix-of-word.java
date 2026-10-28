class Solution {
    public String reversePrefix(String word, char ch) {
        int index = word.indexOf(ch);
        String ans = reverse(word.substring(0,index+1)) + word.substring(index+1);
        return ans;
    }
    String reverse(String s){
        String p = new StringBuilder(s).reverse().toString();
        return p;
    }
}