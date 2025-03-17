class Solution {
    public int maxArea(int[] height) {
        // int left = 0, right = height.length - 1;
        // int maxArea = 0;
        
        // while (left < right) {
        //     int minHeight = height[left] < height[right] ? height[left++] : height[right--];
        //     maxArea = Math.max(maxArea, minHeight * (right - left + 1));
        // }
        
        // return maxArea;
        int left = 0, right = height.length - 1;
        int maxArea = 0;

        while (left < right) {
            int h = height[left] < height[right] ? height[left++] : height[right--]; 
            int width = right - left + 1;
            int area = h * width;

            if (area > maxArea) {
                maxArea = area;
            }
        }
        return maxArea;
    }
}