class Solution {
    public int findMin(int[] nums) {
        int p = findPivot(nums);
        //minimum element in the array will be the one right next to pivot
        return nums[p+1];
    }
    int findPivot(int[] a){
        int start = 0, end = a.length-1;
        while(start<=end){
            int mid = start + (end-start)/2;
            if(mid<end&&a[mid]>a[mid+1])
            return mid;
            if(mid>start&&a[mid]<a[mid-1])
            return mid-1;
            if(a[mid]<=a[start])
            end = mid-1;
            else
            start = mid+1;
        }
        return -1;
    }
}