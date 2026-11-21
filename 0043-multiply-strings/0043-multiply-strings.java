class Solution {
    public String multiply(String num1, String num2) {
        StringBuilder s = new StringBuilder();
        int l1 = num1.length();
        int l2 = num2.length();
        if((num1.charAt(0)=='0')||(num2.charAt(0)=='0'))
        return "0";
        int[] res = new int[l1+l2];
        for(int i = l1-1;i>=0;i--){
            for(int j = l2-1;j>=0;j--){
                int mul = (num1.charAt(i)-'0')*(num2.charAt(j)-'0');
                int sum = mul + res[i+j+1];
                res[i+j+1] = sum%10;
                res[i+j] += sum/10;
            }
        }
        for(int digit:res){
            if(s.length()==0 && digit==0)
            continue;
            s.append(digit);
        }
        return s.toString();
    }
}