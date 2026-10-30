class Solution {
    public String interpret(String command) {
        String s = "";
        for(int i = 0;i<command.length();i++){
            if(command.charAt(i)=='G')
            s = s + "G";
            if(i+1<command.length()&&command.charAt(i)=='('&&command.charAt(i+1)==')')
            s = s + "o";
            if(i+1<command.length()&&command.charAt(i)=='('&&command.charAt(i+1)=='a')
            s = s + "al";
        }
        return s;
    }
}