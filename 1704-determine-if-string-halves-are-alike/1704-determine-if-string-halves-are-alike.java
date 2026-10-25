class Solution {
    public boolean halvesAreAlike(String s) {
        int l = s.length()/2;
        String s1 = s.substring(0,l);
        String s2 = s.substring(l);
        int c1 = 0, c2 = 0;
        for(int i = 0;i<l;i++){
            if("AEIOUaeiou".indexOf(s1.charAt(i))!=-1)
            c1++;
            if("AEIOUaeiou".indexOf(s2.charAt(i))!=-1)
            c2++;
        }
        return (c1==c2);
    }
}