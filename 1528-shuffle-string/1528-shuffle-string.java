class Solution {
    public String restoreString(String s, int[] indices) {
        char[] c = s.toCharArray();
        String st = "";
        int i = 0;
        while(i<indices.length){
            int correct = indices[i];
            if(indices[i]<indices.length&&indices[i]!=indices[correct]){
                int temp1 = indices[i];
                indices[i] = indices[correct];
                indices[correct] = temp1;
                char temp2 = c[i];
                c[i] = c[correct];
                c[correct] = temp2;
            }
            else
            i++;
        }
        return String.valueOf(c);
    }
}