class Solution {
    public int searchInsert(int[] nums, int target) {
        int lb=0,ub=nums.length-1,mid;
        boolean isAsc=nums[lb]<nums[ub];
        while(lb<=ub){
            mid = lb + (ub-lb)/2;
            if(target==nums[mid])
            return mid;
            if(isAsc){ //checking the order in which array is sorted and acting accordingly
                if(target<nums[mid])
                ub=mid-1;
                else
                lb=mid+1;
            }
            else{
                 if(target>nums[mid])
                ub=mid-1;
                else
                lb=mid+1;
            }
        }
        int k;
        for(k=0;k<nums.length;k++){
            if(target<nums[k])
            break;
        }
        return k;
    }
}