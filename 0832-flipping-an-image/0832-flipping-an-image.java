class Solution {
    public int[][] flipAndInvertImage(int[][] image) {
        for(int i = 0;i<image.length;i++){
            reverse(image[i]);
            for(int j = 0;j<image[i].length;j++){
                image[i][j] = image[i][j] ^ 1;
            }
        }
        return image;
    }
    void reverse(int[] a){
        int left = 0, right = a.length-1;
        while(left<right){
            int temp = a[left];
            a[left] = a[right];
            a[right] = temp;
            left++;
            right--;
        }
    }
}