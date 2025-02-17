package DSA.Day6;

class MajorityElement {
    public int majorityElement(int[] nums) {
        // Boyer-Moore Voting Algorithm
        int count = 0;
        int candidate = 0;
        for (int num : nums) {
            if (count == 0) {   // If count is 0, change the candidate
                candidate = num;
            }
            if (candidate == num) {
                count++;  // Increase count if the current number is the candidate
            } else {
                count--;   // Decrease count
            }
        }
        return candidate;
    }

    public static void main(String[] args) {
        MajorityElement solution = new MajorityElement();
        int[] nums = {3, 2, 3};  // Example input
        int result = solution.majorityElement(nums);
        System.out.println("Majority Element: " + result);
    }
}
