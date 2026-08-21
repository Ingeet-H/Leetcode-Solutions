class Solution {
    public String sortSentence(String s) {
        String p = "";
        String[] a = s.split(" ");//splitting the string into words
        String[] n = new String[a.length];
        for(int i = 0;i<a.length;i++)
        {
            int x = a[i].length()-1;
            int k = a[i].charAt(x);//collecting the character at the end
            k = k - 49;//converting ascii to the integer that it represents
            n[k] = a[i].substring(0,x);
        }
        for(int i = 0;i<a.length;i++)
        {
            p = p + n[i] + " ";//forming new sentence
        }
        return p.trim();
    }
}