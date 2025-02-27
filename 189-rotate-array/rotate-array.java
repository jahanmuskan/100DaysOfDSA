class Solution {
    public static void reverse(int[] nums, int start, int end){
        while(start < end){
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }
    public void rotate(int[] nums, int k) {
       int n = nums.length;
       // To handle single element 
       if (n <= 1) return;
       // To handle case when k is greater than length of the array
       k = k % n; 

       reverse(nums, 0, n-1);
       reverse(nums, 0, k-1);
       reverse(nums, k, n-1);
    }
}