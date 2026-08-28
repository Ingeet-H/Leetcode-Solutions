import java.util.Arrays;
class Solution {
    public int[] shuffle(int[] nums, int n) {
           int[] s=new int[nums.length];
           int x = 0,y = n;
           for(int i = 0;i<nums.length;i++)
           {
               if(i%2==1)
               s[i] = nums[y++];
               else
               s[i] = nums[x++];
           }
           return s;
    }
}