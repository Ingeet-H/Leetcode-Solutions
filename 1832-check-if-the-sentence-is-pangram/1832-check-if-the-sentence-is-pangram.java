class Solution {
    public boolean checkIfPangram(String sentence) {
        int[] a=new int[26];
        for(int i = 0;i<sentence.length();i++){
            a[(int)sentence.charAt(i)-97]++;
        }
        for(int i = 0;i<a.length;i++)
        if(a[i]==0)
        return false;
        return true;
    }
}