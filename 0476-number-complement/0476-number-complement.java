class Solution {
    public int findComplement(int num) {
        int nod = (int)(Math.log(num)/Math.log(2)) + 1;
        int mask = (1<<nod) - 1;
        return num^mask;
    }
}