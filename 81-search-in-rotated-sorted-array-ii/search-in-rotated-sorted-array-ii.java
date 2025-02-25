class Solution {
    public boolean search(int[] nums, int target) {
        int n = nums.length;
        int low = 0;
        int high = n-1;
        while(low <= high){
            // Step 1 -> Find Mid
            int mid = low + (high - low) / 2; 
            // Step 2 -> Case if we found target on mid
            if(nums[mid] == target){
                return true;
            }
            // Step 3 -> Case when we have duplicates 
            if(nums[low] == nums[mid] && nums[mid] == nums[high]){
                low++;
                high--;
                continue;
            }
            // Step 4 -> If the left part is soted
            if(nums[low] <= nums[mid]){
                if(target >= nums[low] && target < nums[mid]){
                    high = mid - 1;
                }else{
                    low = mid + 1;
                }
            }
            // Step 5 -> If the right part is sorted
            else{   
                if(target > nums[mid] && target <= nums[high]){
                    low = mid + 1;
                }else{
                    high = mid - 1;
                }
            }
        }
        return false;
    }
}