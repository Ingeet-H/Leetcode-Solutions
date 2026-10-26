class Solution {
    public String reverseWords(String s) {
        String[] rev = s.split(" ");
        String k = "";
        for(int i = 0;i<rev.length;i++){
            k = k + reverse(rev[i]) + " ";
        }
        return k.trim();
    }
    String reverse(String p){
        String x = new StringBuilder(p).reverse().toString();
        return x;
    }
}