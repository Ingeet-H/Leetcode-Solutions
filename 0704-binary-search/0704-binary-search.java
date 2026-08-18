class Solution {
    public int search(int[] nums, int target) {
        int low = 0;
        int up = nums.length-1;
        int mid = 0;
        while(low<=up)
        {
            mid = (up+low)/2;
            if(target>nums[mid])
            low = mid+1;
            else if(target<nums[mid])
            up = mid-1;
            else
            return mid;
        }
        return -1;
    }
}