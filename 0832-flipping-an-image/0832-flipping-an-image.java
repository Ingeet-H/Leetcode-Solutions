class Solution {
    public int[][] flipAndInvertImage(int[][] image) {
        for(int i = 0;i<image.length;i++){
            reverse(image[i]);
        }
        return image;
    }
    void reverse(int[] a){
        int left = 0, right = a.length-1;
        while(left<=right){
            int temp = a[left] ^ 1;
            a[left] = a[right] ^ 1;
            a[right] = temp;
            left++;
            right--;
        }
    }
}