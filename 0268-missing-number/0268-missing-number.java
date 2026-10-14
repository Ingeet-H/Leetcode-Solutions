class Solution {
    public int missingNumber(int[] nums) {
        int x = 0;
        while(x<nums.length){
            int correct = nums[x];
            if(nums[x]<nums.length && nums[x]!=nums[correct]){
                int temp = nums[x];
                nums[x] = nums[correct];
                nums[correct] = temp;
            }
            else
            x++;
        }
        int i = 0;
        for(i=0;i<nums.length;i++){
            if(nums[i]!=i)
            return i;
        }
        return i;
    }
}