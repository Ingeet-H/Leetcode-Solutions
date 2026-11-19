class Solution {
    public String freqAlphabets(String s) {
        StringBuilder sb=new StringBuilder();
        for(int i = 0;i<s.length();i++){
            if((i+2)<s.length()&&(s.charAt(i+2))=='#'){
                sb.append((char)(96+Integer.parseInt(s.substring(i,i+2))));
                i+=2; //not i+=3 since after this i++ also runs
            }
            else
            sb.append((char)(96+(s.charAt(i)-'0'))); //only s.charAt(i) will return 'number' not numeric value so '0' needs to be there;
        }
        return sb.toString();
    }
}