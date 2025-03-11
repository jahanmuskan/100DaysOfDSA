class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        // HashMap<Integer, Integer> map = new HashMap<>(); 
        // for (int i = 0; i < nums.length; i++) {
        //     if (map.containsKey(nums[i])) {
        //         if (i - map.get(nums[i]) <= k) {
        //             return true;
        //         }
        //     }
        //     map.put(nums[i], i);
        // }
        // return false; 
        HashSet<Integer> set = new HashSet<>();

        for (int i = 0; i < nums.length; i++) {
            if (set.contains(nums[i])) {
                return true; // Found duplicate within range
            }
            set.add(nums[i]);

            // Maintain sliding window of at most k elements
            if (set.size() > k) {
                set.remove(nums[i - k]);
            }
        }

        return false;
    }
}