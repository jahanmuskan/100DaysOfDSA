class Solution {
    public int[] twoSum(int[] nums, int target) {
        // // HashMap to store the numbers and their indices
        HashMap<Integer, Integer> numMap = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            
            if (numMap.containsKey(complement)) {
                return new int[]{numMap.get(complement), i};
            }
            numMap.put(nums[i], i);
        }
        throw new IllegalArgumentException("No solution found");

        // int n = nums.length;
        // int sum = 0;
        // for(int i=0; i<n-1; i++){
        //     sum = nums[i] + nums[i+1];
        //     if(sum == target){
        //         return new int[] {i, i+1}; 
        //     }
        // }
        // return new int[] {-1,-1};
    }
}