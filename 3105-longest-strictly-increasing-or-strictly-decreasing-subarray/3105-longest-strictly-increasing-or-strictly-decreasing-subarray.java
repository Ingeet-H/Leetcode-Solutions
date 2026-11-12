class Solution {
    public int longestMonotonicSubarray(int[] nums) {
        int max = 1, cinc = 1, cdec = 1;
        for(int i = 1;i<nums.length;i++){
            if(nums[i-1]<nums[i])
            cinc++;
            else
            cinc = 1;
            if(nums[i-1]>nums[i])
            cdec++;
            else
            cdec = 1;
            max = Math.max(max,Math.max(cinc,cdec));
        }
        return max;
    }
}